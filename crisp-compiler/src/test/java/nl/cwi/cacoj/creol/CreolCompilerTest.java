package nl.cwi.cacoj.creol;

import nl.cwi.cacoj.creol.CreolCompiler;

import org.junit.Test;

public class CreolCompilerTest {

	@Test
	public void testGenerate() throws Exception {
		CreolCompiler compiler = new CreolCompiler();
		compiler.setBase("/media/D/dev/workspaces/mcp/manticore/src/test/java");
		compiler.compile();
	}

}
