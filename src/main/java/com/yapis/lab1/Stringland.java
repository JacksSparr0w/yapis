package com.yapis.lab1;

import com.yapis.lab1.antlr.StringLandLexer;
import com.yapis.lab1.antlr.StringLandParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Stringland {
    private static final Logger logger = LogManager.getLogger(Stringland.class);
    private static final String input =
            "VAR a SET stringa\n" +
                    "VAR b SET stringb\n" +
                    "VAR c SET (a CONCAT b)\n" +
                    "VAR d SET ((a CONCAT b) CONCAT c)\n" +
                    "SHOW a\n" +
                    "SHOW b\n" +
                    "SHOW c\n" +
                    "SHOW d\n" +
                    "SHOW unknown var";

    public static void main(String... arg) {
        StringLandLexer lexer = new StringLandLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        StringLandParser parser = new StringLandParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        System.out.println(tree.toStringTree(parser));
        walker.walk(new StringlandCustomListener(), tree);
    }
}
