package nl.cwi.crisp.examples.p2p;

import java.util.Collection;

public interface Storage {
	
	Collection<String> list();
	
	int getLength(String fileName);
	
	void persist(String fileName, Object file);
	
	Object load(String fileName);

}