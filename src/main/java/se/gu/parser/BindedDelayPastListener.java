// Generated from BindedDelayPast.g4 by ANTLR 4.4

 	
 	package se.gu.parser;
 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BindedDelayPastParser}.
 */
public interface BindedDelayPastListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BindedDelayPastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull BindedDelayPastParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayPastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull BindedDelayPastParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayPastParser#bindedDelayPast}.
	 * @param ctx the parse tree
	 */
	void enterBindedDelayPast(@NotNull BindedDelayPastParser.BindedDelayPastContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayPastParser#bindedDelayPast}.
	 * @param ctx the parse tree
	 */
	void exitBindedDelayPast(@NotNull BindedDelayPastParser.BindedDelayPastContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayPastParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexp(@NotNull BindedDelayPastParser.BooleanexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayPastParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexp(@NotNull BindedDelayPastParser.BooleanexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayPastParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void enterPosnumAss(@NotNull BindedDelayPastParser.PosnumAssContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayPastParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void exitPosnumAss(@NotNull BindedDelayPastParser.PosnumAssContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayPastParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull BindedDelayPastParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayPastParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull BindedDelayPastParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayPastParser#react}.
	 * @param ctx the parse tree
	 */
	void enterReact(@NotNull BindedDelayPastParser.ReactContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayPastParser#react}.
	 * @param ctx the parse tree
	 */
	void exitReact(@NotNull BindedDelayPastParser.ReactContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayPastParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(@NotNull BindedDelayPastParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayPastParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(@NotNull BindedDelayPastParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayPastParser#lop}.
	 * @param ctx the parse tree
	 */
	void enterLop(@NotNull BindedDelayPastParser.LopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayPastParser#lop}.
	 * @param ctx the parse tree
	 */
	void exitLop(@NotNull BindedDelayPastParser.LopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayPastParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull BindedDelayPastParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayPastParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull BindedDelayPastParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayPastParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void enterPosassignement(@NotNull BindedDelayPastParser.PosassignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayPastParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void exitPosassignement(@NotNull BindedDelayPastParser.PosassignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayPastParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull BindedDelayPastParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayPastParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull BindedDelayPastParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayPastParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterPositiveoperator(@NotNull BindedDelayPastParser.PositiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayPastParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitPositiveoperator(@NotNull BindedDelayPastParser.PositiveoperatorContext ctx);
}