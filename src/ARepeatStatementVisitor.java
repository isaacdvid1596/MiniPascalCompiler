public class ARepeatStatementVisitor extends MiniPascalBaseVisitor<ARepeatStatementNode>{
    @Override
    public ARepeatStatementNode visitRepeatStatement(MiniPascalParser.RepeatStatementContext ctx) {
        String repeatKeyword = ctx.REPEAT().getText();
        AStatementListVisitor statementListVisitor = new AStatementListVisitor();
        AStatementListNode statementListNode = statementListVisitor.visit(ctx.statement_list());
        String untilKeyword = ctx.UNTIL().getText();
        AExpressionVisitor expressionVisitor = new AExpressionVisitor();
        AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression());
        return new ARepeatStatementNode(repeatKeyword,statementListNode,untilKeyword,expressionNode);
    }
}
