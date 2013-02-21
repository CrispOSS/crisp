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
 * An implementation of {@link PriorityManager} that prioritizes method
 * invocation based on the requested response time of the method invocation.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see PriorityManager
 * 
 **/
public class ResponseTimePriorityManager implements PriorityManager {

	@Override
	public Priority resolve(final MethodInvocation<?> mi) {
		return new Priority() {
			@Override
			public Number getValue() {
				return mi.getResponseTimeout();
			}
		};
	}

}
