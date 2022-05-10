package gen;// Generated from D:/compiler/jython_Compiler/grammar\Main.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MainParser}.
 */
public interface MainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MainParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MainParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MainParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#importclass}.
	 * @param ctx the parse tree
	 */
	void enterImportclass(MainParser.ImportclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#importclass}.
	 * @param ctx the parse tree
	 */
	void exitImportclass(MainParser.ImportclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(MainParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(MainParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(MainParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(MainParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(MainParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(MainParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void enterArrayDec(MainParser.ArrayDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void exitArrayDec(MainParser.ArrayDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void enterMethodDec(MainParser.MethodDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void exitMethodDec(MainParser.MethodDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(MainParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(MainParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MainParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MainParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MainParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MainParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#return_statment}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statment(MainParser.Return_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#return_statment}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statment(MainParser.Return_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#condition_list}.
	 * @param ctx the parse tree
	 */
	void enterCondition_list(MainParser.Condition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#condition_list}.
	 * @param ctx the parse tree
	 */
	void exitCondition_list(MainParser.Condition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MainParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MainParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#if_statment}.
	 * @param ctx the parse tree
	 */
	void enterIf_statment(MainParser.If_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#if_statment}.
	 * @param ctx the parse tree
	 */
	void exitIf_statment(MainParser.If_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#while_statment}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statment(MainParser.While_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#while_statment}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statment(MainParser.While_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#if_else_statment}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_statment(MainParser.If_else_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#if_else_statment}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_statment(MainParser.If_else_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#print_statment}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statment(MainParser.Print_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#print_statment}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statment(MainParser.Print_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#for_statment}.
	 * @param ctx the parse tree
	 */
	void enterFor_statment(MainParser.For_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#for_statment}.
	 * @param ctx the parse tree
	 */
	void exitFor_statment(MainParser.For_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(MainParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(MainParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MainParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MainParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(MainParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(MainParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexp(MainParser.PrefixexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexp(MainParser.PrefixexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(MainParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(MainParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(MainParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(MainParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operator(MainParser.Arithmetic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operator(MainParser.Arithmetic_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#relational_operators}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operators(MainParser.Relational_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#relational_operators}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operators(MainParser.Relational_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#assignment_operators}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operators(MainParser.Assignment_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#assignment_operators}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operators(MainParser.Assignment_operatorsContext ctx);
}