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

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import nl.cwi.cacoj.api.MethodInvocation;

/**
 * This is a simple extension of {@link ThreadPoolExecutor}. It modifies the
 * {@link #beforeExecute(Thread, Runnable)} as the {@link MethodInvocation} is
 * itself an instance of {@link FutureTask}. Also, when the task is ready, we
 * need to connect the {@link MethodInvocation} and {@link InterruptibleThread}
 * together for execution. An instance of {@link InterruptibleThreadFactory} is
 * provided the thread creation factory.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see ThreadPoolExecutor
 * @see ExecutorService
 * @see InterruptibleThreadFactory
 * @see MethodInvocation
 * @see InterruptibleThread
 * 
 **/
public class InterruptibleThreadPoolExecutor extends ThreadPoolExecutor {

	public InterruptibleThreadPoolExecutor(int corePoolSize,
			int maximumPoolSize, long keepAliveTime, TimeUnit unit,
			BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,
				handler);
	}

	public InterruptibleThreadPoolExecutor(int corePoolSize,
			int maximumPoolSize, long keepAliveTime, TimeUnit unit,
			BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory,
			RejectedExecutionHandler handler) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,
				threadFactory, handler);
	}

	public InterruptibleThreadPoolExecutor(int corePoolSize,
			int maximumPoolSize, long keepAliveTime, TimeUnit unit,
			BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,
				threadFactory);
	}

	public InterruptibleThreadPoolExecutor(int corePoolSize,
			int maximumPoolSize, long keepAliveTime, TimeUnit unit,
			BlockingQueue<Runnable> workQueue) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
	}

	public InterruptibleThreadPoolExecutor(ThreadFactory factory) {
		this(1, 1024 * 1024, 1L, TimeUnit.NANOSECONDS,
				new SynchronousQueue<Runnable>(), factory);
		allowCoreThreadTimeOut(true);
	}

//	private Lock l = new ReentrantLock();
//	private Condition c = l.newCondition();
//	private AtomicBoolean running = new AtomicBoolean(false);
	
	private Lock l2 = new ReentrantLock();
	private Condition c2 = l2.newCondition();
	private AtomicBoolean full = new AtomicBoolean(false);

	@Override
	protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
		if (callable instanceof MethodInvocation) {
			return (FutureTask<T>) callable;
		}
		return super.newTaskFor(callable);
	}

	protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T value) {
		if (runnable instanceof MethodInvocation) {
			return (FutureTask) runnable;
		}
		return super.newTaskFor(runnable, value);
	}
	
	@Override
	public Future<?> submit(Runnable r) {
//		System.out.println("submitting");
		if (r instanceof MethodInvocation) {
			try {
				l2.lock();
				while (!full.compareAndSet(false, true)) {
					c2.await();
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
				l2.unlock();
			} finally {
				l2.unlock();
			}
		}
//		System.out.println(full.get() + "FFF!");
		return super.submit(r);
	}
	
	@Override
	protected void beforeExecute(Thread t, Runnable r) {
		super.beforeExecute(t, r);
		if (r instanceof MethodInvocation) {
			try {
//				l.lock();
//				while (!running.compareAndSet(false, true)) {
//					c.await();
//				}
				InterruptibleThread it = (InterruptibleThread) t;
				it.setMethodInvocation((MethodInvocation) r);
				((MethodInvocation) r).setOwnerThread(it);
//				System.out.println(running.get() + "!");
			} catch (Exception e) {
				System.err.println(e.getMessage());
//				l.unlock();
			} finally {
//				l.unlock();
			}
		}
	}

	@Override
	protected void afterExecute(Runnable r, Throwable t) {
//		System.out.println("after exec");
		if (r instanceof MethodInvocation) {
			try {
//				l.lock();
//				running.getAndSet(false);
//				System.out.println("-" + running.get());
//				c.signalAll();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			} finally {
//				l.unlock();
			}
			try {
				l2.lock();
				full.getAndSet(false);
//				System.out.println("----" + full.get());
				c2.signalAll();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			} finally {
				l2.unlock();
			}
		}
		super.afterExecute(r, t);
	}

}
