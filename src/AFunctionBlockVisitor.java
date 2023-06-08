import java.util.ArrayList;
import java.util.List;

public class AFunctionBlockVisitor extends MiniPascalBaseVisitor<AFunctionBlockNode> {
    private List<AVarDeclarationNode> varDeclarations = new ArrayList<>();

    private SymbolTable symbolTable = SymbolTable.getInstance();
    @Override
    public AFunctionBlockNode visitFunctionBlock(MiniPascalParser.FunctionBlockContext ctx) {
        symbolTable.enterScope();
        if(ctx.var_declaration()!=null){
            for(MiniPascalParser.Var_declarationContext varDeclarationContext : ctx.var_declaration()){
                AVarDeclarationVisitor varDeclarationVisitor = new AVarDeclarationVisitor();
                AVarDeclarationNode varDeclarationNode = varDeclarationVisitor.visit(varDeclarationContext);
                varDeclarations.add(varDeclarationNode);
                for(AVariableDeclarationNode variableDeclarationNode : varDeclarationNode.getVariableDeclarations()){
                    symbolTable.addVariable(variableDeclarationNode.getIdentifier(), null);
                }
            }
            ACompoundStatementVisitor compoundStatementVisitor =  new ACompoundStatementVisitor();
            ACompoundStatementNode compoundStatementNode = compoundStatementVisitor.visit(ctx.compound_statement());
            String endKeyword = ctx.FUNC_END().getText();
            symbolTable.exitScope();
            return new AFunctionBlockNode(varDeclarations, compoundStatementNode, endKeyword);
        }
        ACompoundStatementVisitor compoundStatementVisitor =  new ACompoundStatementVisitor();
        ACompoundStatementNode compoundStatementNode = compoundStatementVisitor.visit(ctx.compound_statement());
        String endKeyword = ctx.FUNC_END().getText();
        symbolTable.exitScope();
        return new AFunctionBlockNode(compoundStatementNode,endKeyword);
    }
}
