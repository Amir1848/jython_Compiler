package gen;// Generated from D:/compiler/jython_Compiler/grammer\Main.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MainParser}.
 */
public interface MainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MainParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MainParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MainParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MainParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MainParser.ExprContext ctx);
}