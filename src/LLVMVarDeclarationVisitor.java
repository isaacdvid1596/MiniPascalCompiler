import java.util.ArrayList;

public class LLVMVarDeclarationVisitor extends MiniPascalBaseVisitor<String>{
    private ArrayList<AVariableDeclarationNode> variableDeclarationNodes = new ArrayList<>();
    private ArrayList<String> semicolons = new ArrayList<>();
    @Override
    public String visitVarDeclaration(MiniPascalParser.VarDeclarationContext ctx) {

        StringBuilder llvmCode = new StringBuilder();
        ALLVMVariableDeclarationVisitor variableDeclarationVisitor = new ALLVMVariableDeclarationVisitor();
        for (var decl : ctx.variable_declaration()) {
            llvmCode.append(variableDeclarationVisitor.visit(decl));
        }
        return llvmCode.toString();

//        StringBuilder llvmCode = new StringBuilder();
////        String varKeyword = ctx.VAR().getText();
//
//        for(MiniPascalParser.Variable_declarationContext variableDeclarationContext: ctx.variable_declaration()){
//            ALLVMVariableDeclarationVisitor variableDeclarationVisitor = new ALLVMVariableDeclarationVisitor();
//            llvmCode.append(variableDeclarationVisitor.visit(variableDeclarationContext));
//        }
//
//        return llvmCode.toString();
    }
}
