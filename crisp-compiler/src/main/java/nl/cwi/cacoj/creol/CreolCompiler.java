package nl.cwi.cacoj.creol;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

public class CreolCompiler {

	private static StringTemplateGroup templates;

	private String templateSource;
	private String source;
	private String base;

	private String sourceFileName;

	public CreolCompiler() {
		setTemplateSource("nl/cwi/cacoj/creol/Creol.stg");
		setBase(System.getProperty("java.io.tmpdir"));
	}

	public void compile() throws IOException, RecognitionException {

		InputStream templateIS = getClass().getClassLoader().getResourceAsStream(templateSource);
		if (templateIS == null) {
			templateIS = getClass().getClassLoader().getSystemClassLoader()
					.getResourceAsStream(templateSource);
		}

		InputStream sourceIS = getClass().getClassLoader().getResourceAsStream(source);
		if (sourceIS == null) {
			sourceIS = new FileInputStream(source);
		}

		// Load the templates
		BufferedReader templateLoader = new BufferedReader(new InputStreamReader(templateIS));
		templates = new StringTemplateGroup(templateLoader);
		templateLoader.close();

		// prepare parser
		ANTLRInputStream input = new ANTLRInputStream(sourceIS);
		CreolLexer lexer = new CreolLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CreolParser parser = new CreolParser(tokens);
		// parse
		CreolParser.start_return creolProgram = parser.start();
		// fetch AST
		CommonTree creolProgramTree = (CommonTree) creolProgram.getTree();
		ProgramPreprocessor.preprocess(creolProgramTree);
		// prepare walker
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(creolProgramTree);
		nodes.setTokenStream(tokens);
		CreolWalker walker = new CreolWalker(nodes);
		// inject the generation templates
		walker.setTemplateLib(templates);
		// walk and generate
		CreolWalker.start_return processedCreolProgram = walker.start();
		// fetch the generated template
		StringTemplate generated = (StringTemplate) processedCreolProgram.getTemplate();

		FileWriter ow = new FileWriter(base + "/" + sourceFileName + ".java");
		ow.write(generated.toString());
		ow.close();
	}

	public static StringTemplate template(String name) {
		return templates.getInstanceOf(name);
	}

	public void setBase(String base) {
		this.base = base;
	}

	public void setSource(String source) {
		this.source = source;
		this.sourceFileName = source.substring(source.lastIndexOf('/') + 1);
		this.sourceFileName = this.sourceFileName.substring(0,
				this.sourceFileName.lastIndexOf(".creol"));
	}

	public void setTemplateSource(String templateSource) {
		this.templateSource = templateSource;
	}

}
