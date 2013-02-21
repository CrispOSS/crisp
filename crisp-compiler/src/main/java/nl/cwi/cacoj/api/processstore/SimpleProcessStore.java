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
import nl.cwi.cacoj.api.priority.PriorityManager;
import nl.cwi.cacoj.api.priority.SchedulingManager;

/**
 * This class is the simple extension for the {@link AbstractProcessStore} with
 * no customization.
 * 
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see AbstractProcessStore
 * 
 **/
public class SimpleProcessStore extends AbstractProcessStore {

	public SimpleProcessStore(ActiveObject owner) {
		super(owner);
	}

	public SimpleProcessStore(ActiveObject owner,
			PriorityManager priorityManager, SchedulingManager schedulingManager) {
		super(owner, priorityManager, schedulingManager);
	}

}
