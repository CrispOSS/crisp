package nl.cwi.cacoj.creol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import nl.cwi.cacoj.creol.lang.CMethod;
import nl.cwi.cacoj.creol.lang.CType;
import nl.cwi.cacoj.creol.lang.CVariable;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

/**
 * 
 * @author Behrooz Nobakht
 * 
 **/
public class ProgramPreprocessor {

	public static void preprocess(CommonTree ast) {
		if (ast.getChildCount() == 0) {
			return;
		}
		List children = ast.getChildren();
		for (Iterator i = children.iterator(); i.hasNext();) {
			CommonTree child = (CommonTree) i.next();
			if (child.getType() == CreolParser.CLASS || child.getType() == CreolParser.INTERFACE) {
				CommonTree idNode = ((CommonTree) child.getChild(0));
				String interfaceOrClassName = ((CommonTree) idNode.getChild(0)).getToken().getText();
				CompilationContext context = new CompilationContext();
				context.contextName = interfaceOrClassName;
				System.out.println(context);
				extractMethods(child, context);
				CompilationContextUtils.register(context);
			}
		}
	}

	private static void extractMethods(CommonTree child, CompilationContext context) {
		if (child.getType() == CreolParser.OP) {
			Tree nameNode = child.getChild(0);
			String methodName = nameNode.getChild(0).getText();
			Tree params = child.getChild(1);
			List<CVariable> parameters = null;
			List<CVariable> returns = null;
			if (params != null && params.getChildCount() > 0) {
				CommonTree inparams = (CommonTree) params.getChild(0);
				CommonTree outparams = null;
				if (params.getChildCount() == 2) {
					outparams = (CommonTree) params.getChild(1);
				} else if (inparams.getType() == CreolParser.OUT) {
					outparams = inparams;
					inparams = null;
				}
				parameters = processVarListDeclaration(inparams);
				returns = processVarListDeclaration(outparams);
			}
			CMethod method = new CMethod();
			method.name = methodName;
			method.inparams = parameters;
			method.outparams = returns;
			context.addMethod(method);
		} else {
			if (child.getChildCount() > 0) {
				List children = child.getChildren();
				for (Iterator i = children.iterator(); i.hasNext();) {
					extractMethods((CommonTree) i.next(), context);
				}
			}
		}
	}

	private static List<CVariable> processVarListDeclaration(CommonTree node) {
		List<CVariable> vars = new ArrayList<CVariable>();
		if (node == null || node.getChildCount() == 0) {
			return vars;
		}
		List children = node.getChildren();
		for (Iterator i = children.iterator(); i.hasNext();) {
			CommonTree var = (CommonTree) i.next();
			if (var.getType() == CreolParser.DECL) {
				String varName = ((CommonTree) var.getChild(0)).getToken().getText();
				String typeName = ((CommonTree) var.getChild(1)).getChild(0).getText();
				CType ct = new CType(typeName);
				CVariable cv = new CVariable(varName, ct);
				vars.add(cv);
			}
		}
		return vars;
	}

	private static void printNode(CommonTree ast) {
		System.out.println(ast.getText() + "[" + ast.getType() + "]");
		if (ast.getChildCount() > 0) {
			List children = ast.getChildren();
			for (Iterator i = children.iterator(); i.hasNext();) {
				CommonTree child = (CommonTree) i.next();
				System.out.println(child.getText() + "[" + child.getType() + "]");
			}
			for (Iterator i = children.iterator(); i.hasNext();) {
				CommonTree child = (CommonTree) i.next();
				printNode(child);
			}
		}
	}

}
