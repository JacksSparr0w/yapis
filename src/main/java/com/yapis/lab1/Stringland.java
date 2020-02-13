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
            "var a set stringa\n" +
                    "var b set stringb\n" +
                    "show a\n" +
                    "show b\n" +
                    "show b\n";

    public static void main(String... arg) {
        StringLandLexer lexer = new StringLandLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        StringLandParser parser = new StringLandParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new StringlandCustomListener(), tree);
    }
}
