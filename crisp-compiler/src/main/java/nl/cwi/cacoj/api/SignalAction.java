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

import java.util.concurrent.Callable;

import nl.cwi.cacoj.api.processstore.AbstractProcessStore;
import nl.cwi.cacoj.api.processstore.ProcessStoreAware;

/**
 * This class encapsulates an event-based mechanism to signal the awaiting
 * {@link MethodInvocation}. When the original {@link MethodInvocation} starts
 * to await, it queue one instance in the {@link AbstractProcessStore} of the
 * active object such that it will become active some time in the future. It
 * checks the condition through {@link ExpressionHolder} to control whether it
 * is satisfied for execution again. If yes, it signals the original
 * {@link MethodInvocation}; otherwise it again stores another copy of itself
 * into the active object's message queue.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see MethodInvocation
 * @see ExpressionHolder
 * @see ActiveObject
 * @see AbstractProcessStore
 * @see Callable
 * 
 **/
public class SignalAction implements Callable {

	private MethodInvocation originalMI;
	private ExpressionHolder expressionHolder;
	private ProcessStoreAware executor;

	public SignalAction(final MethodInvocation originalMI, final ExpressionHolder expressionHolder,
			final ProcessStoreAware executor) {
		this.originalMI = originalMI;
		this.expressionHolder = expressionHolder;
		this.executor = executor;
	}

	public Object call() throws Exception {
		if (this.expressionHolder.getValue()) {
			this.originalMI.signal();
		} else {
//			Thread.sleep(3000);
			this.executor.getProcessStore().add(copy());
		}
		return null;
	}

	private MethodInvocation copy() {
		MethodInvocation mi = new MethodInvocation(this, originalMI);
		return mi;
	}

}
