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
package nl.cwi.cacoj.api;

import java.util.concurrent.ExecutorService;

import nl.cwi.cacoj.api.processstore.AbstractProcessStore;
import nl.cwi.cacoj.api.processstore.ProcessStoreAware;

/**
 * An active object is a concurrent one that accepts method invocations in an
 * asynchronous fashion to be executed in future. It encapsulates an instance of
 * {@link ExecutorService} and one of {@link AbstractProcessStore} to manage the
 * concurrency properties. It implements {@link Runnable} such that in a loop in
 * this context, it responds to the messages requested from other active
 * objects.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see ProcessStoreAware
 * @see Runnable
 * @see ExecutorService
 * 
 **/
public interface ActiveObject extends ProcessStoreAware, Runnable {

	/**
	 * A way to initialize the active object. It usually may mean a call to
	 * {@link ExecutorService#submit(Runnable)} with {@code this} object.
	 */
	void init();

	/**
	 * Issues a shutdown request to the active object that is delegated to
	 * {@link ExecutorService#shutdown()}.
	 */
	void shutdown();
	
	Class getPriorityManagerClass(String methodName);
	
	boolean hasMethodLevelPriorities();

}
