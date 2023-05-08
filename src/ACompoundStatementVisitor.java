public class ACompoundStatementVisitor extends MiniPascalBaseVisitor<ACompoundStatementNode>{
    @Override
    public ACompoundStatementNode visitCompountStatement(MiniPascalParser.CompountStatementContext ctx) {
        String beginKeyword = ctx.BEGIN().getText();
        AStatementListVisitor statementListVisitor = new AStatementListVisitor();
        AStatementListNode statementListNode= statementListVisitor.visit(ctx.statement_list());
        String end = ctx.END().toString();
        return new ACompoundStatementNode(beginKeyword,statementListNode,end);
    }
}
