public class LLVMCompoundStatementVisitor extends MiniPascalBaseVisitor<String> {
    @Override
    public String visitCompountStatement(MiniPascalParser.CompountStatementContext ctx) {
        StringBuilder llvmCode = new StringBuilder();
        LVMStatementListVisitor statementListVisitor = new LVMStatementListVisitor();
        llvmCode.append(statementListVisitor.visit(ctx.statement_list()));
        return llvmCode.toString();
    }
}
