package psaimist;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import junit.framework.TestCase;
import se.got.mission.Mission;
import se.got.parser.MISSIONLexer;
import se.got.parser.MISSIONParser;



public class PatternTest extends TestCase {

	@Test
	public void test1() throws IOException {

		ANTLRInputStream input = new ANTLRFileStream(ClassLoader.getSystemResource("parser/test1.txt").getPath());
		
		
		MISSIONLexer lexer = new MISSIONLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MISSIONParser parser = new MISSIONParser(tokens);
		parser.setErrorHandler(new BailErrorStrategy());
		parser.setBuildParseTree(true);
		Mission mission = parser.mission().robotsmission;


		System.out.println(mission);
		assertTrue(true);

	}
}
