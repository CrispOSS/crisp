package nl.cwi.cacoj.creol;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Behrooz Nobakht
 * 
 **/
public class VariableOracle {

	private static Map<String, Integer> vars = new HashMap<String, Integer>();

	static String generateVariableName(String prefix) {
		Integer num = vars.get(prefix);
		if (num == null) {
			num = 0;
		}
		++num;
		vars.put(prefix, num);
		return prefix + num;
	}
	
	static String getLastGeneratedNum(String prefix) {
		Integer num = vars.get(prefix);
		if (num == null) {
			return null;
		}
		return num + "";
	}

}
