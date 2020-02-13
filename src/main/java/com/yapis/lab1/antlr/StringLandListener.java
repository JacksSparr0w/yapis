// Generated from /home/vadim/IdeaProjects/yapis/src/main/java/com/yapis/lab1/antlr/StringLand.g4 by ANTLR 4.8
package com.yapis.lab1.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StringLandParser}.
 */
public interface StringLandListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StringLandParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StringLandParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringLandParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StringLandParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringLandParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StringLandParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringLandParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StringLandParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringLandParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(StringLandParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringLandParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(StringLandParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringLandParser#times}.
	 * @param ctx the parse tree
	 */
	void enterTimes(StringLandParser.TimesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringLandParser#times}.
	 * @param ctx the parse tree
	 */
	void exitTimes(StringLandParser.TimesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringLandParser#concat}.
	 * @param ctx the parse tree
	 */
	void enterConcat(StringLandParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringLandParser#concat}.
	 * @param ctx the parse tree
	 */
	void exitConcat(StringLandParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringLandParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(StringLandParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringLandParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(StringLandParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringLandParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(StringLandParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringLandParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(StringLandParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringLandParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(StringLandParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringLandParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(StringLandParser.VarContext ctx);
}