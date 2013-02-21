package nl.cwi.cacoj.creol.lang;

import java.util.List;

/**
 * 
 * @author Behrooz Nobakht
 * 
 **/
public class CMethod {

	public String name;
	public List inparams;
	public List outparams;
	public String priorityExpression;

	public boolean getHasInParameters() {
		return this.inparams != null && this.inparams.size() > 0;
	}

	public boolean getHasOutParameters() {
		return this.outparams != null && this.outparams.size() > 0;
	}

	public boolean getIsVoidMethod() {
		return !getHasOutParameters();
	}

	public boolean getIsSingleReturnMethod() {
		return !getIsVoidMethod() && this.outparams.size() == 1;
	}

	public String getReturnType() {
		return getIsVoidMethod() ? "Object"
				: getIsSingleReturnMethod() ? ((CVariable) outparams.get(0)).type.getName()
						: "java.util.Map";
	}
	
	public String getName() {
		if ("stdin".equals(name)) {
			return "System.in";
		} else if ("getStdOut".equals(name)) {
			return "System.out.println";
		}
		return name;
	}
	
	public boolean getIsInitMethod() {
		return "init".equals(name);
	}
	
	public boolean getIsRunMethod() {
		return "run".equals(name);
	}

}
