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
public class PersonaEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listPersona")
	public CollectionResponse<Persona> listPersona(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<Persona> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from Persona as Persona");
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				query.setHint(JPACursorHelper.CURSOR_HINT, cursor);
			}

			if (limit != null) {
				query.setFirstResult(0);
				query.setMaxResults(limit);
			}

			execute = (List<Persona>) query.getResultList();
			cursor = JPACursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Persona obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Persona> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getPersona")
	public Persona getPersona(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		Persona persona = null;
		try {
			persona = mgr.find(Persona.class, id);
		} finally {
			mgr.close();
		}
		return persona;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param persona the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertPersona")
	public Persona insertPersona(Persona persona) {
		EntityManager mgr = getEntityManager();
		try {
			if (containsPersona(persona)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(persona);
		} finally {
			mgr.close();
		}
		return persona;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param persona the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updatePersona")
	public Persona updatePersona(Persona persona) {
		EntityManager mgr = getEntityManager();
		try {
			if (!containsPersona(persona)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(persona);
		} finally {
			mgr.close();
		}
		return persona;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removePersona")
	public void removePersona(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			Persona persona = mgr.find(Persona.class, id);
			mgr.remove(persona);
		} finally {
			mgr.close();
		}
	}

	private boolean containsPersona(Persona persona) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			Persona item = mgr.find(Persona.class, persona.getId_Persona());
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
