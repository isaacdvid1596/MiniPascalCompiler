import java.util.ArrayList;
import java.util.List;

public class AFunctionBlockVisit extends MiniPascalBaseVisitor <AFunctionBlockNode>{
    private List<AVarDeclarationNode> varDeclarationNodes = new ArrayList<>();
    @Override
    public AFunctionBlockNode visitFunctionBlock(MiniPascalParser.FunctionBlockContext ctx) {
        if(ctx.var_declaration()!=null){
            for(MiniPascalParser.Var_declarationContext varDeclarationContext : ctx.var_declaration()){
                AVarDeclarationVisitor varDeclarationVisitor = new AVarDeclarationVisitor();
                AVarDeclarationNode varDeclarationNode = varDeclarationVisitor.visit(varDeclarationContext);
                varDeclarationNodes.add(varDeclarationNode);
            }
        }

        ACompoundStatementVisitor aCompoundStatementVisitor = new ACompoundStatementVisitor();
        ACompoundStatementNode compoundStatementNode = aCompoundStatementVisitor.visit(ctx.compound_statement());

        String functionEndKeyword = ctx.FUNC_END().getText();
        return new AFunctionBlockNode(varDeclarationNodes,compoundStatementNode,functionEndKeyword);
    }
}
