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
package nl.cwi.cacoj.api.priority;

import nl.cwi.cacoj.api.MethodInvocation;

import org.apache.log4j.Logger;

/**
 * An abstract base implementation for scheduling manager such that the
 * subclasses only have to implement
 * {@link #isPrior(MethodInvocation, MethodInvocation)}.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see SchedulingManager
 * 
 **/
public abstract class AbstractSchedulingManager implements SchedulingManager {

	protected final Logger logger = Logger.getLogger(getClass());

	@Override
	public int compare(MethodInvocation<?> o1, MethodInvocation<?> o2) {
		Boolean prior = isPrior(o1, o2);
		return prior == null ? 0 : prior ? 1 : -1;
	}

	@Override
	public void beforeExecute(MethodInvocation<?> mi) {
	}

}
