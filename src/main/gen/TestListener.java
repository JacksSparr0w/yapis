// Generated from D:/����/Compiler/src/main/gen/generated\Test.g4 by ANTLR 4.8
package main.gen;

    import main.handle.GrammaHandler;
    import main.handle.MyParser;
    import main.model.*;
    
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
	void enterProgram(TestParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TestParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(TestParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(TestParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TestParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TestParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(TestParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(TestParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(TestParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(TestParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TestParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TestParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(TestParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(TestParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TestParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TestParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(TestParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(TestParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatement(TestParser.WhilestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatement(TestParser.WhilestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void enterForstatement(TestParser.ForstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void exitForstatement(TestParser.ForstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#switchstatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchstatement(TestParser.SwitchstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#switchstatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchstatement(TestParser.SwitchstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TestParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TestParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(TestParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(TestParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(TestParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(TestParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(TestParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(TestParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(TestParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(TestParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(TestParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(TestParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(TestParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(TestParser.PrintContext ctx);
}