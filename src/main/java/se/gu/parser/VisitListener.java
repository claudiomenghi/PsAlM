// Generated from Visit.g4 by ANTLR 4.4

 	
 	package se.gu.parser;
 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VisitParser}.
 */
public interface VisitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VisitParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull VisitParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull VisitParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexp(@NotNull VisitParser.BooleanexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexp(@NotNull VisitParser.BooleanexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void enterPosnumAss(@NotNull VisitParser.PosnumAssContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void exitPosnumAss(@NotNull VisitParser.PosnumAssContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull VisitParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull VisitParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitParser#visit}.
	 * @param ctx the parse tree
	 */
	void enterVisit(@NotNull VisitParser.VisitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitParser#visit}.
	 * @param ctx the parse tree
	 */
	void exitVisit(@NotNull VisitParser.VisitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitParser#lop}.
	 * @param ctx the parse tree
	 */
	void enterLop(@NotNull VisitParser.LopContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitParser#lop}.
	 * @param ctx the parse tree
	 */
	void exitLop(@NotNull VisitParser.LopContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(@NotNull VisitParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(@NotNull VisitParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull VisitParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull VisitParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void enterPosassignement(@NotNull VisitParser.PosassignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void exitPosassignement(@NotNull VisitParser.PosassignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull VisitParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull VisitParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterPositiveoperator(@NotNull VisitParser.PositiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitPositiveoperator(@NotNull VisitParser.PositiveoperatorContext ctx);
}