public class LLVMAssignmentStatementVisitor extends MiniPascalBaseVisitor<String>{
    @Override
    public String visitAssignmentStatement(MiniPascalParser.AssignmentStatementContext ctx) {
        String varName = ctx.variable().getText();
        String expr = ctx.expression().getText();
        return "store i32 " + expr + ", i32* %" + varName + "\n";
    }
}
