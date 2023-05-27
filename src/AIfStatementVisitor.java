public class AIfStatementVisitor extends MiniPascalBaseVisitor<AIfStatementNode>{
    @Override
    public AIfStatementNode visitIfStatement(MiniPascalParser.IfStatementContext ctx) {
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
}
