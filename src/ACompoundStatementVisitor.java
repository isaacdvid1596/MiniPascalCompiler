public class ACompoundStatementVisitor extends MiniPascalBaseVisitor<ACompoundStatementNode>{
    private SymbolTable symbolTable = SymbolTable.getInstance();
    @Override
    public ACompoundStatementNode visitCompountStatement(MiniPascalParser.CompountStatementContext ctx) {
        symbolTable.enterScope();
        String beginKeyword = ctx.BEGIN().getText();
        AStatementListVisitor aStatementListVisitor = new AStatementListVisitor();
        AStatementListNode statementListNode = aStatementListVisitor.visit(ctx.statement_list());
        String endKeyword = ctx.END().toString();
        if(endKeyword.equals("")){
            symbolTable.exitScope();
            return new ACompoundStatementNode(beginKeyword,statementListNode);
        }
        symbolTable.exitScope();
        return new ACompoundStatementNode(beginKeyword, statementListNode, endKeyword);
    }
}
