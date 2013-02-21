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
package nl.cwi.cacoj.api.concurrent;

import nl.cwi.cacoj.api.MethodInvocation;

/**
 * Interruptible introduces the behavior of awaiting and signalling for the
 * concurrent {@link MethodInvocation}s. A method invocation needs to be able to
 * {{@link #await()} and {@link #signal()} based on the runtime conditions.
 * Currently, the {@link MethodInvocation} implements this feature by delegating
 * the behavior to the corresponding {@link InterruptibleThread}.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see MethodInvocation
 * @see InterruptibleThread
 * 
 **/
public interface Interruptible {

	/**
	 * Awaits based on some condition during the execution. The condition
	 * depends on the user or the implementation details.
	 * 
	 * @return should return {@code true} if awaiting was successful; otherwise
	 *         {@code false}.
	 * @throws RuntimeException
	 *             May encapsulate the underlying exception.
	 */
	boolean await() throws RuntimeException;

	/**
	 * Signals the corresponding {@link MethodInvocation} to continue the
	 * execution.
	 * 
	 * @return {@code true} if the signaling was successful.
	 * @throws RuntimeException
	 *             May encapsulate the underlying exception.
	 */
	boolean signal() throws RuntimeException;

}
