import java.util.ArrayList;
import java.util.List;

public class AFunctionBlockVisitor extends MiniPascalBaseVisitor<AFunctionBlockNode> {
    private List<AVarDeclarationNode> varDeclarations = new ArrayList<>();


    @Override
    public AFunctionBlockNode visitFunctionBlock(MiniPascalParser.FunctionBlockContext ctx) {

        if(ctx.var_declaration()!=null){
            for(MiniPascalParser.Var_declarationContext varDeclarationContext : ctx.var_declaration()){
                AVarDeclarationVisitor varDeclarationVisitor = new AVarDeclarationVisitor();
                AVarDeclarationNode varDeclarationNode = varDeclarationVisitor.visit(varDeclarationContext);
                varDeclarations.add(varDeclarationNode);
            }
            ACompoundStatementVisitor compoundStatementVisitor =  new ACompoundStatementVisitor();
            ACompoundStatementNode compoundStatementNode = compoundStatementVisitor.visit(ctx.compound_statement());
            String endKeyword = ctx.FUNC_END().getText();
            return new AFunctionBlockNode(varDeclarations, compoundStatementNode, endKeyword);
        }
        ACompoundStatementVisitor compoundStatementVisitor =  new ACompoundStatementVisitor();
        ACompoundStatementNode compoundStatementNode = compoundStatementVisitor.visit(ctx.compound_statement());
        String endKeyword = ctx.FUNC_END().getText();
        return new AFunctionBlockNode(compoundStatementNode,endKeyword);
    }
}
