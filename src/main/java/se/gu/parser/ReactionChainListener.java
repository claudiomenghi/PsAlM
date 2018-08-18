// Generated from ReactionChain.g4 by ANTLR 4.4

 	
 	package se.gu.parser;
 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactionChainParser}.
 */
public interface ReactionChainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReactionChainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ReactionChainParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactionChainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ReactionChainParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactionChainParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexp(@NotNull ReactionChainParser.BooleanexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactionChainParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexp(@NotNull ReactionChainParser.BooleanexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactionChainParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void enterPosnumAss(@NotNull ReactionChainParser.PosnumAssContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactionChainParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void exitPosnumAss(@NotNull ReactionChainParser.PosnumAssContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactionChainParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull ReactionChainParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactionChainParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull ReactionChainParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactionChainParser#react}.
	 * @param ctx the parse tree
	 */
	void enterReact(@NotNull ReactionChainParser.ReactContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactionChainParser#react}.
	 * @param ctx the parse tree
	 */
	void exitReact(@NotNull ReactionChainParser.ReactContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactionChainParser#reactionChain}.
	 * @param ctx the parse tree
	 */
	void enterReactionChain(@NotNull ReactionChainParser.ReactionChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactionChainParser#reactionChain}.
	 * @param ctx the parse tree
	 */
	void exitReactionChain(@NotNull ReactionChainParser.ReactionChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactionChainParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(@NotNull ReactionChainParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactionChainParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(@NotNull ReactionChainParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactionChainParser#lop}.
	 * @param ctx the parse tree
	 */
	void enterLop(@NotNull ReactionChainParser.LopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactionChainParser#lop}.
	 * @param ctx the parse tree
	 */
	void exitLop(@NotNull ReactionChainParser.LopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactionChainParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull ReactionChainParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactionChainParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull ReactionChainParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactionChainParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void enterPosassignement(@NotNull ReactionChainParser.PosassignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactionChainParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void exitPosassignement(@NotNull ReactionChainParser.PosassignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactionChainParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull ReactionChainParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactionChainParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull ReactionChainParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactionChainParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterPositiveoperator(@NotNull ReactionChainParser.PositiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactionChainParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitPositiveoperator(@NotNull ReactionChainParser.PositiveoperatorContext ctx);
}