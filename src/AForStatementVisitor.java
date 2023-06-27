public class AForStatementVisitor extends MiniPascalBaseVisitor<AForStatementNode>{
    @Override
    public AForStatementNode visitForStatement(MiniPascalParser.ForStatementContext ctx) {
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
}
