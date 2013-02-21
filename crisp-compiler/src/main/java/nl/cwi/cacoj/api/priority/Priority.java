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

/**
 * It defines the concept of a priority as a {@link Number} that can be assigned
 * to messages or method calls.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see Prioritizable
 * @see PriorityManager
 * 
 **/
public interface Priority {

	/**
	 * The corresponding value as the priority. The value depends on the
	 * internal representation of the priority range used by the active object.
	 * 
	 * @return a number as the priority of the method invocation
	 */
	Number getValue();

}
