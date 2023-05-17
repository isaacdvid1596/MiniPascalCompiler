import java.util.ArrayList;
import java.util.List;

public class AFunctionBlockVisitor extends MiniPascalBaseVisitor<AFunctionBlockNode> {
    private List<AVarDeclarationNode> varDeclarations = new ArrayList<>();
    private List<ACompoundStatementNode> compoundStatementNodes = new ArrayList<>();

    @Override
    public AFunctionBlockNode visitFunctionBlock(MiniPascalParser.FunctionBlockContext ctx) {

        for(MiniPascalParser.Var_declarationContext varDeclarationContext:ctx.var_declaration()){
            varDeclarations.add(varDeclarationContext.accept(new AVarDeclarationVisitor()));
        }
        String endKeyword = ctx.FUNC_END().getText();
        return new AFunctionBlockNode(varDeclarations, compoundStatementNodes, endKeyword);

    }
}
