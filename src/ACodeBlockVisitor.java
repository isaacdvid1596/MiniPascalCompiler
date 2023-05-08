import java.util.ArrayList;
import java.util.List;

public class ACodeBlockVisitor extends MiniPascalBaseVisitor<ACodeBlockNode>{
    private List<AVarDeclarationNode> varDeclarations = new ArrayList<>();
    private List<AFunctionDeclarationNode> functionDeclarations = new ArrayList<>();
    private List<ACompoundStatementNode> compoundStatementNodes = new ArrayList<>();

    @Override
    public ACodeBlockNode visitCode_Block(MiniPascalParser.Code_BlockContext ctx) {
        for(MiniPascalParser.Var_declarationContext varDeclarationContext:ctx.var_declaration()){
            varDeclarations.add(varDeclarationContext.accept(new AVarDeclarationVisitor()));
        }
        for(MiniPascalParser.Function_declarationContext functionDeclarationContext:ctx.function_declaration()){
            functionDeclarations.add(functionDeclarationContext.accept(new AFunctionDeclarationVisitor()));
        }
        for(MiniPascalParser.Compound_statementContext compoundStatementContext:ctx.compound_statement()){
            compoundStatementNodes.add(compoundStatementContext.accept(new CompoundStatementVisitor()));
        }
        String programEnd = ctx.PROGRAM_END().getText();

        return new ACodeBlockNode(varDeclarations,functionDeclarations,compoundStatementNodes,programEnd);
    }
}
