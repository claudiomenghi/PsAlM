// Generated from BindedReaction.g4 by ANTLR 4.4

 	
 	package se.gu.parser;
 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BindedReactionParser}.
 */
public interface BindedReactionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BindedReactionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull BindedReactionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedReactionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull BindedReactionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedReactionParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexp(@NotNull BindedReactionParser.BooleanexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedReactionParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexp(@NotNull BindedReactionParser.BooleanexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedReactionParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void enterPosnumAss(@NotNull BindedReactionParser.PosnumAssContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedReactionParser#posnumAss}.
	 * @param ctx the parse tree
	 */
	void exitPosnumAss(@NotNull BindedReactionParser.PosnumAssContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedReactionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull BindedReactionParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedReactionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull BindedReactionParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedReactionParser#react}.
	 * @param ctx the parse tree
	 */
	void enterReact(@NotNull BindedReactionParser.ReactContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedReactionParser#react}.
	 * @param ctx the parse tree
	 */
	void exitReact(@NotNull BindedReactionParser.ReactContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedReactionParser#bindedReaction}.
	 * @param ctx the parse tree
	 */
	void enterBindedReaction(@NotNull BindedReactionParser.BindedReactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedReactionParser#bindedReaction}.
	 * @param ctx the parse tree
	 */
	void exitBindedReaction(@NotNull BindedReactionParser.BindedReactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedReactionParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(@NotNull BindedReactionParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedReactionParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(@NotNull BindedReactionParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedReactionParser#lop}.
	 * @param ctx the parse tree
	 */
	void enterLop(@NotNull BindedReactionParser.LopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedReactionParser#lop}.
	 * @param ctx the parse tree
	 */
	void exitLop(@NotNull BindedReactionParser.LopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedReactionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull BindedReactionParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedReactionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull BindedReactionParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedReactionParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void enterPosassignement(@NotNull BindedReactionParser.PosassignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedReactionParser#posassignement}.
	 * @param ctx the parse tree
	 */
	void exitPosassignement(@NotNull BindedReactionParser.PosassignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedReactionParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull BindedReactionParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedReactionParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull BindedReactionParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BindedReactionParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterPositiveoperator(@NotNull BindedReactionParser.PositiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BindedReactionParser#positiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitPositiveoperator(@NotNull BindedReactionParser.PositiveoperatorContext ctx);
}