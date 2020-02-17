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
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringlandCustomListener extends StringLandBaseListener {
    private static final Logger logger = LogManager.getLogger(Stringland.class);

    /**
     * We store variables in the Map<String, String>, where
     * the first string it's a name of the variable
     * the second string it's a value ot the variable
     */
    private HashMap<String, String> variables;
    private Stack stack;

    public StringlandCustomListener() {
        this.variables = new HashMap<String, String>();
        this.stack = new Stack();
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
        logger.log(Level.INFO, "Enter expression");

        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(StringLandParser.ExpressionContext ctx) {
        logger.log(Level.INFO, "Exit expression");

        super.exitExpression(ctx);
    }

    @Override
    public void enterConcat(StringLandParser.ConcatContext ctx) {
        logger.log(Level.INFO, "enter concat");

    }

    @Override
    public void exitConcat(StringLandParser.ConcatContext ctx) {
        logger.log(Level.INFO, "exit concat");
        List<StringLandParser.ExpressionContext> nodes = ctx.expression();
        String string = nodes.stream()
                .map(StringLandParser.ExpressionContext::STRING)
                .map(this::findText)
                .filter(Objects::nonNull)
                .collect(Collectors.joining());
        stack.push(string);
    }

    private String findText(TerminalNode node) {
        if (node == null) {
            if (!stack.isEmpty()) {
                return stack.get();
            }
            return "";
        }
        if (variables.containsKey(node.getText())) {
            return variables.get(node.getText());
        }
        return node.getText();
    }

    @Override
    public void enterSet(StringLandParser.SetContext ctx) {
        logger.log(Level.INFO, "Enter set");
        super.enterSet(ctx);
    }

    @Override
    public void exitSet(StringLandParser.SetContext ctx) {
        logger.log(Level.INFO, "Exit set");
        String value;
        if (stack.isEmpty()) {
            value = ctx.expression().getText();
        } else {
            value = stack.get();
        }

        if (ctx.var() != null) {
            variables.put(ctx.var().STRING().getText(), value);
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
        if (ctx.expression() != null) {
            if (variables.containsKey(ctx.expression().getText())) {
                System.out.println("SHOW VAR " + variables.get(ctx.expression().getText()));
            } else {
                System.out.println("SHOW " + ctx.expression().getText());
            }
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
        if (ctx.STRING() != null) {
            variables.put(ctx.STRING().getText(), null);
        }
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
        logger.log(Level.ERROR, "Error: " + node.getText());
        super.visitErrorNode(node);
    }
}
