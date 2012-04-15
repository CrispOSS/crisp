/*
 * Created on Apr 7, 2012 | 6:02:56 PM
 */
package nl.cwi.crisp.examples.p2p;

import java.util.Collection;

/**
 *
 * @author Behrooz Nobakht
 */
public interface Client {
	
	Collection<String> list();
	
	Object download(String fileName);
	
	void upload(String fileName, Object file);
	
}
