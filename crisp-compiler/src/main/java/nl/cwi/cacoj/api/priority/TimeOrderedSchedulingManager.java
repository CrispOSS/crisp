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

/**
 * An implementation of {@link SchedulingManager} that chooses the next method
 * invocation based on the earliest creation time of the
 * {@link MethodInvocation}. The constructor
 * {@link #TimeOrderedSchedulingManager(boolean)} can be used to reverse the
 * order as LIFO-based.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see SchedulingManager
 * 
 **/
public class TimeOrderedSchedulingManager extends AbstractSchedulingManager {

	private boolean lifo = false;

	/**
	 * @see #TimeOrderedSchedulingManager(boolean)
	 */
	public TimeOrderedSchedulingManager() {
	}

	/**
	 * By default, this classes uses FIFO approach for creation time of the
	 * method invocation. It may be changed to LIFO through this constructor.
	 * 
	 * @param lifo
	 *            a boolean value whether use LIFO approach
	 */
	public TimeOrderedSchedulingManager(boolean lifo) {
		this.lifo = lifo;
	}

	@Override
	public Boolean isPrior(MethodInvocation<?> mi1, MethodInvocation<?> mi2) {
		Long t1 = mi1.getCreatedTime();
		Long t2 = mi2.getCreatedTime();
		boolean prior = t1 <= t2;
		logger.debug("Time ordered comparing: (" + t1 + ", " + t2 + ")");
		return lifo ? prior : !prior;
	}

}
