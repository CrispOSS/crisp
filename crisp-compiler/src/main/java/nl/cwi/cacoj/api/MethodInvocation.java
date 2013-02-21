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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import nl.cwi.cacoj.api.concurrent.Interruptible;
import nl.cwi.cacoj.api.concurrent.InterruptibleThread;
import nl.cwi.cacoj.api.priority.Prioritizable;
import nl.cwi.cacoj.api.priority.Priority;

/**
 * Method invocation is the central data structure used by {@link ActiveObject}s
 * to send messages to other active objects. It encapsulate the caller object
 * and the parent method invocation if required.
 * 
 * Additionally, before starting the execution of {@link #run()}, it gets aware
 * of the corresponding {@link InterruptibleThread}. The co-relation helps to
 * preserve the executing thread during "awaits" so that the method invocation
 * may continue the execution with the same state. It implements
 * {@link Interruptible} and delegates the behavior to the underlying thread.
 * 
 * This class is planned to support priorities in future, however, currently it
 * only provides the properties and methods; it implements {@link Prioritizable}
 * .
 * 
 * Subclassing {@link FutureTask} helps it to be a wrapper for the actual method
 * call for the active object. It exposes all the feature from its super class.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see FutureTask
 * @see Interruptible
 * @see InterruptibleThread
 * @see Prioritizable
 * @see ActiveObject
 * 
 **/
public class MethodInvocation<V> extends FutureTask<V> implements Interruptible, Prioritizable {

	protected ActiveObject owner;
	protected MethodInvocation<V> parentMethodInvocation;

	private Lock suspendLock = new ReentrantLock();
	private Lock freeLock = new ReentrantLock();
	private boolean isSuspended = false;
	private InterruptibleThread ownerThread;

	protected List<Priority> priorities;
	protected Priority resolvedPriority;

	protected MethodInvocationMetaData metadata;

	protected final Long timestamp = System.currentTimeMillis();
	protected Long responseTimeout = 10000L;
	protected final Long id = Cacoj.getNextMethodInvocationId();

	public MethodInvocation(Callable<V> callable, ActiveObject owner) {
		super(callable);
		this.owner = owner;
	}

	public MethodInvocation(Callable<V> callable, MethodInvocation<V> parentMethodInvocation) {
		super(callable);
		this.parentMethodInvocation = parentMethodInvocation;
	}

	public MethodInvocation(Runnable runnable, V result) {
		super(runnable, result);
	}

	@Override
	public void run() {
		try {
			super.run();
//			this.ownerThread.join();
			this.ownerThread.setMethodInvocation(null);
			setOwnerThread(null);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean await() throws RuntimeException {
		try {
			suspendLock.lock();
			isSuspended = true;
			ownerThread.await();
			return true;
		} finally {
			suspendLock.unlock();
		}
	}

	@Override
	public boolean signal() throws RuntimeException {
		try {
			freeLock.lock();
			isSuspended = false;
			ownerThread.signal();
		} finally {
			freeLock.unlock();
		}
		return true;
	}

	@Override
	public void addPriority(Priority priority) {
		if (null == priorities) {
			priorities = new ArrayList<Priority>();
		}
		priorities.add(priority);
	}

	@Override
	public List<Priority> getPriorities() {
		return this.priorities;
	}

	@Override
	public void setResolvedPriority(Priority priority) {
		this.resolvedPriority = priority;
	}

	@Override
	public Priority getResolvedPriority() {
		return this.resolvedPriority;
	}

	/**
	 * Checks whether the current method invocation is suspended; i.e. awaiting.
	 * 
	 * @return {@code true} if the instance is awaiting; otherwise {@code false}
	 *         .
	 */
	public boolean isSuspended() {
		return isSuspended;
	}

	/**
	 * Before delegating to {@link #run()}, this method is used to announce the
	 * {@link InterruptibleThread} that this instance will run in.
	 * 
	 * @param it
	 *            The corresponding {@link InterruptibleThread} for this
	 *            instance.
	 */
	public void setOwnerThread(InterruptibleThread it) {
		this.ownerThread = it;
	}

	/**
	 * Initializes {@link MethodInvocationMetaData} for this instance. It will
	 * carry the data for the current call.
	 * 
	 * @param methodName
	 *            the actual method name as {@code String}
	 * @param callerName
	 *            the name of the caller
	 * @param params
	 *            parameters of the method call
	 */
	public void initMetaData(String methodName, String callerName, Object... params) {
		metadata = new MethodInvocationMetaData();
		metadata.methodName = methodName;
		if (params != null) {
			for (Object p : params) {
				metadata.addActualParameter(p);
			}
		}
	}

	/**
	 * Gives the created time of the method invocation. Each method invocation
	 * uses {@link System#currentTimeMillis()} to initialize this value.
	 * 
	 * @return the time this method invocation was created as specified in
	 *         {@link System#currentTimeMillis()}
	 */
	public Long getCreatedTime() {
		return timestamp;
	}

	/**
	 * Gets the time in which the result for this method invocation is expected
	 * to be ready. It is expressed in milliseconds and is measured from the
	 * origin of the creation time of the method invocation.
	 * 
	 * @return the milliseconds for the expected time of the result
	 */
	public Long getResponseTimeout() {
		return responseTimeout;
	}

	/**
	 * Sets the expected time in which from the creation time of the method
	 * invocation the result should be ready.
	 * 
	 * @param responseTimeout
	 */
	public void setResponseTimeout(Long responseTimeout) {
		this.responseTimeout = responseTimeout;
	}

	/**
	 * Gets the unique identifier of the method invocation.
	 * 
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets the {@link MethodInvocationMetaData} instance of this method
	 * invocation.
	 * 
	 * @return an instance of {@link MethodInvocationMetaData}.
	 */
	public MethodInvocationMetaData getMetaData() {
		return metadata;
	}

	/**
	 * A data structure to hold the meta data about a method call. It is used
	 * for each {@link MethodInvocation} to hold the parameters. It can be used
	 * by priority management or scheduling management to make decisions based
	 * on the actual parameters.
	 * 
	 * @author Behrooz Nobakht
	 * @since 1.0
	 * 
	 **/
	public static class MethodInvocationMetaData {

		private final List<Object> parameters = new ArrayList<Object>();
		private String methodName;

		public List<Object> getActualParameters() {
			return parameters;
		}

		public String getMethodName() {
			return methodName;
		}

		private void addActualParameter(Object o) {
			parameters.add(o);
		}

	}
}
