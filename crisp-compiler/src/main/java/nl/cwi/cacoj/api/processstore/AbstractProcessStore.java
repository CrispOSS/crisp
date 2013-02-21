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
package nl.cwi.cacoj.api.processstore;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

import nl.cwi.cacoj.api.ActiveObject;
import nl.cwi.cacoj.api.MethodInvocation;
import nl.cwi.cacoj.api.priority.Priority;
import nl.cwi.cacoj.api.priority.PriorityManager;
import nl.cwi.cacoj.api.priority.SchedulingManager;

import org.apache.log4j.Logger;

/**
 * A base abstract implementation for the process store of an
 * {@link ActiveObject}. It provides the concurrent features of
 * {@link LinkedBlockingQueue} to encapsulate some concerns from the user.
 * 
 * It provides {@link #preAdd(MethodInvocation)} and
 * {@link #postAdd(MethodInvocation, boolean)} to customize the adding a message
 * to the process store for subclasses. The same happens when {@link #take()} is
 * called.
 * 
 * It uses an instance {@link PriorityManager} to resolve a final priority of
 * the incoming {@link MethodInvocation}.
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see LinkedBlockingQueue
 * @see PriorityManager
 * @see ActiveObject
 * 
 **/
public abstract class AbstractProcessStore implements ProcessStore {

	protected final Logger logger = Logger.getLogger(getClass());

	protected BlockingQueue<MethodInvocation<?>> q;
	protected PriorityManager priorityManager;
	protected SchedulingManager schedulingManager;

	protected ActiveObject owner;

	public AbstractProcessStore(ActiveObject owner) {
		this.owner = owner;
		this.q = initQ(null, null);
	}

	public AbstractProcessStore(int capacity, PriorityManager priorityManager) {
		this.priorityManager = priorityManager;
		this.q = initQ(priorityManager, null);
	}

	public AbstractProcessStore(ActiveObject owner,
			PriorityManager priorityManager, SchedulingManager schedulingManager) {
		this.owner = owner;
		this.priorityManager = priorityManager;
		this.schedulingManager = schedulingManager;
		this.q = initQ(priorityManager, schedulingManager);
	}

	protected BlockingQueue<MethodInvocation<?>> initQ(PriorityManager pm,
			SchedulingManager sm) {
		if (pm == null || !owner.hasMethodLevelPriorities()) {
			return new LinkedBlockingQueue<MethodInvocation<?>>();
		} else {
			if (sm == null) {
				return new PriorityBlockingQueue<MethodInvocation<?>>();
			} else {
				return new PriorityBlockingQueue<MethodInvocation<?>>(1024, sm);
			}
		}
	}

	@Override
	public boolean add(MethodInvocation<?> e) {
		preAdd(e);
		boolean added = q.add(e);
		logger.debug("Added message: " + e.getId());
		postAdd(e, added);
		return added;
	}

	@Override
	public void addAll(List<MethodInvocation<?>> mis) {
		Iterator<MethodInvocation<?>> i = mis.iterator();
		while (i.hasNext()) {
			MethodInvocation<?> mi = i.next();
			add(mi);
		}
	}

	@Override
	public MethodInvocation<?> take() throws InterruptedException {
		preTake();
		logger.debug("Trying to take one message ...");
		MethodInvocation<?> mi = q.take();
		postTake(mi);
		return mi;
	}

	/**
	 * It is called before {@link #add(MethodInvocation)} is called. It allows
	 * the subclasses customize things before adding the
	 * {@link MethodInvocation} to the storage. By default, it calls
	 * {@link #updateResolvedPriority(MethodInvocation)}.
	 * 
	 * @param mi
	 *            The incoming {@link MethodInvocation}
	 */
	protected void preAdd(MethodInvocation<?> mi) {
		updateResolvedPriority(mi);
	}

	/**
	 * This is an extension point after {@link #add(MethodInvocation)} is
	 * called. By default, it does nothing.
	 * 
	 * @param mi
	 *            The incoming {@link MethodInvocation}
	 * @param added
	 *            {@code true} if {@code mi} has been successfully added to the
	 *            store.
	 */
	protected void postAdd(MethodInvocation<?> mi, boolean added) {
	}

	/**
	 * 
	 */
	protected void preTake() {
	}

	/**
	 * @param mi
	 */
	protected void postTake(MethodInvocation<?> mi) {
		if (schedulingManager != null) {
			schedulingManager.beforeExecute(mi);
		}
	}

	/**
	 * This should be able to update the final "resolved" {@link Priority} of
	 * the {@link MethodInvocation}. By default, it uses
	 * {@link #mapPriority(MethodInvocation, Priority...)} to compute this
	 * resolved value.
	 * 
	 * @param mi
	 *            The incoming {@link MethodInvocation}
	 */
	protected void updateResolvedPriority(MethodInvocation<?> mi) {
		Priority priority = mapPriority(mi);
		if (null != priority) {
			mi.setResolvedPriority(priority);
		}
	}

	/**
	 * By default, it uses {@link PriorityManager} to compute the final resolved
	 * {@link Priority} of the {@link MethodInvocation}. Subclasses may override
	 * this method to change the computation.
	 * 
	 * @param mi
	 *            The incoming {@link MethodInvocation}
	 * @return The final resolved {@link Priority} instace. It may be
	 *         {@code null}.
	 */
	protected Priority mapPriority(MethodInvocation mi) {
		PriorityManager methodLevelPM = initPriorityManager(mi);
		if (methodLevelPM != null) {
			Priority priority = methodLevelPM.resolve(mi);
			return priority;
		}
		if (this.priorityManager != null) {
			Priority priority = this.priorityManager.resolve(mi);
			return priority;
		}
		return null;
	}

	protected PriorityManager initPriorityManager(MethodInvocation mi) {
		String methodName = mi.getMetaData().getMethodName();
		Class pmClass = owner.getPriorityManagerClass(methodName);
		if (pmClass == null) {
			return null;
		}
		try {
			Set<Field> assigned = new HashSet<Field>();
			PriorityManager pm = (PriorityManager) pmClass.newInstance();
			Field[] fields = pmClass.getDeclaredFields();
			List<Object> params = mi.getMetaData().getActualParameters();
			for (int i = 0; i < params.size(); ++i) {
				Object param = params.get(i);
				Class paramClass = param.getClass();
				for (int j = 0; j < fields.length; ++j) {
					Field field = fields[j];
					field.setAccessible(true);
					if (assigned.contains(field)) {
						continue;
					}
					if (paramClass.equals(field.getType())) {
						field.set(pm, param);
						assigned.add(field);
					}
				}
			}
			return pm;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
