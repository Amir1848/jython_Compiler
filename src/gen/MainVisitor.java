package gen;// Generated from D:/compiler/jython_Compiler/grammer\Main.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MainParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MainVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MainParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MainParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#importclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportclass(MainParser.ImportclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(MainParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(MainParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(MainParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#arrayDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDec(MainParser.ArrayDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#methodDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDec(MainParser.MethodDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(MainParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MainParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MainParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#return_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statment(MainParser.Return_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#condition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_list(MainParser.Condition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MainParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#if_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statment(MainParser.If_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#while_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statment(MainParser.While_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#if_else_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_statment(MainParser.If_else_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#print_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statment(MainParser.Print_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#for_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statment(MainParser.For_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(MainParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MainParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(MainParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#prefixexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixexp(MainParser.PrefixexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(MainParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(MainParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#arithmetic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_operator(MainParser.Arithmetic_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#relational_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operators(MainParser.Relational_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#assignment_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operators(MainParser.Assignment_operatorsContext ctx);
}