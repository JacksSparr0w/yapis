package com.yapis.lab1;

import com.antlr.stringlandBaseListener;
import com.antlr.stringlandParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.List;

public class StringlandCustomListener extends stringlandBaseListener {
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
    public void enterStatement(stringlandParser.StatementContext ctx) {
        logger.log(Level.INFO, "Enter statement");
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(stringlandParser.StatementContext ctx) {
        logger.log(Level.INFO, "Exit statement");

        super.exitStatement(ctx);
    }

    @Override
    public void enterConcat(stringlandParser.ConcatContext ctx) {
        super.enterConcat(ctx);
    }

    @Override
    public void exitConcat(stringlandParser.ConcatContext ctx) {
        super.exitConcat(ctx);
    }

    @Override
    public void enterMake(stringlandParser.MakeContext ctx) {
        super.enterMake(ctx);
    }

    @Override
    public void exitMake(stringlandParser.MakeContext ctx) {
        super.exitMake(ctx);
    }

    @Override
    public void enterSet(stringlandParser.SetContext ctx) {
        logger.log(Level.INFO, "Enter set");
        super.enterSet(ctx);
    }

    @Override
    public void exitSet(stringlandParser.SetContext ctx) {
        logger.log(Level.INFO, "Exit set");
        List<TerminalNode> vars = ctx.STRING();
        if (vars.size() == 2){
            variables.put(vars.get(0).getText(), vars.get(1).getText());
        } else {
            //TODO: Illegal statement
        }
    }

    @Override
    public void enterShow(stringlandParser.ShowContext ctx) {
        logger.log(Level.INFO, "Enter show");
        super.enterShow(ctx);
    }

    @Override
    public void exitShow(stringlandParser.ShowContext ctx) {
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
    public void enterVar(stringlandParser.VarContext ctx) {
        logger.log(Level.INFO, "Enter var");
        super.enterVar(ctx);
    }

    @Override
    public void exitVar(stringlandParser.VarContext ctx) {
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
