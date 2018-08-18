package se.gu.evaluation.rq;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import se.gu.parser.BindedDelayLexer;
import se.gu.parser.BindedDelayParser;
import se.gu.parser.BindedReactionLexer;
import se.gu.parser.BindedReactionParser;
import se.gu.parser.FastReactionLexer;
import se.gu.parser.FastReactionParser;
import se.gu.parser.InitLexer;
import se.gu.parser.InitParser;
import se.gu.parser.InstantaneousReactionLexer;
import se.gu.parser.InstantaneousReactionParser;
import se.gu.parser.InvariantLexer;
import se.gu.parser.InvariantParser;
import se.gu.parser.LTLLexer;
import se.gu.parser.LTLParser;
import se.gu.parser.ReactionChainLexer;
import se.gu.parser.ReactionChainParser;
import se.gu.parser.VisitInstantaneousReactionLexer;
import se.gu.parser.VisitInstantaneousReactionParser;
import se.gu.parser.VisitLexer;
import se.gu.parser.VisitParser;

public class Step2 {

	public static void main(String[] args) throws IOException {

		String filePath = args[0];

		File f = new File(filePath);

		File f2 = new File("nonMatching.txt");

		File compilationErrorsFile = new File("compilationErrors.txt");

		File instReact = new File("instReact.txt");
		BufferedWriter instReactWriter = new BufferedWriter(new FileWriter(instReact));

		BufferedWriter visitWriter = new BufferedWriter(new FileWriter(new File("visit.txt")));

		BufferedWriter initWriter = new BufferedWriter(new FileWriter(new File("init.txt")));

		BufferedWriter fastWriter = new BufferedWriter(new FileWriter(new File("fast.txt")));

		BufferedWriter invariantWriter = new BufferedWriter(new FileWriter(new File("invariant.txt")));

		BufferedWriter visitInstReactWriter = new BufferedWriter(new FileWriter(new File("visitInstReact.txt")));

		BufferedWriter bindedReactionWriter = new BufferedWriter(new FileWriter(new File("bindedReaction.txt")));

		BufferedWriter bindedDelayWriter = new BufferedWriter(new FileWriter(new File("bindedDelay.txt")));

		BufferedWriter reactionChainWriter = new BufferedWriter(new FileWriter(new File("reactionChain.txt")));
		
		
		BufferedWriter nonMatchingPastWriter = new BufferedWriter(new FileWriter(new File("nonMatchingPast.txt")));


		BufferedWriter writer = new BufferedWriter(new FileWriter(f2));

		BufferedWriter writerCompilationErrors = new BufferedWriter(new FileWriter(compilationErrorsFile));

		BufferedReader b = new BufferedReader(new FileReader(f));

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
					InstantaneousReactionLexer lexer = new InstantaneousReactionLexer(input);
					CommonTokenStream tokens = new CommonTokenStream(lexer);
					InstantaneousReactionParser parser = new InstantaneousReactionParser(tokens);

					parser.instantaneousReactionPattern();
					parser.removeErrorListeners();

					if (parser.getNumberOfSyntaxErrors() == 0) {
						matched = true;
						instantaneousReaction++;
						instReactWriter.write(string + "\n");
					}

				} catch (ParseCancellationException e) {
					matched = false;
				}
			}
			if (!matched) {
				try {
					ANTLRInputStream input;
					input = new ANTLRInputStream(string);
					VisitLexer lexer = new VisitLexer(input);
					CommonTokenStream tokens = new CommonTokenStream(lexer);
					VisitParser parser = new VisitParser(tokens);
					parser.removeErrorListeners();

					parser.visit();

					if (parser.getNumberOfSyntaxErrors() == 0) {
						matched = true;
						visit++;
						visitWriter.write(string + "\n");
					}
				} catch (ParseCancellationException e) {
					matched = false;
				}
			}

			if (!matched) {
				try {
					ANTLRInputStream input;
					input = new ANTLRInputStream(string);
					InitLexer lexer = new InitLexer(input);
					CommonTokenStream tokens = new CommonTokenStream(lexer);
					InitParser parser = new InitParser(tokens);
					parser.removeErrorListeners();
					parser.init();

					if (parser.getNumberOfSyntaxErrors() == 0) {
						matched = true;
						init++;
						initWriter.write(string + "\n");
					}
				} catch (ParseCancellationException e) {
					matched = false;
				}

				if (!matched) {
					try {
						ANTLRInputStream input;
						input = new ANTLRInputStream(string);
						FastReactionLexer lexer = new FastReactionLexer(input);
						CommonTokenStream tokens = new CommonTokenStream(lexer);
						FastReactionParser parser = new FastReactionParser(tokens);
						parser.removeErrorListeners();
						parser.fastReaction();

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
					try {
						ANTLRInputStream input;
						input = new ANTLRInputStream(string);
						InvariantLexer lexer = new InvariantLexer(input);
						CommonTokenStream tokens = new CommonTokenStream(lexer);
						InvariantParser parser = new InvariantParser(tokens);
						parser.removeErrorListeners();
						parser.invariant();

						if (parser.getNumberOfSyntaxErrors() == 0) {
							matched = true;
							invariant++;
							invariantWriter.write(string + "\n");
						}
					} catch (ParseCancellationException e) {
						matched = false;
					}
				}

				if (!matched) {
					try {
						ANTLRInputStream input;
						input = new ANTLRInputStream(string);
						VisitInstantaneousReactionLexer lexer = new VisitInstantaneousReactionLexer(input);
						CommonTokenStream tokens = new CommonTokenStream(lexer);
						VisitInstantaneousReactionParser parser = new VisitInstantaneousReactionParser(tokens);
						parser.removeErrorListeners();
						parser.visitInstReaction();

						if (parser.getNumberOfSyntaxErrors() == 0) {
							matched = true;
							visitInstReact++;
							visitInstReactWriter.write(string + "\n");
						}
					} catch (ParseCancellationException e) {
						matched = false;
					}
				}

				if (!matched) {
					try {
						ANTLRInputStream input;
						input = new ANTLRInputStream(string);
						BindedReactionLexer lexer = new BindedReactionLexer(input);
						CommonTokenStream tokens = new CommonTokenStream(lexer);
						BindedReactionParser parser = new BindedReactionParser(tokens);
						parser.removeErrorListeners();
						parser.bindedReaction();

						if (parser.getNumberOfSyntaxErrors() == 0) {
							matched = true;
							bindedReaction++;
							bindedReactionWriter.write(string + "\n");

						}
					} catch (ParseCancellationException e) {
						matched = false;
					}
				}

				if (!matched) {
					try {
						ANTLRInputStream input;
						input = new ANTLRInputStream(string);
						BindedDelayLexer lexer = new BindedDelayLexer(input);
						CommonTokenStream tokens = new CommonTokenStream(lexer);
						BindedDelayParser parser = new BindedDelayParser(tokens);
						parser.removeErrorListeners();
						parser.bindedDelay();

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
						ReactionChainLexer lexer = new ReactionChainLexer(input);
						CommonTokenStream tokens = new CommonTokenStream(lexer);
						ReactionChainParser parser = new ReactionChainParser(tokens);
						parser.removeErrorListeners();
						parser.reactionChain();

						if (parser.getNumberOfSyntaxErrors() == 0) {
							matched = true;
							reactionChain++;
							reactionChainWriter.write(string + "\n");

						}
					} catch (ParseCancellationException e) {
						matched = false;
					}
				}

				if (!matched) {
					

					if (string.contains("PREV") || string.contains("Y(") || string.contains("Y (")) {
						prev++;
						nonMatchingPastWriter.write(string + "\n");
					} else {
						writer.write(string + "\n");
						nonMatching++;
					}
				}

			}
		}

		System.out.println("\n");

		System.out.println("Instantaneous reaction: " + instantaneousReaction);
		System.out.println("Visit: " + visit);
		System.out.println("Init: " + init);
		System.out.println("Fast reaction: " + fastReaction);

		System.out.println("Invariant: " + invariant);

		System.out.println("Visit inst react: " + visitInstReact);

		System.out.println("Binded reaction: " + bindedReaction);

		System.out.println("Binded delay: " + bindedDelay);

		System.out.println("Reaction chain: " + reactionChain);

		System.out.println("Non matching for past: " + prev);


		System.out.println("Actual non matching: " + nonMatching );
		System.out.println("Total: " + (instantaneousReaction + visit + init + fastReaction +  invariant
				+ visitInstReact + bindedReaction+ bindedDelay+ reactionChain+prev + nonMatching));

		b.close();
		writer.close();
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
		nonMatchingPastWriter.close();
		

	}

}
