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

import java.util.concurrent.atomic.AtomicLong;

/**
 * A utility class for different purposes.
 * 
 * @author Behrooz Nobakht
 * 
 **/
public class Cacoj {

	private static final AtomicLong miId = new AtomicLong(0);

	/**
	 * Generates a sequence of method invocation ID numbers atomically.
	 * 
	 * @return a {@code Long} value as the ID
	 */
	static Long getNextMethodInvocationId() {
		long id = miId.incrementAndGet();
		return id;
	}

}
