// Generated from FastReaction.g4 by ANTLR 4.4

 	
 	package se.gu.parser;
 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FastReactionParser}.
 */
public interface FastReactionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FastReactionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull FastReactionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull FastReactionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexp(@NotNull FastReactionParser.BooleanexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexp(@NotNull FastReactionParser.BooleanexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionParser#ltl}.
	 * @param ctx the parse tree
	 */
	void enterLtl(@NotNull FastReactionParser.LtlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionParser#ltl}.
	 * @param ctx the parse tree
	 */
	void exitLtl(@NotNull FastReactionParser.LtlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(@NotNull FastReactionParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(@NotNull FastReactionParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionParser#react}.
	 * @param ctx the parse tree
	 */
	void enterReact(@NotNull FastReactionParser.ReactContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionParser#react}.
	 * @param ctx the parse tree
	 */
	void exitReact(@NotNull FastReactionParser.ReactContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(@NotNull FastReactionParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(@NotNull FastReactionParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionParser#lop}.
	 * @param ctx the parse tree
	 */
	void enterLop(@NotNull FastReactionParser.LopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionParser#lop}.
	 * @param ctx the parse tree
	 */
	void exitLop(@NotNull FastReactionParser.LopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull FastReactionParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull FastReactionParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionParser#fastReaction}.
	 * @param ctx the parse tree
	 */
	void enterFastReaction(@NotNull FastReactionParser.FastReactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionParser#fastReaction}.
	 * @param ctx the parse tree
	 */
	void exitFastReaction(@NotNull FastReactionParser.FastReactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void enterPosnumAss(@NotNull FastReactionParser.PosnumAssContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void exitPosnumAss(@NotNull FastReactionParser.PosnumAssContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull FastReactionParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull FastReactionParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull FastReactionParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull FastReactionParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void enterPosassignement(@NotNull FastReactionParser.PosassignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void exitPosassignement(@NotNull FastReactionParser.PosassignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterPositiveoperator(@NotNull FastReactionParser.PositiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitPositiveoperator(@NotNull FastReactionParser.PositiveoperatorContext ctx);
}