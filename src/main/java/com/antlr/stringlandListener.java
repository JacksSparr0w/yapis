// Generated from /home/vadim/IdeaProjects/yapis/src/main/resources/stringland.g4 by ANTLR 4.8
package com.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link stringlandParser}.
 */
public interface stringlandListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link stringlandParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(stringlandParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringlandParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(stringlandParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringlandParser#concat}.
	 * @param ctx the parse tree
	 */
	void enterConcat(stringlandParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringlandParser#concat}.
	 * @param ctx the parse tree
	 */
	void exitConcat(stringlandParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringlandParser#make}.
	 * @param ctx the parse tree
	 */
	void enterMake(stringlandParser.MakeContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringlandParser#make}.
	 * @param ctx the parse tree
	 */
	void exitMake(stringlandParser.MakeContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringlandParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(stringlandParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringlandParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(stringlandParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringlandParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(stringlandParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringlandParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(stringlandParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringlandParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(stringlandParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringlandParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(stringlandParser.VarContext ctx);
}