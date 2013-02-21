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

import nl.cwi.cacoj.api.MethodInvocation;

/**
 * This is an extension to {@link TimeOrderedSchedulingManager} that prioritizes
 * the method invocations based on their response time request. The one with the
 * earlier expected response time is prior to the other. In case of a tie, the
 * priority goes to the one with the earlier creation time.
 * 
 * 
 * @author Behrooz Nobakht
 * @since 1.0
 * @see TimeOrderedSchedulingManager
 * @see SchedulingManager
 * 
 **/
public class ResponseDeadlineSchedulingManager extends TimeOrderedSchedulingManager {

	@Override
	public Boolean isPrior(MethodInvocation<?> mi1, MethodInvocation<?> mi2) {
		Long r1 = mi1.getResponseTimeout();
		Long r2 = mi2.getResponseTimeout();
		if (r1 == null || r2 == null) {
			return mi1.getCreatedTime() >= mi2.getCreatedTime();
		}
		logger.debug("Response deadline comparing: (" + r1 + ", " + r2 + ")");
		return r1 >= r2;
	}

	@Override
	public void beforeExecute(MethodInvocation<?> mi) {
		super.beforeExecute(mi);
		Long ct = mi.getCreatedTime();
		Long rt = mi.getResponseTimeout();
		Long now = System.currentTimeMillis();
		if (now > ct + rt) {
			String message = mi + " : Expected response in [" + rt + "] millis from [" + ct
					+ "]; now: " + now;
			logger.error(message);
			throw new RuntimeException(message);
		}
	}

}
