// Generated from D:/����/Compiler/src/main/gen/generated\Test.g4 by ANTLR 4.8
package main.gen;

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
	T visitProgram(TestParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(TestParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TestParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(TestParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(TestParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TestParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(TestParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TestParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(TestParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#whilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestatement(TestParser.WhilestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#forstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstatement(TestParser.ForstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#switchstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchstatement(TestParser.SwitchstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TestParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(TestParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(TestParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(TestParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(TestParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(TestParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(TestParser.PrintContext ctx);
}