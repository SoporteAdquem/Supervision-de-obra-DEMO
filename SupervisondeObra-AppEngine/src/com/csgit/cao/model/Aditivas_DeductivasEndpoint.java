package com.csgit.cao.model;

import com.csgit.cao.Constants;
import com.csgit.cao.EMF;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JPACursorHelper;

import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
@Api(name = "communicationchannel", namespace = @ApiNamespace(ownerDomain = "csgit.com", ownerName = "csgit.com", packagePath = "cao.model"), clientIds = {
	Constants.WEB_CLIENT_ID, Constants.ANDROID_CLIENT_ID,
	Constants.IOS_CLIENT_ID }, audiences = { Constants.ANDROID_AUDIENCE }, version = "v1")
public class Aditivas_DeductivasEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listAditivas_Deductivas")
	public CollectionResponse<Aditivas_Deductivas> listAditivas_Deductivas(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<Aditivas_Deductivas> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr
					.createQuery("select from Aditivas_Deductivas as Aditivas_Deductivas");
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				query.setHint(JPACursorHelper.CURSOR_HINT, cursor);
			}

			if (limit != null) {
				query.setFirstResult(0);
				query.setMaxResults(limit);
			}

			execute = (List<Aditivas_Deductivas>) query.getResultList();
			cursor = JPACursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Aditivas_Deductivas obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Aditivas_Deductivas> builder()
				.setItems(execute).setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getAditivas_Deductivas")
	public Aditivas_Deductivas getAditivas_Deductivas(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		Aditivas_Deductivas aditivas_deductivas = null;
		try {
			aditivas_deductivas = mgr.find(Aditivas_Deductivas.class, id);
		} finally {
			mgr.close();
		}
		return aditivas_deductivas;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param aditivas_deductivas the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertAditivas_Deductivas")
	public Aditivas_Deductivas insertAditivas_Deductivas(
			Aditivas_Deductivas aditivas_deductivas) {
		EntityManager mgr = getEntityManager();
		try {
			if (containsAditivas_Deductivas(aditivas_deductivas)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(aditivas_deductivas);
		} finally {
			mgr.close();
		}
		return aditivas_deductivas;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param aditivas_deductivas the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateAditivas_Deductivas")
	public Aditivas_Deductivas updateAditivas_Deductivas(
			Aditivas_Deductivas aditivas_deductivas) {
		EntityManager mgr = getEntityManager();
		try {
			if (!containsAditivas_Deductivas(aditivas_deductivas)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(aditivas_deductivas);
		} finally {
			mgr.close();
		}
		return aditivas_deductivas;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeAditivas_Deductivas")
	public void removeAditivas_Deductivas(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			Aditivas_Deductivas aditivas_deductivas = mgr.find(
					Aditivas_Deductivas.class, id);
			mgr.remove(aditivas_deductivas);
		} finally {
			mgr.close();
		}
	}

	private boolean containsAditivas_Deductivas(
			Aditivas_Deductivas aditivas_deductivas) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			Aditivas_Deductivas item = mgr.find(Aditivas_Deductivas.class,
					aditivas_deductivas.getId_AditivasDeductivas());
			if (item == null) {
				contains = false;
			}
		} finally {
			mgr.close();
		}
		return contains;
	}

	private static EntityManager getEntityManager() {
		return EMF.get().createEntityManager();
	}

}
