public class ACompoundStatementVisitor extends MiniPascalBaseVisitor<ACompoundStatementNode>{
    @Override
    public ACompoundStatementNode visitCompountStatement(MiniPascalParser.CompountStatementContext ctx) {
        String beginKeyword = ctx.BEGIN().getText();
        AStatementListVisitor aStatementListVisitor = new AStatementListVisitor();
        AStatementListNode statementListNode = aStatementListVisitor.visit(ctx.statement_list());
        String endKeyword = ctx.END().toString();
        if(endKeyword.equals("")){
            return new ACompoundStatementNode(beginKeyword,statementListNode);
        }
        return new ACompoundStatementNode(beginKeyword, statementListNode, endKeyword);
    }
}
