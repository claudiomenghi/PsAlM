// Generated from BindedDelay.g4 by ANTLR 4.4

 	
 	package se.gu.parser;
 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BindedDelayParser}.
 */
public interface BindedDelayListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BindedDelayParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull BindedDelayParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull BindedDelayParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexp(@NotNull BindedDelayParser.BooleanexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexp(@NotNull BindedDelayParser.BooleanexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayParser#bindedDelay}.
	 * @param ctx the parse tree
	 */
	void enterBindedDelay(@NotNull BindedDelayParser.BindedDelayContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayParser#bindedDelay}.
	 * @param ctx the parse tree
	 */
	void exitBindedDelay(@NotNull BindedDelayParser.BindedDelayContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void enterPosnumAss(@NotNull BindedDelayParser.PosnumAssContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void exitPosnumAss(@NotNull BindedDelayParser.PosnumAssContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull BindedDelayParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull BindedDelayParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayParser#react}.
	 * @param ctx the parse tree
	 */
	void enterReact(@NotNull BindedDelayParser.ReactContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayParser#react}.
	 * @param ctx the parse tree
	 */
	void exitReact(@NotNull BindedDelayParser.ReactContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(@NotNull BindedDelayParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(@NotNull BindedDelayParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayParser#lop}.
	 * @param ctx the parse tree
	 */
	void enterLop(@NotNull BindedDelayParser.LopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayParser#lop}.
	 * @param ctx the parse tree
	 */
	void exitLop(@NotNull BindedDelayParser.LopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull BindedDelayParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull BindedDelayParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void enterPosassignement(@NotNull BindedDelayParser.PosassignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void exitPosassignement(@NotNull BindedDelayParser.PosassignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull BindedDelayParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull BindedDelayParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedDelayParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterPositiveoperator(@NotNull BindedDelayParser.PositiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedDelayParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitPositiveoperator(@NotNull BindedDelayParser.PositiveoperatorContext ctx);
}