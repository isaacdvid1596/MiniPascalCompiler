public class LVMStatementListVisitor extends MiniPascalBaseVisitor<String>{
    @Override
    public String visitStatementList(MiniPascalParser.StatementListContext ctx) {
        StringBuilder llvmCode = new StringBuilder();
        LLVMStatementVisitor stmtVisitor = new LLVMStatementVisitor();
        for (var stmt : ctx.statement()) {
            llvmCode.append(stmtVisitor.visit(stmt));
        }
        return llvmCode.toString();
    }
}
