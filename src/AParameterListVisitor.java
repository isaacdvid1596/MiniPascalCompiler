import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class AParameterListVisitor extends MiniPascalBaseVisitor<AParameterListNode> {
    ArrayList<String> delimiters = new ArrayList<>();
    ArrayList<AParameterDeclarationNode> parameters = new ArrayList<>();
    @Override
    public AParameterListNode visitParameterList(MiniPascalParser.ParameterListContext ctx) {
        if(ctx.parameter_declaration(0)!=null){
            AParameterDeclarationVisitor parameterDeclarationVisitor = new AParameterDeclarationVisitor();
            AParameterDeclarationNode aParameterDeclarationNode = parameterDeclarationVisitor.visit(ctx.parameter_declaration(0));
            if(ctx.DELIMITER()!=null && ctx.parameter_declaration(1)!=null){
                for(TerminalNode delimiterNode:ctx.DELIMITER()){
                    String delimiter = delimiterNode.getText();
                    delimiters.add(delimiter);
                }
                for(MiniPascalParser.Parameter_declarationContext parameterDeclarationContext: ctx.parameter_declaration()){
                    AParameterDeclarationVisitor parameterDeclarationVisit = new AParameterDeclarationVisitor();
                    AParameterDeclarationNode parameterDeclarationNode = parameterDeclarationVisit.visit(parameterDeclarationContext);
                    parameters.add(parameterDeclarationNode);
                }
                return new AParameterListNode(aParameterDeclarationNode,delimiters,parameters);
            }
            return new AParameterListNode(aParameterDeclarationNode);
        }
        return new AParameterListNode();
    }
}
