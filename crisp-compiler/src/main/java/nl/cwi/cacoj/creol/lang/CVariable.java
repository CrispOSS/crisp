package nl.cwi.cacoj.creol.lang;

/**
 * 
 * @author Behrooz Nobakht
 * 
 **/
public class CVariable {

	public String name;
	public CType type;
	public CValue initialValue;

	public CVariable() {
	}

	public CVariable(String name, CType type) {
		this.name = name;
		this.type = type;
	}

	public CVariable(String name, CType type, CValue value) {
		this(name, type);
		this.initialValue = value;
	}
	
	public boolean hasInitialValue() {
		return this.initialValue != null;
	}

}
