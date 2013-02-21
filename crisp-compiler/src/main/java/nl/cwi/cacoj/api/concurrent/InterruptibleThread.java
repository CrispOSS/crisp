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

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import nl.cwi.cacoj.api.MethodInvocation;

/**
 * This is an extension to {@link Thread} to implement
 * {@link InterruptibleThread} in a concurrent fashion. It uses an instance of
 * {@link ReentrantLock} to control the awaiting and signaling action introduced
 * by {@link Interruptible}. It also holds a reference to the corresponding
 * {@link MethodInvocation}.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see Interruptible
 * @see MethodInvocation
 * 
 **/
public class InterruptibleThread extends Thread implements Interruptible {

	private Lock awaitLock = new ReentrantLock();
	private Condition blockedCondition = awaitLock.newCondition();
	private MethodInvocation<?> mi;

	public InterruptibleThread() {
		super();
	}

	public InterruptibleThread(Runnable target, String name) {
		super(target, name);
	}

	public InterruptibleThread(Runnable target) {
		super(target);
	}

	public InterruptibleThread(String name) {
		super(name);
	}

	public InterruptibleThread(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
	}

	public InterruptibleThread(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
	}

	public InterruptibleThread(ThreadGroup group, Runnable target) {
		super(group, target);
	}

	public InterruptibleThread(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public boolean await() throws RuntimeException {
		try {
			awaitLock.lock();
			while (this.mi.isSuspended())
				blockedCondition.await();
		} catch (InterruptedException e) {
			interrupt();
		} finally {
			awaitLock.unlock();
		}
		return false;
	}

	@Override
	public boolean signal() throws RuntimeException {
		try {
			awaitLock.lock();
			blockedCondition.signalAll();
		} finally {
			awaitLock.unlock();
		}
		return false;
	}

	public void setMethodInvocation(MethodInvocation<?> mi) {
		this.mi = mi;
	}

	@Override
	public void interrupt() {
		System.out.println(this.getName() + " : Interruped");
		super.interrupt();
	}
	
}
