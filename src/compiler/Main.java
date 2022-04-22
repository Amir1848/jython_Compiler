package compiler;

import compiler.ProgramPrinter;
import gen.MainLexer;
import gen.MainListener;
import gen.MainParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream stream = CharStreams.fromFileName("./sample/test.cl");
        MainLexer lexer = new MainLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);
        MainParser parser = new MainParser(tokens);
        parser.setBuildParseTree(true);
        MainParser.ProgramContext tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        MainListener listener = new ProgramPrinter();

        walker.walk(listener, tree);
    }
}
