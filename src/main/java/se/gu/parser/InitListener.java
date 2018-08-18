// Generated from Init.g4 by ANTLR 4.4

 	
 	package se.gu.parser;
 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InitParser}.
 */
public interface InitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InitParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull InitParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link InitParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull InitParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link InitParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull InitParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InitParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull InitParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InitParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(@NotNull InitParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link InitParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(@NotNull InitParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link InitParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void enterPosnumAss(@NotNull InitParser.PosnumAssContext ctx);
	/**
	 * Exit a parse tree produced by {@link InitParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void exitPosnumAss(@NotNull InitParser.PosnumAssContext ctx);
	/**
	 * Enter a parse tree produced by {@link InitParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull InitParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InitParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull InitParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InitParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(@NotNull InitParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link InitParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(@NotNull InitParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link InitParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull InitParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link InitParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull InitParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link InitParser#lop}.
	 * @param ctx the parse tree
	 */
	void enterLop(@NotNull InitParser.LopContext ctx);
	/**
	 * Exit a parse tree produced by {@link InitParser#lop}.
	 * @param ctx the parse tree
	 */
	void exitLop(@NotNull InitParser.LopContext ctx);
	/**
	 * Enter a parse tree produced by {@link InitParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void enterPosassignement(@NotNull InitParser.PosassignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InitParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void exitPosassignement(@NotNull InitParser.PosassignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InitParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull InitParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link InitParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull InitParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link InitParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterPositiveoperator(@NotNull InitParser.PositiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link InitParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitPositiveoperator(@NotNull InitParser.PositiveoperatorContext ctx);
}