package nl.cwi.cacoj.creol;

import java.util.HashMap;
import java.util.Map;

import nl.cwi.cacoj.creol.lang.CMethod;

/**
 * 
 * @author Behrooz Nobakht
 * 
 **/
public class CompilationContextUtils {

	private static final Map<String, CompilationContext> contexts = new HashMap<String, CompilationContext>();
	private static String currentContextName;
	private static String curretMethodContextName;

	static void setCurrentContext(String name) {
		currentContextName = name;
	}
	
	static void setCurrentMethodContext(String name) {
		curretMethodContextName = name;
	}

	static void register(CompilationContext context) {
		contexts.put(context.contextName, context);
	}

	static String generateVariableName(String prefix) {
		return VariableOracle.generateVariableName(prefix);
	}
	
	static String getLastGeneratedNum(String prefix) {
		return VariableOracle.getLastGeneratedNum(prefix);
	}
	
	static String getMiNameForFutureLabel(String label) {
		CompilationContext ctx = contexts.get(currentContextName);
		return ctx.getMiName(curretMethodContextName, label);
	}
	
	static void setMiNameFutureLabel(String mi, String label) {
		CompilationContext ctx = contexts.get(currentContextName);
		ctx.putFutureLabel(curretMethodContextName, mi, label);
	}
	
	static String getMethodReturnType(String name) {
		CompilationContext context = contexts.get(currentContextName);
		if (context == null) {
			return null;
		}
		return context.getMethodReturnType(name);
	}
	
	static Boolean hasInitMethod() {
		CompilationContext context = contexts.get(currentContextName);
		if (context == null) {
			return false;
		}
		return context.hasInitMethod();
	}
	
	static CompilationContext getCurrentContext() {
		return contexts.get(currentContextName);
	}
	
	static String refineMethodName(String methodName) {
		return MethodNameRefiner.refineMethodName(methodName);
	}

	public static void addMethodLevelPriority(CMethod m) {
		CompilationContext context = getCurrentContext();
		context.addMethodLevelPriority(m);
	}

}
