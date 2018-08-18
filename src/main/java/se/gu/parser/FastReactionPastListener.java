// Generated from FastReactionPast.g4 by ANTLR 4.4

 	
 	package se.gu.parser;
 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FastReactionPastParser}.
 */
public interface FastReactionPastListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FastReactionPastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull FastReactionPastParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionPastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull FastReactionPastParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionPastParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexp(@NotNull FastReactionPastParser.BooleanexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionPastParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexp(@NotNull FastReactionPastParser.BooleanexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionPastParser#ltl}.
	 * @param ctx the parse tree
	 */
	void enterLtl(@NotNull FastReactionPastParser.LtlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionPastParser#ltl}.
	 * @param ctx the parse tree
	 */
	void exitLtl(@NotNull FastReactionPastParser.LtlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionPastParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(@NotNull FastReactionPastParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionPastParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(@NotNull FastReactionPastParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionPastParser#react}.
	 * @param ctx the parse tree
	 */
	void enterReact(@NotNull FastReactionPastParser.ReactContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionPastParser#react}.
	 * @param ctx the parse tree
	 */
	void exitReact(@NotNull FastReactionPastParser.ReactContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionPastParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(@NotNull FastReactionPastParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionPastParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(@NotNull FastReactionPastParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionPastParser#lop}.
	 * @param ctx the parse tree
	 */
	void enterLop(@NotNull FastReactionPastParser.LopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionPastParser#lop}.
	 * @param ctx the parse tree
	 */
	void exitLop(@NotNull FastReactionPastParser.LopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionPastParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull FastReactionPastParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionPastParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull FastReactionPastParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionPastParser#fastReactionPast}.
	 * @param ctx the parse tree
	 */
	void enterFastReactionPast(@NotNull FastReactionPastParser.FastReactionPastContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionPastParser#fastReactionPast}.
	 * @param ctx the parse tree
	 */
	void exitFastReactionPast(@NotNull FastReactionPastParser.FastReactionPastContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionPastParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void enterPosnumAss(@NotNull FastReactionPastParser.PosnumAssContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionPastParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void exitPosnumAss(@NotNull FastReactionPastParser.PosnumAssContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionPastParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull FastReactionPastParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionPastParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull FastReactionPastParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionPastParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull FastReactionPastParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionPastParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull FastReactionPastParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionPastParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void enterPosassignement(@NotNull FastReactionPastParser.PosassignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionPastParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void exitPosassignement(@NotNull FastReactionPastParser.PosassignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastReactionPastParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterPositiveoperator(@NotNull FastReactionPastParser.PositiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastReactionPastParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitPositiveoperator(@NotNull FastReactionPastParser.PositiveoperatorContext ctx);
}