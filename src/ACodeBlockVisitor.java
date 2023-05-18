import java.util.ArrayList;
import java.util.List;

public class ACodeBlockVisitor extends MiniPascalBaseVisitor<ACodeBlockNode>{
    private List<AVarDeclarationNode> varDeclarations = new ArrayList<>();
    private List<AFunctionDeclarationNode> functionDeclarations = new ArrayList<>();
    private List<ACompoundStatementNode> compoundStatements = new ArrayList<>();

    @Override
    public ACodeBlockNode visitCode_Block(MiniPascalParser.Code_BlockContext ctx) {
        if(ctx.var_declaration()!=null){
            for(MiniPascalParser.Var_declarationContext varDeclarationContext : ctx.var_declaration()){
                AVarDeclarationVisitor varDeclarationVisitor = new AVarDeclarationVisitor();
                AVarDeclarationNode varDeclarationNode = varDeclarationVisitor.visit(varDeclarationContext);
                varDeclarations.add(varDeclarationNode);
            }
        }
        if(ctx.function_declaration()!=null){
            for(MiniPascalParser.Function_declarationContext functionDeclarationContext: ctx.function_declaration()){
                AFunctionDeclarationVisit aFunctionDeclarationVisit = new AFunctionDeclarationVisit();
                AFunctionDeclarationNode functionDeclarationNode = aFunctionDeclarationVisit.visit(functionDeclarationContext);
                functionDeclarations.add(functionDeclarationNode);
            }
        }
        if(ctx.compound_statement()!=null){
            for(MiniPascalParser.Compound_statementContext compoundStatementContext: ctx.compound_statement()){
                ACompoundStatementVisitor compoundStatementVisitor = new ACompoundStatementVisitor();
                ACompoundStatementNode compoundStatementNode = compoundStatementVisitor.visit(compoundStatementContext);
                compoundStatements.add(compoundStatementNode);
            }
        }
        String programEndMarker = ctx.PROGRAM_END().getText();
        return new ACodeBlockNode(varDeclarations,functionDeclarations,compoundStatements,programEndMarker);
    }
}
