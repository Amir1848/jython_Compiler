package compiler;

import gen.MainListener;
import gen.MainParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ProgramPrinter implements MainListener {
    private boolean isInClassFlag = false;
    private boolean isInMethodFlag = false;
    private boolean isInConstructorFlag = false;


    private boolean isInClassPure(){
        return isInClassFlag && !isInMethodFlag && !isInConstructorFlag;
    }

    private boolean isInMethodPure(){
        return isInClassFlag && isInMethodFlag && !isInConstructorFlag;
    }

    private boolean isInConstructorPure(){
        return isInClassFlag && !isInMethodFlag && isInConstructorFlag;
    }

    @Override
    public void enterProgram(MainParser.ProgramContext ctx) {
        System.out.println("program start () {");
    }

    @Override
    public void exitProgram(MainParser.ProgramContext ctx) {
        System.out.println("}");
    }

    @Override
    public void enterImportclass(MainParser.ImportclassContext ctx) {
        System.out.println("    import class:" + ctx.CLASSNAME());
    }

    @Override
    public void exitImportclass(MainParser.ImportclassContext ctx) {

    }

    @Override
    public void enterClassDef(MainParser.ClassDefContext ctx) {
        this.isInClassFlag = true;
        var stringBuilder = new StringBuilder(ProgramPrinterHelper.getTab() + "class: " + ctx.CLASSNAME(0) + "/ ");
        var hasAnyParentClass = ctx.CLASSNAME().size() > 0;
        if(hasAnyParentClass){
            stringBuilder.append("class parents: (");
            int i = 1;
            while(true){
                var className = ctx.CLASSNAME(i);
                if(className != null){
                    stringBuilder.append(className.toString()+",");
                }else{
                    var newLengthWithoutComma = stringBuilder.length() - 1;
                    stringBuilder.setLength(newLengthWithoutComma);
                    break;
                }
                i++;
            }
            stringBuilder.append("){");
        }
        System.out.println(stringBuilder.toString());
    }

    @Override
    public void exitClassDef(MainParser.ClassDefContext ctx) {
        this.isInClassFlag = false;
        System.out.println(ProgramPrinterHelper.getTab() + "}");
    }

    @Override
    public void enterClass_body(MainParser.Class_bodyContext ctx) {

    }

    @Override
    public void exitClass_body(MainParser.Class_bodyContext ctx) {

    }

    @Override
    public void enterVarDec(MainParser.VarDecContext ctx) {
        var tabString = GetTabForExpression(ExpressionType.Field);
        var stringBuilderResult = new StringBuilder( tabString +"field: "+ ctx.ID() + "/ type= ");
        var hasType = ctx.TYPE() != null;
        var typeOrClassName = hasType ? ctx.TYPE() : ctx.CLASSNAME();
        stringBuilderResult.append(typeOrClassName);
        System.out.println(stringBuilderResult);
    }

    @Override
    public void exitVarDec(MainParser.VarDecContext ctx) {

    }

    @Override
    public void enterArrayDec(MainParser.ArrayDecContext ctx) {
        var tabString = GetTabForExpression(ExpressionType.Field);
        var result = new StringBuilder(tabString);
        var hasType = ctx.TYPE() != null;
        var variableName =  hasType ? ctx.TYPE() : ctx.CLASSNAME();
        result.append("field: " + variableName + "/ type= " +   variableName );
        System.out.println(result);
    }

    @Override
    public void exitArrayDec(MainParser.ArrayDecContext ctx) {

    }

    @Override
    public void enterMethodDec(MainParser.MethodDecContext ctx) {
        this.isInMethodFlag = true;
    }

    @Override
    public void exitMethodDec(MainParser.MethodDecContext ctx) {
        this.isInMethodFlag = false;
    }

    @Override
    public void enterConstructor(MainParser.ConstructorContext ctx) {
        this.isInConstructorFlag = true;
        var tabString = GetTabForExpression(ExpressionType.Constructor);
        var result = new StringBuilder(tabString + "class constructor: " + ctx.CLASSNAME() + "{\n" );
        result.append(ProgramPrinterHelper.getTab(3) + "parameter list: "+ ctx.parameter());
        System.out.println(result);
    }

    @Override
    public void exitConstructor(MainParser.ConstructorContext ctx) {
        this.isInConstructorFlag = false;
    }

    @Override
    public void enterParameter(MainParser.ParameterContext ctx) {

    }

    @Override
    public void exitParameter(MainParser.ParameterContext ctx) {

    }

    @Override
    public void enterStatement(MainParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(MainParser.StatementContext ctx) {

    }

    @Override
    public void enterReturn_statment(MainParser.Return_statmentContext ctx) {

    }

    @Override
    public void exitReturn_statment(MainParser.Return_statmentContext ctx) {

    }

    @Override
    public void enterCondition_list(MainParser.Condition_listContext ctx) {

    }

    @Override
    public void exitCondition_list(MainParser.Condition_listContext ctx) {

    }

    @Override
    public void enterCondition(MainParser.ConditionContext ctx) {

    }

    @Override
    public void exitCondition(MainParser.ConditionContext ctx) {

    }

    @Override
    public void enterIf_statment(MainParser.If_statmentContext ctx) {

    }

    @Override
    public void exitIf_statment(MainParser.If_statmentContext ctx) {

    }

    @Override
    public void enterWhile_statment(MainParser.While_statmentContext ctx) {

    }

    @Override
    public void exitWhile_statment(MainParser.While_statmentContext ctx) {

    }

    @Override
    public void enterIf_else_statment(MainParser.If_else_statmentContext ctx) {

    }

    @Override
    public void exitIf_else_statment(MainParser.If_else_statmentContext ctx) {

    }

    @Override
    public void enterPrint_statment(MainParser.Print_statmentContext ctx) {

    }

    @Override
    public void exitPrint_statment(MainParser.Print_statmentContext ctx) {

    }

    @Override
    public void enterFor_statment(MainParser.For_statmentContext ctx) {

    }

    @Override
    public void exitFor_statment(MainParser.For_statmentContext ctx) {

    }

    @Override
    public void enterMethod_call(MainParser.Method_callContext ctx) {

    }

    @Override
    public void exitMethod_call(MainParser.Method_callContext ctx) {

    }

    @Override
    public void enterAssignment(MainParser.AssignmentContext ctx) {

    }

    @Override
    public void exitAssignment(MainParser.AssignmentContext ctx) {

    }

    @Override
    public void enterExp(MainParser.ExpContext ctx) {

    }

    @Override
    public void exitExp(MainParser.ExpContext ctx) {

    }

    @Override
    public void enterPrefixexp(MainParser.PrefixexpContext ctx) {

    }

    @Override
    public void exitPrefixexp(MainParser.PrefixexpContext ctx) {

    }

    @Override
    public void enterArgs(MainParser.ArgsContext ctx) {

    }

    @Override
    public void exitArgs(MainParser.ArgsContext ctx) {

    }

    @Override
    public void enterExplist(MainParser.ExplistContext ctx) {

    }

    @Override
    public void exitExplist(MainParser.ExplistContext ctx) {

    }

    @Override
    public void enterArithmetic_operator(MainParser.Arithmetic_operatorContext ctx) {

    }

    @Override
    public void exitArithmetic_operator(MainParser.Arithmetic_operatorContext ctx) {

    }

    @Override
    public void enterRelational_operators(MainParser.Relational_operatorsContext ctx) {

    }

    @Override
    public void exitRelational_operators(MainParser.Relational_operatorsContext ctx) {

    }

    @Override
    public void enterAssignment_operators(MainParser.Assignment_operatorsContext ctx) {

    }

    @Override
    public void exitAssignment_operators(MainParser.Assignment_operatorsContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }

    private String GetTabForExpression(ExpressionType exType){
        switch (exType) {
            case Field:
                return GetTabForFieldExpression();
            case Class:
                return ProgramPrinterHelper.getTab();
            case Method:
            case Constructor:
                return ProgramPrinterHelper.getTab(2);
            default:
                return "";
        }
    }

    private String GetTabForFieldExpression(){
        int tabSize = 0;
        if(this.isInClassPure()){
            tabSize = 2;
        }else{
            tabSize = 3;
        }

        return ProgramPrinterHelper.getTab(tabSize);
    }
}



class ProgramPrinterHelper{
    private static String tabString = "    ";

    public static String getTab(int tabNumber){
        var tabResult = new StringBuilder();
        for (int i = 0; i < tabNumber; i++) {
            tabResult.append(getTab());
        }

        return  tabResult.toString();
    }

    public static String getTab(){
        return tabString;
    }
}


enum ExpressionType {
    Field,
    Class,
    Method,
    Constructor
}