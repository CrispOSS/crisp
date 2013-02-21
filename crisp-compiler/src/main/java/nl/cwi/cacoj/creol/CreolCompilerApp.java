package nl.cwi.cacoj.creol;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.RecognitionException;

/**
 * 
 * @author Behrooz Nobakht
 * 
 **/
public class CreolCompilerApp {

	public static void main(String[] args) throws IOException, RecognitionException {
		Map<Options, String> options = readOptions(args);
		String base = options.get(Options.BASE);
		String source = options.get(Options.SOURCE);
		if (source == null) {
			System.err
					.println("Invalid Usage: creolc [-base BASE] -source SOURCE [-pm PM] [-sm SM]");
			System.exit(1);
		}

		CreolCompiler compiler = new CreolCompiler();
		compiler.setSource(source);
		if (null != base) {
			compiler.setBase(base);
		}
		compiler.compile();
	}

	private static enum Options {
		SOURCE, BASE, PM, SM;
	}

	static Map<Options, String> readOptions(String[] args) {
		Map<Options, String> options = new HashMap<Options, String>();
		for (int i = 0; i < args.length; ++i) {
			if (args[i].equalsIgnoreCase("-" + Options.SOURCE)) {
				options.put(Options.SOURCE, args[i + 1]);
				i = i + 1;
			} else if (args[i].equalsIgnoreCase("-" + Options.BASE)) {
				options.put(Options.BASE, args[i + 1]);
				i = i + 1;
			} else if (args[i].equalsIgnoreCase("-" + Options.PM)) {
				options.put(Options.PM, args[i + 1]);
				i = i + 1;
			} else if (args[i].equalsIgnoreCase("-" + Options.SM)) {
				options.put(Options.SM, args[i + 1]);
				i = i + 1;
			}
		}
		return options;
	}

}
