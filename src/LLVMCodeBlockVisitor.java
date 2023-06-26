public class LLVMCodeBlockVisitor extends MiniPascalBaseVisitor<String>{
    @Override
    public String visitCode_Block(MiniPascalParser.Code_BlockContext ctx) {
        StringBuilder llvmCode = new StringBuilder();

        LLVMVarDeclarationVisitor varDeclarationVisitor = new LLVMVarDeclarationVisitor();
        for(var decl:ctx.var_declaration()){
            llvmCode.append(varDeclarationVisitor.visit(decl));
        }
        LLVMCompoundStatementVisitor compoundStatementVisitor = new LLVMCompoundStatementVisitor();
        for(var stmt: ctx.compound_statement()){
            llvmCode.append(compoundStatementVisitor.visit(stmt));
        }
        return llvmCode.toString();

//        if(ctx.var_declaration()!=null){
//            LLVMVarDeclarationVisitor varDeclarationVisitor = new LLVMVarDeclarationVisitor();
//            for(MiniPascalParser.Var_declarationContext varDeclarationContext : ctx.var_declaration()){
//                llvmCode.append(varDeclarationVisitor.visit(varDeclarationContext));
//            }
//        }
//        return llvmCode.toString();
    }
}
