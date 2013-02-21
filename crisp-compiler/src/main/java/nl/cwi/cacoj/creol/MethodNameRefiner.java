package nl.cwi.cacoj.creol;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Behrooz Nobakht
 *
 **/
public class MethodNameRefiner {
	
	private static final Map<String, String> names = new HashMap<String, String>();
	
	static String refineMethodName(String methodName) {
		String refined = names.get(methodName);
		return refined == null ? methodName : refined;
	}
	
	static {
		names.put("init", "postCreate");
		names.put("run", "preRun");
		names.put("println", "System.out.println");
		names.put("print", "System.out.print");
	}

}
