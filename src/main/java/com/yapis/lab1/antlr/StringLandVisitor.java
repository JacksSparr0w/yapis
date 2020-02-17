// Generated from /home/vadim/IdeaProjects/yapis/src/main/java/com/yapis/lab1/antlr/StringLand.g4 by ANTLR 4.8
package com.yapis.lab1.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StringLandParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StringLandVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StringLandParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(StringLandParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringLandParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StringLandParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringLandParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(StringLandParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringLandParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(StringLandParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringLandParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(StringLandParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringLandParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(StringLandParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringLandParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(StringLandParser.VarContext ctx);
}