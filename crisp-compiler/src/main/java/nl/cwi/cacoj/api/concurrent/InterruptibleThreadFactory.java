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

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.log4j.Logger;

import nl.cwi.cacoj.api.ActiveObject;

/**
 * This is an implementation for {@link ThreadFactory} to provide two things.
 * First, provide a fresh {@link ThreadGroup} for each {@link ActiveObject}.
 * Second, to create {@link InterruptibleThread} upon factory call instead of
 * {@link Thread}. It is used by {@link InterruptibleThreadPoolExecutor}.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see InterruptibleThreadPoolExecutor
 * 
 **/
public class InterruptibleThreadFactory implements ThreadFactory {

	private final Logger logger = Logger.getLogger(getClass());

	private ActiveObject owner;
	private ThreadGroup group;
	private final AtomicInteger counter = new AtomicInteger(1);
	private String groupPrefix;


	public InterruptibleThreadFactory(ActiveObject owner) {
		SecurityManager sm = System.getSecurityManager();
		ThreadGroup parent = sm != null ? sm.getThreadGroup() : Thread.currentThread()
				.getThreadGroup();
		this.owner = owner;
		group = new ThreadGroup(parent, this.hashCode() + "");
		groupPrefix = this.owner.getClass().getName() + "-" + group.getName() + "-thread-";
	}

	@Override
	public Thread newThread(Runnable r) {
		String threadName = groupPrefix + counter.getAndIncrement();
		InterruptibleThread it = new InterruptibleThread(group, r, threadName, 0);
		it.setDaemon(false);
		it.setPriority(Thread.NORM_PRIORITY);
		logger.debug("Created thread: " + threadName);
//		System.out.println("Created thread: " + counter.get());
		return it;
	}

}
