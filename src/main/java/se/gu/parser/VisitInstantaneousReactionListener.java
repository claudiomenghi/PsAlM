// Generated from VisitInstantaneousReaction.g4 by ANTLR 4.4

 	
 	package se.gu.parser;
 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VisitInstantaneousReactionParser}.
 */
public interface VisitInstantaneousReactionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VisitInstantaneousReactionParser#visitInstReaction}.
	 * @param ctx the parse tree
	 */
	void enterVisitInstReaction(@NotNull VisitInstantaneousReactionParser.VisitInstReactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitInstantaneousReactionParser#visitInstReaction}.
	 * @param ctx the parse tree
	 */
	void exitVisitInstReaction(@NotNull VisitInstantaneousReactionParser.VisitInstReactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitInstantaneousReactionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull VisitInstantaneousReactionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitInstantaneousReactionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull VisitInstantaneousReactionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitInstantaneousReactionParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexp(@NotNull VisitInstantaneousReactionParser.BooleanexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitInstantaneousReactionParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexp(@NotNull VisitInstantaneousReactionParser.BooleanexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitInstantaneousReactionParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void enterPosnumAss(@NotNull VisitInstantaneousReactionParser.PosnumAssContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitInstantaneousReactionParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void exitPosnumAss(@NotNull VisitInstantaneousReactionParser.PosnumAssContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitInstantaneousReactionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull VisitInstantaneousReactionParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitInstantaneousReactionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull VisitInstantaneousReactionParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitInstantaneousReactionParser#react}.
	 * @param ctx the parse tree
	 */
	void enterReact(@NotNull VisitInstantaneousReactionParser.ReactContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitInstantaneousReactionParser#react}.
	 * @param ctx the parse tree
	 */
	void exitReact(@NotNull VisitInstantaneousReactionParser.ReactContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitInstantaneousReactionParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(@NotNull VisitInstantaneousReactionParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitInstantaneousReactionParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(@NotNull VisitInstantaneousReactionParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitInstantaneousReactionParser#lop}.
	 * @param ctx the parse tree
	 */
	void enterLop(@NotNull VisitInstantaneousReactionParser.LopContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitInstantaneousReactionParser#lop}.
	 * @param ctx the parse tree
	 */
	void exitLop(@NotNull VisitInstantaneousReactionParser.LopContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitInstantaneousReactionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull VisitInstantaneousReactionParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitInstantaneousReactionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull VisitInstantaneousReactionParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitInstantaneousReactionParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void enterPosassignement(@NotNull VisitInstantaneousReactionParser.PosassignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitInstantaneousReactionParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void exitPosassignement(@NotNull VisitInstantaneousReactionParser.PosassignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitInstantaneousReactionParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull VisitInstantaneousReactionParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitInstantaneousReactionParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull VisitInstantaneousReactionParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisitInstantaneousReactionParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterPositiveoperator(@NotNull VisitInstantaneousReactionParser.PositiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisitInstantaneousReactionParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitPositiveoperator(@NotNull VisitInstantaneousReactionParser.PositiveoperatorContext ctx);
}