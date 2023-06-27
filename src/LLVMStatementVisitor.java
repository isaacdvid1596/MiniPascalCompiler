public class LLVMStatementVisitor extends MiniPascalBaseVisitor<String>{
    @Override
    public String visitStatement(MiniPascalParser.StatementContext ctx) {
        if (ctx.assignment_statement() != null) {
            LLVMAssignmentStatementVisitor assignmentStatementVisitor = new LLVMAssignmentStatementVisitor();
            return assignmentStatementVisitor.visit(ctx.assignment_statement());
        }
        if(ctx.write_statement()!=null){
            LLVMWriteStatementVisitor writeVisitor = new LLVMWriteStatementVisitor();
            return writeVisitor.visit(ctx.write_statement());
        }
        return "";
    }
}
