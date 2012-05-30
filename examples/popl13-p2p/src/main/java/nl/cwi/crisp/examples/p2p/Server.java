/*
 * Created on Apr 7, 2012 | 6:05:28 PM
 */
package nl.cwi.crisp.examples.p2p;

import java.util.Collection;

/**
 *
 * @author Behrooz Nobakht
 */
public interface Server {
	
	Collection<?> search(String query);
	
}
