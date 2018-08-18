// Generated from LTL.g4 by ANTLR 4.4

 	
 	package se.gu.parser;
 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LTLParser}.
 */
public interface LTLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull LTLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull LTLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#ltl}.
	 * @param ctx the parse tree
	 */
	void enterLtl(@NotNull LTLParser.LtlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#ltl}.
	 * @param ctx the parse tree
	 */
	void exitLtl(@NotNull LTLParser.LtlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(@NotNull LTLParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(@NotNull LTLParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void enterPosnumAss(@NotNull LTLParser.PosnumAssContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void exitPosnumAss(@NotNull LTLParser.PosnumAssContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull LTLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull LTLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(@NotNull LTLParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(@NotNull LTLParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull LTLParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull LTLParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#lop}.
	 * @param ctx the parse tree
	 */
	void enterLop(@NotNull LTLParser.LopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#lop}.
	 * @param ctx the parse tree
	 */
	void exitLop(@NotNull LTLParser.LopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void enterPosassignement(@NotNull LTLParser.PosassignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void exitPosassignement(@NotNull LTLParser.PosassignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull LTLParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull LTLParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterPositiveoperator(@NotNull LTLParser.PositiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitPositiveoperator(@NotNull LTLParser.PositiveoperatorContext ctx);
}