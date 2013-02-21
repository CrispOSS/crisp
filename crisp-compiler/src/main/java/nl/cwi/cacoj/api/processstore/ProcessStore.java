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

import java.util.List;

import nl.cwi.cacoj.api.MethodInvocation;

/**
 * 
 * @author Behrooz Nobakht
 *
 **/
public interface ProcessStore {
	
	boolean add(MethodInvocation<?> mi);
	
	MethodInvocation<?> take() throws InterruptedException;

	void addAll(List<MethodInvocation<?>> mis);

}
