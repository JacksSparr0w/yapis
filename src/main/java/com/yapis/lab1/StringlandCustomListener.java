package com.yapis.lab1;

import com.yapis.lab1.antlr.StringLandBaseListener;
import com.yapis.lab1.antlr.StringLandParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class StringlandCustomListener extends StringLandBaseListener {
    private static final Logger logger = LogManager.getLogger(Stringland.class);

    /**
     * We store variables in the Map<String, String>, where
     * the first string it's a name of the variable
     * the second string it's a value ot the variable
     */
    private HashMap<String, String> variables;

    public StringlandCustomListener(){
        this.variables = new HashMap<String, String>();
        logger.log(Level.INFO, "Constructor");
    }

    @Override
    public void enterProgram(StringLandParser.ProgramContext ctx) {
        super.enterProgram(ctx);
    }

    @Override
    public void exitProgram(StringLandParser.ProgramContext ctx) {
        super.exitProgram(ctx);
    }

    @Override
    public void enterStatement(StringLandParser.StatementContext ctx) {
        logger.log(Level.INFO, "Enter statement");
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(StringLandParser.StatementContext ctx) {
        logger.log(Level.INFO, "Exit statement");
        super.exitStatement(ctx);
    }

    @Override
    public void enterExpression(StringLandParser.ExpressionContext ctx) {
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(StringLandParser.ExpressionContext ctx) {
        super.exitExpression(ctx);
    }

    @Override
    public void enterTimes(StringLandParser.TimesContext ctx) {
        super.enterTimes(ctx);
    }

    @Override
    public void exitTimes(StringLandParser.TimesContext ctx) {
        super.exitTimes(ctx);
    }

    @Override
    public void enterConcat(StringLandParser.ConcatContext ctx) {
        super.enterConcat(ctx);
    }

    @Override
    public void exitConcat(StringLandParser.ConcatContext ctx) {
        super.exitConcat(ctx);
    }

    @Override
    public void enterSet(StringLandParser.SetContext ctx) {
        logger.log(Level.INFO, "Enter set");
        super.enterSet(ctx);
    }

    @Override
    public void exitSet(StringLandParser.SetContext ctx) {
        logger.log(Level.INFO, "Exit set");
        if (ctx.var() != null){
            variables.put(ctx.var().STRING().getText(), ctx.expression().getText());
        } else {
            //TODO: Illegal statement
        }
    }

    @Override
    public void enterShow(StringLandParser.ShowContext ctx) {
        logger.log(Level.INFO, "Enter show");
        super.enterShow(ctx);
    }

    @Override
    public void exitShow(StringLandParser.ShowContext ctx) {
        logger.log(Level.INFO, "Exit show");
        if (ctx.STRING() != null){
            if (variables.containsKey(ctx.STRING().getText())){
                System.out.println(variables.get(ctx.STRING().getText()));
            } else {
                //TODO: Unknown var
            }
        } else {
            //TODO: Empty var
        }
    }

    @Override
    public void enterVar(StringLandParser.VarContext ctx) {
        logger.log(Level.INFO, "Enter var");
        super.enterVar(ctx);
    }

    @Override
    public void exitVar(StringLandParser.VarContext ctx) {
        logger.log(Level.INFO, "Exit var");
        super.exitVar(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
