/*
 *
 * Copyright (C) 2010-2011
 *
 * Cacoj is licensed under a
 *
 * 		Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License
 *
 * available at
 *
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 *
 * Cacoj is developed at Centrum Wiskunde en Informatica (CWI)
 * in the Netherlands and is available at
 *
 *  	http://sourceforge.net/apps/trac/cacoj
 *
 * for further information.
 *
 */
package nl.cwi.cacoj.api.processstore;

import nl.cwi.cacoj.api.ActiveObject;

/**
 * It introduces active objects that maintain an instance
 * {@link ProcessStore}. It is used by other objects to retrieve the
 * process store for message storage of the target object.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see ProcessStore
 * @see AbstractProcessStore
 * @see ActiveObject
 * 
 **/
public interface ProcessStoreAware {

	/**
	 * Retrieves the underlying instance of process stores used.
	 * 
	 * @return an instance of {@link AbstractProcess}
	 */
	ProcessStore getProcessStore();

}
