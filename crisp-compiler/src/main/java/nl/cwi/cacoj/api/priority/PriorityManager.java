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
 * Priority manager introduces a mechanism to determine a final priority to a
 * method invocation possibly carrying a set of {@link Priority} values. The
 * final priority may be used by an instance of a {@link SchedulingManager} to
 * choose the next method invocation to be executed.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see SchedulingManager
 * @see Priority
 * 
 **/
public interface PriorityManager {

	/**
	 * Determines the final resolved priority of the method invocation if it
	 * carries the priority values.
	 * 
	 * @param mi
	 *            the method invocation with possible priority values
	 * @return the final resolved priority value
	 */
	Priority resolve(MethodInvocation<?> mi);

}
