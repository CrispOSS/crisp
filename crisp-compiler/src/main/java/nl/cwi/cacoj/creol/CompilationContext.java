package nl.cwi.cacoj.creol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.cwi.cacoj.creol.lang.CMethod;

/**
 * 
 * @author Behrooz Nobakht
 * 
 **/
public class CompilationContext {

	String contextName;
	List<CMethod> methods = new ArrayList<CMethod>();

	Map<String, Map<String, String>> futureLabels = new HashMap<String, Map<String, String>>();
	Map<String, String> methodLevelPriorities = new HashMap<String, String>();
	Map<String, CMethod> methodMap = new HashMap<String, CMethod>();

	void addMethod(CMethod method) {
		methods.add(method);
		methodMap.put(method.name, method);
	}

	String getMethodReturnType(String name) {
		for (CMethod m : methods) {
			if (name.equals(m.name)) {
				if (m.getIsVoidMethod()) {
					return null;
				}
				return m.getReturnType();
			}
		}
		return null;
	}

	Boolean hasInitMethod() {
		for (CMethod m : methods) {
			if ("init".equals(m.name)) {
				return true;
			}
		}
		return false;
	}

	String getFutureLabel(String method, String miName) {
		Map<String, String> labels = futureLabels.get(method);
		if (labels == null) {
			return null;
		}
		return labels.get(miName);
	}

	void putFutureLabel(String method, String miName, String label) {
		Map<String, String> labels = futureLabels.get(method);
		if (labels == null) {
			futureLabels.put(method, new HashMap<String, String>());
		}
		futureLabels.get(method).put(miName, label);
	}

	public String getMiName(String method, String label) {
		Map<String, String> labels = futureLabels.get(method);
		if (labels == null) {
			return null;
		}
		for (Map.Entry<String, String> e : labels.entrySet()) {
			if (e.getValue().equals(label)) {
				return e.getKey();
			}
		}
		return null;
	}

	public String toString() {
		return "Compilation Context: " + contextName;
	}

	public void addMethodLevelPriority(CMethod m) {
		methodLevelPriorities.put(m.name, m.priorityExpression);
	}

	public Map<String, String> getMethodLevelPriorities() {
		return methodLevelPriorities;
	}

	public List<CMethod> getMethods() {
		return methods;
	}

	public Map<String, CMethod> getMethodMap() {
		return methodMap;
	}

}
