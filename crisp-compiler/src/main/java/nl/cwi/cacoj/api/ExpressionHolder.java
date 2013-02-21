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

/**
 * A simple dynamic interface to be used to pass a runtime holder for a boolean
 * expression so that {@link SignalAction} may use to check through time if the
 * condition of signalling the awaiting {@link MethodInvocation} is ready or
 * not. This interface is usually used in an anonymous inner class fashion.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see SignalAction
 * @see MethodInvocation
 * 
 **/
public interface ExpressionHolder {

	/**
	 * The implementation of this method will contain references to the
	 * expression that evaluates to a {@link Boolean} value that holds the
	 * condition when a {@link MethodInvocation} may continue its execution.
	 * 
	 * @return a {@code boolean} value based on some expression
	 */
	Boolean getValue();

}
