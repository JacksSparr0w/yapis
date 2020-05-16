package main.runnable;

import main.gen.TestLexer;
import main.gen.TestParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
//        File file = new File("TestWithNewFeatures");
        File file = new File("Test");
        TestLexer testLexer = new TestLexer(new ANTLRInputStream(new FileReader(file)));
        TokenStream tokenStream = new CommonTokenStream(testLexer);
        TestParser parser = new TestParser(tokenStream);
        parser.program();
    }
}
