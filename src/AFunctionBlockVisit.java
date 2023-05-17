import java.util.List;

public class AFunctionBlockVisit extends MiniPascalBaseVisitor <AFunctionBlockNode>{
    private List<AVarDeclarationNode> varDeclarationNodes;
    @Override
    public AFunctionBlockNode visitFunctionBlock(MiniPascalParser.FunctionBlockContext ctx) {
        AVarDeclarationVisitor varDeclarationVisitor = new AVarDeclarationVisitor();
        AVarDeclarationNode varDeclarationNode = varDeclarationVisitor.visit();

    }
}
