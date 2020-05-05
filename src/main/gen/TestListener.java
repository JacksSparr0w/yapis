package main.gen;

    import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull TestParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull TestParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull TestParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull TestParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull TestParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull TestParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull TestParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull TestParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull TestParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull TestParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull TestParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull TestParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(@NotNull TestParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(@NotNull TestParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull TestParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull TestParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(@NotNull TestParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(@NotNull TestParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatement(@NotNull TestParser.WhilestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatement(@NotNull TestParser.WhilestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void enterForstatement(@NotNull TestParser.ForstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void exitForstatement(@NotNull TestParser.ForstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(@NotNull TestParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(@NotNull TestParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull TestParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull TestParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull TestParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull TestParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull TestParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull TestParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull TestParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull TestParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull TestParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull TestParser.PrintContext ctx);
}