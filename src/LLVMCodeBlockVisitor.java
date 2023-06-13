public class LLVMCodeBlockVisitor extends MiniPascalBaseVisitor<String>{
    @Override
    public String visitCode_Block(MiniPascalParser.Code_BlockContext ctx) {
        StringBuilder llvmCode = new StringBuilder();

        if(ctx.var_declaration()!=null){
            LLVMVarDeclarationVisitor varDeclarationVisitor = new LLVMVarDeclarationVisitor();
            for(MiniPascalParser.Var_declarationContext varDeclarationContext : ctx.var_declaration()){
                llvmCode.append(varDeclarationVisitor.visit(varDeclarationContext));
            }
        }
        return llvmCode.toString();
    }
}
