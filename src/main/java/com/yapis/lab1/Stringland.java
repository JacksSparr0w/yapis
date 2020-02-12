package com.yapis.lab1;

import com.antlr.stringlandLexer;
import com.antlr.stringlandParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Stringland {
    private static final Logger logger = LogManager.getLogger(Stringland.class);
    private static final String input =
            "var a set string1\n" +
                    "var b set string2\n" +
                    "var show (a)\n" +
                    "show (b)\n" +
                    "show (b)\n";

    public static void main(String... arg) {
        stringlandLexer lexer = new stringlandLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        stringlandParser parser = new stringlandParser(tokens);
        ParseTree tree = parser.var();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new StringlandCustomListener(), tree);
    }
}
