package nl.cwi.cacoj.creol.lang;

import java.util.List;

/**
 * 
 * @author Behrooz Nobakht
 *
 **/
public class CType {
	
	public String name;
	public List enclosures;
	
	public CType() {
	}
	
	public CType(String name) {
		this.name = name;
	}
	
	public boolean getIsLabelType() {
		return "Label".equals(name);
	}
	
	public String getName() {
		if ("Int".equals(name)) {
			return "Integer";
		}
		return name;
	}

}
