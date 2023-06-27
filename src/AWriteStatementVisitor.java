public class AWriteStatementVisitor extends MiniPascalBaseVisitor<AWriteStatementNode>{
    @Override
    public AWriteStatementNode visitWriteStatement(MiniPascalParser.WriteStatementContext ctx) {
        String writeKeyword = ctx.WRITE().getText();
        String leftParenthesis =  ctx.LPAREN().getText();
        AExpressionVisitor expressionVisitor = new AExpressionVisitor();
        AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression());
        String rightParenthesis = ctx.RPAREN().getText();
        return new AWriteStatementNode(writeKeyword,leftParenthesis,expressionNode,rightParenthesis);
    }
}
