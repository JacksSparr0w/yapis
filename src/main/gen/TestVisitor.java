package main.gen;// Generated from /home/litvin/IdeaProjects/ANTLR/gen/generated/Test.g4 by ANTLR 4.5

    import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull TestParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull TestParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull TestParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull TestParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull TestParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull TestParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(@NotNull TestParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull TestParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(@NotNull TestParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#whilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestatement(@NotNull TestParser.WhilestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#forstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstatement(@NotNull TestParser.ForstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(@NotNull TestParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull TestParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(@NotNull TestParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(@NotNull TestParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull TestParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull TestParser.PrintContext ctx);
}