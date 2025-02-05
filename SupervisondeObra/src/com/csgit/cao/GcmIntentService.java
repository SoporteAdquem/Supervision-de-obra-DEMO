package com.csgit.cao;

import android.accounts.Account;
import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.csgit.cao.accountmanager.Account_Constantes;
import com.csgit.cao.controllers.Act_Main;
import com.csgit.cao.utils.Utl_Constantes;
import com.google.android.gms.gcm.GoogleCloudMessaging;

public class GcmIntentService extends IntentService{

	private SharedPreferences preferences;
	
	public GcmIntentService(){
		super("GcmIntentService");
	}
	
	public GcmIntentService(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	String TAG = "GCM";
	public static final int NOTIFICATION_ID = 1;
	private NotificationManager mNotificationManager;
	NotificationCompat.Builder builder;

	@Override
	protected void onHandleIntent(Intent intent) {
		// TODO Auto-generated method stub
		Bundle extras = intent.getExtras();
		GoogleCloudMessaging gcm = GoogleCloudMessaging.getInstance(this);
		// The getMessageType() intent parameter must be the intent you received
        // in your BroadcastReceiver.
        String messageType = gcm.getMessageType(intent);
        
        if(!extras.isEmpty()){// has effect of unparcelling Bundle
        	/*
             * Filter messages based on message type. Since it is likely that GCM
             * will be extended in the future with new message types, just ignore
             * any message types you're not interested in, or that you don't
             * recognize.
             */
        	if(GoogleCloudMessaging.MESSAGE_TYPE_SEND_ERROR.equals(messageType)){
        		sendNotification("Send error: " + extras.toString());
        	}else if (GoogleCloudMessaging.
                    MESSAGE_TYPE_DELETED.equals(messageType)) {
                sendNotification("Deleted messages on server: " +
                        extras.toString());
            // If it's a regular GCM message, do some work.
            }else if (GoogleCloudMessaging.
                    MESSAGE_TYPE_MESSAGE.equals(messageType)) {
                // This loop represents the service doing some work.
//                for (int i=0; i<5; i++) {
//                    Log.i(TAG, "Working... " + (i+1)
//                            + "/5 @ " + SystemClock.elapsedRealtime());
//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException e) {
//                    }
//                }
            	preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            	Bundle settingsBundle =  new Bundle();
        		settingsBundle.putBoolean(ContentResolver.SYNC_EXTRAS_MANUAL, true);
        		settingsBundle.putBoolean(ContentResolver.SYNC_EXTRAS_EXPEDITED, true);
        		Account account = new Account(preferences.getString(
        				Utl_Constantes.PRE_ACCOUNT_NAME, ""), Account_Constantes.ACC_VAL_ACCOUNT_TYPE);
        		
        		ContentResolver.requestSync(account, Account_Constantes.AUTHORITY, settingsBundle);
        		
                Log.i(TAG, "Completed work @ " + SystemClock.elapsedRealtime());
                // Post notification of received message.
                sendNotification("Received: " + extras.toString());
                Log.i(TAG, "Received: " + extras.toString());
            }
        }
     // Release the wake lock provided by the WakefulBroadcastReceiver.
        GcmBroadcastReceiver.completeWakefulIntent(intent);
	}
	
	// Put the message into a notification and post it.
    // This is just one simple example of what you might choose to do with
    // a GCM message.
    private void sendNotification(String msg) {
        mNotificationManager = (NotificationManager)
                this.getSystemService(Context.NOTIFICATION_SERVICE);

        PendingIntent contentIntent = PendingIntent.getActivity(this, 0,
                new Intent(this, Act_Main.class), 0);

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this)
        .setSmallIcon(R.drawable.ic_stat_gcm)
        .setContentTitle("GCM Notification")
        .setStyle(new NotificationCompat.BigTextStyle()
        .bigText(msg))
        .setContentText(msg);

        mBuilder.setContentIntent(contentIntent);
        mNotificationManager.notify(NOTIFICATION_ID, mBuilder.build());
    }

}
