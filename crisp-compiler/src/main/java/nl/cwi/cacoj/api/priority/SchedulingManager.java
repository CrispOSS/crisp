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

import java.util.Comparator;

import nl.cwi.cacoj.api.MethodInvocation;
import nl.cwi.cacoj.api.processstore.AbstractProcessStore;
import nl.cwi.cacoj.api.processstore.ProcessStore;

/**
 * Scheduling manager is used with {@link ProcessStore} to determine the order
 * in which the {@link MethodInvocation}'s should be processed by the active
 * object. It may also intercept the execution in circumstances such as time
 * deadlines for the message's response. Scheduling manager may use priorities
 * determined by {@link PriorityManager}.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see AbstractProcessStore
 * @see AbstractSchedulingManager
 * @see MethodInvocation
 * @see PriorityManager
 * 
 **/
public interface SchedulingManager extends Comparator<MethodInvocation<?>> {

	/**
	 * Should determine which method invocation is prior to the other.
	 * 
	 * @param mi1
	 *            the first method invocation
	 * @param mi2
	 *            the second method invocation
	 * @return {@code true} if {@code mi1} is prior; {@code false} otherwise.
	 */
	Boolean isPrior(MethodInvocation<?> mi1, MethodInvocation<?> mi2);

	/**
	 * When method invocation instance in fetched through
	 * {@link AbstractProcessStore#take()}, it is first provided to this method
	 * before the actual execution such that extra provisions could be taken
	 * through the scheduling manager instance.
	 * 
	 * @param mi
	 *            the method invocation to be executed
	 */
	void beforeExecute(MethodInvocation<?> mi);

}
