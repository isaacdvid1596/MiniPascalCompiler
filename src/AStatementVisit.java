import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class AStatementVisit extends MiniPascalBaseVisitor<AStatementNode>{

    private ArrayList<String> delimiters = new ArrayList<>();
    private ArrayList<AVariableNode> variables = new ArrayList<>();

    @Override
    public AStatementNode visitCompountStatement(MiniPascalParser.CompountStatementContext ctx) {
        String beginKeyword = ctx.BEGIN().getText();
        AStatementListVisitor aStatementListVisitor = new AStatementListVisitor();
        AStatementListNode statementListNode = aStatementListVisitor.visit(ctx.statement_list());
        String endKeyword = ctx.END().toString();
        if(endKeyword.equals("")){
            return new ACompoundStatementNode(beginKeyword,statementListNode);
        }
        return new ACompoundStatementNode(beginKeyword, statementListNode, endKeyword);
    }

    @Override
    public AStatementNode visitAssignmentStatement(MiniPascalParser.AssignmentStatementContext ctx) {
        AVariableVisitor aVariableVisitor = new AVariableVisitor();
        AVariableNode variableNode = aVariableVisitor.visit(ctx.variable());
        String assignKeyword = ctx.ASSIGN().getText();
        //ver si es expression o function
        AExpressionVisitor expressionVisitor = new AExpressionVisitor();
        AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression());
        AFunctionCallVisitor functionCallVisitor = new AFunctionCallVisitor();
        AFunctionCallNode functionCallNode = functionCallVisitor.visit(ctx.function_call());
        if(expressionNode != null){
            return new AAssignmentStatementNode(variableNode,assignKeyword,expressionNode);
        }
        return new AAssignmentStatementNode(variableNode,assignKeyword,functionCallNode);
    }

    @Override
    public AStatementNode visitIfStatement(MiniPascalParser.IfStatementContext ctx) {
        String ifKeyword = ctx.IF().getText();
        AExpressionVisitor expressionVisitor = new AExpressionVisitor();
        AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression());
        String thenKeyword = ctx.THEN().getText();
        AStatementNode statementNode = this.visit(ctx.statement(0));
        if(ctx.ELSE()!=null){
            String elseKeyword = ctx.ELSE().getText();
            AStatementNode elseStatementNode = visit(ctx.statement(1));
            return new AIfStatementNode(ifKeyword,expressionNode,thenKeyword,statementNode,elseKeyword,elseStatementNode);
        }
        return new AIfStatementNode(ifKeyword,expressionNode,thenKeyword,statementNode);
    }

    @Override
    public AStatementNode visitWhileStatement(MiniPascalParser.WhileStatementContext ctx) {
        String whileKeyword = ctx.WHILE().getText();
        AExpressionVisitor expressionVisitor = new AExpressionVisitor();
        AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression());
        String doKeyword = ctx.DO().getText();
        AStatementVisit statementVisitor = new AStatementVisit();
        AStatementNode statementNode = statementVisitor.visit(ctx.statement());
        return new AWhileStatementNode(whileKeyword,expressionNode,doKeyword,statementNode);
    }

    @Override
    public AStatementNode visitForStatement(MiniPascalParser.ForStatementContext ctx) {
        String forKeyword = ctx.FOR().getText();
        String identifier = ctx.IDENTIFIER().getText();
        String assign = ctx.ASSIGN().getText();
        AExpressionVisitor expressionVisitor = new AExpressionVisitor();
        AExpressionNode firstExpressionNode = expressionVisitor.visit(ctx.expression(0));
        String toKeyword = ctx.TO().getText();
        AExpressionNode secondExpressionNode = expressionVisitor.visit(ctx.expression(1));
        String doKeyword = ctx.DO().getText();
        AStatementVisit aStatementVisit = new AStatementVisit();
        AStatementNode aStatementNode = aStatementVisit.visit(ctx.statement());
        return new AForStatementNode(forKeyword,identifier,assign,firstExpressionNode,toKeyword,secondExpressionNode,doKeyword,aStatementNode);
    }

    @Override
    public AStatementNode visitRepeatStatement(MiniPascalParser.RepeatStatementContext ctx) {
        String repeatKeyword = ctx.REPEAT().getText();
        AStatementListVisitor statementListVisitor = new AStatementListVisitor();
        AStatementListNode statementListNode = statementListVisitor.visit(ctx.statement_list());
        String untilKeyword = ctx.UNTIL().getText();
        AExpressionVisitor expressionVisitor = new AExpressionVisitor();
        AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression());
        return new ARepeatStatementNode(repeatKeyword,statementListNode,untilKeyword,expressionNode);
    }

    @Override
    public AStatementNode visitWriteStatement(MiniPascalParser.WriteStatementContext ctx) {
        String writeKeyword = ctx.WRITE().getText();
        String leftParenthesis =  ctx.LPAREN().getText();
        AExpressionVisitor expressionVisitor = new AExpressionVisitor();
        AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression());
        String rightParenthesis = ctx.RPAREN().getText();
        return new AWriteStatementNode(writeKeyword,leftParenthesis,expressionNode,rightParenthesis);
    }

    @Override
    public AStatementNode visitReadStatement(MiniPascalParser.ReadStatementContext ctx) {
        String readKeyword = ctx.READ().getText();
        String leftParenthesis = ctx.LPAREN().getText();
        AVariableVisitor variableVisitor = new AVariableVisitor();
        AVariableNode variableNode = variableVisitor.visit(ctx.variable(0));
        if(ctx.DELIMITER() != null && ctx.variable() != null ){
            for(TerminalNode delimiterNode: ctx.DELIMITER()){
                String delimiter = delimiterNode.getText();
                delimiters.add(delimiter);
            }
            for(MiniPascalParser.VariableContext variableContext:ctx.variable()){
                AVariableNode variable = variableVisitor.visit(variableContext);
                variables.add(variable);
            }
            String rightParenthesis = ctx.RPAREN().getText();
            return new AReadStatementNode(readKeyword,leftParenthesis,variableNode,delimiters,variables,rightParenthesis);
        }
        String rightParenthesis = ctx.RPAREN().getText();
        return new AReadStatementNode(readKeyword,leftParenthesis,variableNode,rightParenthesis);
    }

    @Override
    public AStatementNode visitFunctionCall(MiniPascalParser.FunctionCallContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String leftParenthesis = ctx.LPAREN().getText();
        if(ctx.argument_list()!=null){
            AArgumentListVisitor argumentListVisitor = new AArgumentListVisitor();
            AArgumentListNode argumentListNode = argumentListVisitor.visit(ctx.argument_list());
            String rightParenthesis = ctx.RPAREN().getText();
            return new AFunctionCallNode(identifier,leftParenthesis,argumentListNode,rightParenthesis);
        }
        String rightParenthesis = ctx.RPAREN().getText();
        return new AFunctionCallNode(identifier,leftParenthesis,rightParenthesis);
    }
}
