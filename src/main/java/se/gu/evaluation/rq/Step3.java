package se.gu.evaluation.rq;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import se.gu.parser.BindedDelayPastLexer;
import se.gu.parser.BindedDelayPastParser;
import se.gu.parser.FastReactionPastLexer;
import se.gu.parser.FastReactionPastParser;

public class Step3 {

	public static void main(String[] args) throws IOException {

		String filePath = args[0];

		File inputFile = new File(filePath);

		File compilationErrorsFile = new File("compilationErrors.txt");


		BufferedWriter instReactWriter = new BufferedWriter(new FileWriter(new File("instReactPast.txt")));

		BufferedWriter visitWriter = new BufferedWriter(new FileWriter(new File("visitPast.txt")));

		BufferedWriter initWriter = new BufferedWriter(new FileWriter(new File("initPast.txt")));

		BufferedWriter fastWriter = new BufferedWriter(new FileWriter(new File("fastPast.txt")));

		BufferedWriter invariantWriter = new BufferedWriter(new FileWriter(new File("invariantPast.txt")));

		BufferedWriter visitInstReactWriter = new BufferedWriter(new FileWriter(new File("visitInstReactPast.txt")));

		BufferedWriter bindedReactionWriter = new BufferedWriter(new FileWriter(new File("bindedReactionPast.txt")));

		BufferedWriter bindedDelayWriter = new BufferedWriter(new FileWriter(new File("bindedDelayPast.txt")));

		BufferedWriter reactionChainWriter = new BufferedWriter(new FileWriter(new File("reactionChainPast.txt")));

		BufferedWriter nonMatchingWriter = new BufferedWriter(new FileWriter(new File("nonMatchingPast.txt")));

		BufferedWriter writerCompilationErrors = new BufferedWriter(new FileWriter(compilationErrorsFile));

		BufferedReader b = new BufferedReader(new FileReader(inputFile));

		int instantaneousReaction = 0;
		int visit = 0;
		int nonMatching = 0;
		int init = 0;

		int invariant = 0;

		int fastReaction = 0;

		int visitInstReact = 0;

		int bindedReaction = 0;

		int bindedDelay = 0;

		int reactionChain = 0;

		int prev = 0;

		String string = "";
		while ((string = b.readLine()) != null) {

			boolean matched = false;

			
			if (!matched) {

				try {
					ANTLRInputStream input;
					input = new ANTLRInputStream(string);
					BindedDelayPastLexer lexer = new BindedDelayPastLexer(input);
					CommonTokenStream tokens = new CommonTokenStream(lexer);
					BindedDelayPastParser parser = new BindedDelayPastParser(tokens);

					parser.bindedDelayPast();
					parser.removeErrorListeners();

					if (parser.getNumberOfSyntaxErrors() == 0) {
						matched = true;
						bindedDelay++;
						bindedDelayWriter.write(string + "\n");
					}

				} catch (ParseCancellationException e) {
					matched = false;
				}
			}
			
			
			if (!matched) {

				try {
					ANTLRInputStream input;
					input = new ANTLRInputStream(string);
					FastReactionPastLexer lexer = new FastReactionPastLexer(input);
					CommonTokenStream tokens = new CommonTokenStream(lexer);
					FastReactionPastParser parser = new FastReactionPastParser(tokens);

					parser.fastReactionPast();
					parser.removeErrorListeners();

					if (parser.getNumberOfSyntaxErrors() == 0) {
						matched = true;
						fastReaction++;
						fastWriter.write(string + "\n");
					}

				} catch (ParseCancellationException e) {
					matched = false;
				}
			}

			if (!matched) {

				nonMatchingWriter.write(string + "\n");
				nonMatching++;

			}

		}

		System.out.println("\n");

		System.out.println("Visit: " + visit);

		System.out.println("Fast reaction: " + fastReaction);

		System.out.println("Invariant: " + invariant);

		System.out.println("Visit inst react: " + visitInstReact);

		System.out.println("Binded reaction: " + bindedReaction);

		System.out.println("Binded delay: " + bindedDelay);

		System.out.println("Reaction chain: " + reactionChain);

		System.out.println("Non matching for past: " + prev);

		System.out.println("Actual non matching: " + nonMatching);
		System.out.println("Total: " + (instantaneousReaction + visit + init + fastReaction + invariant + visitInstReact
				+ bindedReaction + bindedDelay + reactionChain + prev + nonMatching));

		System.out.println("Total: " + instantaneousReaction + visit + init + fastReaction + invariant + visitInstReact
				+ bindedReaction + bindedDelay + reactionChain + prev + nonMatching);
		b.close();
		nonMatchingWriter.close();
		writerCompilationErrors.close();
		initWriter.close();

		instReactWriter.close();
		visitWriter.close();
		fastWriter.close();
		invariantWriter.close();
		visitInstReactWriter.close();
		bindedReactionWriter.close();
		bindedDelayWriter.close();
		reactionChainWriter.close();
	}

}
