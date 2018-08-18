// Generated from InstantaneousReaction.g4 by ANTLR 4.4

 	
 	package se.gu.parser;
 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InstantaneousReactionParser}.
 */
public interface InstantaneousReactionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InstantaneousReactionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull InstantaneousReactionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InstantaneousReactionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull InstantaneousReactionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InstantaneousReactionParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexp(@NotNull InstantaneousReactionParser.BooleanexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link InstantaneousReactionParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexp(@NotNull InstantaneousReactionParser.BooleanexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link InstantaneousReactionParser#instantaneousReactionPattern}.
	 * @param ctx the parse tree
	 */
	void enterInstantaneousReactionPattern(@NotNull InstantaneousReactionParser.InstantaneousReactionPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link InstantaneousReactionParser#instantaneousReactionPattern}.
	 * @param ctx the parse tree
	 */
	void exitInstantaneousReactionPattern(@NotNull InstantaneousReactionParser.InstantaneousReactionPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link InstantaneousReactionParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void enterPosnumAss(@NotNull InstantaneousReactionParser.PosnumAssContext ctx);
	/**
	 * Exit a parse tree produced by {@link InstantaneousReactionParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void exitPosnumAss(@NotNull InstantaneousReactionParser.PosnumAssContext ctx);
	/**
	 * Enter a parse tree produced by {@link InstantaneousReactionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull InstantaneousReactionParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InstantaneousReactionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull InstantaneousReactionParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InstantaneousReactionParser#react}.
	 * @param ctx the parse tree
	 */
	void enterReact(@NotNull InstantaneousReactionParser.ReactContext ctx);
	/**
	 * Exit a parse tree produced by {@link InstantaneousReactionParser#react}.
	 * @param ctx the parse tree
	 */
	void exitReact(@NotNull InstantaneousReactionParser.ReactContext ctx);
	/**
	 * Enter a parse tree produced by {@link InstantaneousReactionParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(@NotNull InstantaneousReactionParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link InstantaneousReactionParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(@NotNull InstantaneousReactionParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link InstantaneousReactionParser#lop}.
	 * @param ctx the parse tree
	 */
	void enterLop(@NotNull InstantaneousReactionParser.LopContext ctx);
	/**
	 * Exit a parse tree produced by {@link InstantaneousReactionParser#lop}.
	 * @param ctx the parse tree
	 */
	void exitLop(@NotNull InstantaneousReactionParser.LopContext ctx);
	/**
	 * Enter a parse tree produced by {@link InstantaneousReactionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull InstantaneousReactionParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link InstantaneousReactionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull InstantaneousReactionParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link InstantaneousReactionParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void enterPosassignement(@NotNull InstantaneousReactionParser.PosassignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InstantaneousReactionParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void exitPosassignement(@NotNull InstantaneousReactionParser.PosassignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InstantaneousReactionParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull InstantaneousReactionParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link InstantaneousReactionParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull InstantaneousReactionParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link InstantaneousReactionParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterPositiveoperator(@NotNull InstantaneousReactionParser.PositiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link InstantaneousReactionParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitPositiveoperator(@NotNull InstantaneousReactionParser.PositiveoperatorContext ctx);
}