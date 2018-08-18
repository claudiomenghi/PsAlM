// Generated from Invariant.g4 by ANTLR 4.4

 	
 	package se.gu.parser;
 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InvariantParser}.
 */
public interface InvariantListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InvariantParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull InvariantParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InvariantParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull InvariantParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InvariantParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexp(@NotNull InvariantParser.BooleanexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link InvariantParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexp(@NotNull InvariantParser.BooleanexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link InvariantParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(@NotNull InvariantParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link InvariantParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(@NotNull InvariantParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link InvariantParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void enterPosnumAss(@NotNull InvariantParser.PosnumAssContext ctx);
	/**
	 * Exit a parse tree produced by {@link InvariantParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void exitPosnumAss(@NotNull InvariantParser.PosnumAssContext ctx);
	/**
	 * Enter a parse tree produced by {@link InvariantParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull InvariantParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InvariantParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull InvariantParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InvariantParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(@NotNull InvariantParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link InvariantParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(@NotNull InvariantParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link InvariantParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull InvariantParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link InvariantParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull InvariantParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link InvariantParser#lop}.
	 * @param ctx the parse tree
	 */
	void enterLop(@NotNull InvariantParser.LopContext ctx);
	/**
	 * Exit a parse tree produced by {@link InvariantParser#lop}.
	 * @param ctx the parse tree
	 */
	void exitLop(@NotNull InvariantParser.LopContext ctx);
	/**
	 * Enter a parse tree produced by {@link InvariantParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void enterPosassignement(@NotNull InvariantParser.PosassignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InvariantParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void exitPosassignement(@NotNull InvariantParser.PosassignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InvariantParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull InvariantParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link InvariantParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull InvariantParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link InvariantParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterPositiveoperator(@NotNull InvariantParser.PositiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link InvariantParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitPositiveoperator(@NotNull InvariantParser.PositiveoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link InvariantParser#invariant}.
	 * @param ctx the parse tree
	 */
	void enterInvariant(@NotNull InvariantParser.InvariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link InvariantParser#invariant}.
	 * @param ctx the parse tree
	 */
	void exitInvariant(@NotNull InvariantParser.InvariantContext ctx);
}