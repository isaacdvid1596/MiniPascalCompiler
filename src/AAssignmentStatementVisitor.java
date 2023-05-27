public class AAssignmentStatementVisitor extends MiniPascalBaseVisitor<AAssignmentStatementNode>{
    @Override
    public AAssignmentStatementNode visitAssignmentStatement(MiniPascalParser.AssignmentStatementContext ctx) {
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
}
