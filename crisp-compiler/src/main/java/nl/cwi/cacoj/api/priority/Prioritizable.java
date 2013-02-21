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

import java.util.List;

/**
 * 
 * @author Behrooz Nobakht
 * 
 **/
public interface Prioritizable {

	void addPriority(Priority priority);

	List<Priority> getPriorities();
	
	void setResolvedPriority(Priority priority);
	
	Priority getResolvedPriority();
	
}
