public class AWhileStatementVisitor extends MiniPascalBaseVisitor<AWhileStatementNode>{
    @Override
    public AWhileStatementNode visitWhileStatement(MiniPascalParser.WhileStatementContext ctx) {
        String whileKeyword = ctx.WHILE().getText();
        AExpressionVisitor expressionVisitor = new AExpressionVisitor();
        AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression());
        String doKeyword = ctx.DO().getText();
        AStatementVisit statementVisitor = new AStatementVisit();
        AStatementNode statementNode = statementVisitor.visit(ctx.statement());
        return new AWhileStatementNode(whileKeyword,expressionNode,doKeyword,statementNode);
    }
}
