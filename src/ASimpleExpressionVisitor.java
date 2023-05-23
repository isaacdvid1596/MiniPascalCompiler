
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class ASimpleExpressionVisitor extends MiniPascalBaseVisitor<ASimpleExpressionNode>{
    ArrayList<AAddOperatorNode> addOps = new ArrayList<>();
    ArrayList<String> ors = new ArrayList<>();
    ArrayList<ATermNode> terms = new ArrayList<>();
    @Override
    public ASimpleExpressionNode visitSimpleExpression(MiniPascalParser.SimpleExpressionContext ctx) {
        ATermVisitor termVisitor = new ATermVisitor();
        ATermNode termNode = termVisitor.visit(ctx.term(0));
        if(ctx.addop()!=null && ctx.term()!=null){
            for(MiniPascalParser.AddopContext addopContext : ctx.addop()){
                AAddOperatorVisitor addOperatorVisitor = new AAddOperatorVisitor();
                AAddOperatorNode addOperatorNode = addOperatorVisitor.visit(addopContext);
                addOps.add(addOperatorNode);
            }
            for(MiniPascalParser.TermContext termContext: ctx.term()){
                ATermVisitor secondTermVisitor = new ATermVisitor();
                ATermNode secondTermNode = secondTermVisitor.visit(termContext);
                terms.add(secondTermNode);
            }
            return new ASimpleExpressionNode(termNode,addOps,terms);
        }
        if(ctx.OR()!=null && ctx.term()!=null){
            for(TerminalNode orToken : ctx.OR()){
                String orKeyword = orToken.getText();
                ors.add(orKeyword);
            }
            for(MiniPascalParser.TermContext termContext: ctx.term()){
                ATermVisitor secondTermVisitor = new ATermVisitor();
                ATermNode secondTermNode = secondTermVisitor.visit(termContext);
                terms.add(secondTermNode);
            }
            return new ASimpleExpressionNode(termNode,ors,terms);
        }
        return new ASimpleExpressionNode(termNode);
    }
}
