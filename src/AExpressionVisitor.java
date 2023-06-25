import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class AExpressionVisitor extends MiniPascalBaseVisitor<AExpressionNode>{

    ArrayList<ARelOpNode> relOps = new ArrayList<>();
    ArrayList<String> ands = new ArrayList<>();
    ArrayList<String> ors = new ArrayList<>();
    ArrayList<ASimpleExpressionNode> simpleExpressions = new ArrayList<>();
    ArrayList<String> semicolons = new ArrayList<>();

    private SymbolTable symbolTable = SymbolTable.getInstance();
    @Override
    public AExpressionNode visitExpresion(MiniPascalParser.ExpresionContext ctx) {
        symbolTable.enterScope();
        ASimpleExpressionVisitor simpleExpressionVisitor = new ASimpleExpressionVisitor();
        ASimpleExpressionNode simpleExpressionNode = simpleExpressionVisitor.visit(ctx.simple_expression(0));
        if(ctx.relop()!=null){
            for(MiniPascalParser.RelopContext relopContext: ctx.relop()){
                ARelOpVisitor relOpVisitor = new ARelOpVisitor();
                ARelOpNode relOpNode = relOpVisitor.visit(relopContext);
                relOps.add(relOpNode);
            }
            for(MiniPascalParser.Simple_expressionContext simpleExpressionContext: ctx.simple_expression()){
                ASimpleExpressionVisitor secondSimpleExpressionVisitor = new ASimpleExpressionVisitor();
                ASimpleExpressionNode secondSimpleExpressionNode = secondSimpleExpressionVisitor.visit(simpleExpressionContext);
                simpleExpressions.add(secondSimpleExpressionNode);
            }
            for(TerminalNode terminalNode: ctx.SEMICOLON()){
                String semicolon = terminalNode.getText();
                semicolons.add(semicolon);
            }
            return new AExpressionNode(simpleExpressionNode,relOps,simpleExpressions,semicolons);
        }
        if(ctx.AND()!=null){
            AAndKeywordWrapper aAndKeywordWrapper = null;
            for(TerminalNode terminalNode : ctx.AND()){
                String andKeyword = terminalNode.getText();
                ands.add(andKeyword);
                aAndKeywordWrapper = new AAndKeywordWrapper(ands);
            }
            for(MiniPascalParser.Simple_expressionContext simpleExpressionContext: ctx.simple_expression()){
                ASimpleExpressionVisitor secondSimpleExpressionVisitor = new ASimpleExpressionVisitor();
                ASimpleExpressionNode secondSimpleExpressionNode = secondSimpleExpressionVisitor.visit(simpleExpressionContext);
                simpleExpressions.add(secondSimpleExpressionNode);
            }
            for(TerminalNode terminalNode: ctx.SEMICOLON()){
                String semicolon = terminalNode.getText();
                semicolons.add(semicolon);
            }
            return new AExpressionNode(simpleExpressionNode,aAndKeywordWrapper,simpleExpressions,semicolons);
        }
        if(ctx.OR()!=null){
            AOrKeywordWrapper orKeywordWrapper = null;
            for(TerminalNode terminalNode: ctx.OR()){
                String orKeyword = terminalNode.getText();
                ors.add(orKeyword);
                orKeywordWrapper = new AOrKeywordWrapper(ors);
            }
            for(MiniPascalParser.Simple_expressionContext simpleExpressionContext: ctx.simple_expression()){
                ASimpleExpressionVisitor secondSimpleExpressionVisitor = new ASimpleExpressionVisitor();
                ASimpleExpressionNode secondSimpleExpressionNode = secondSimpleExpressionVisitor.visit(simpleExpressionContext);
                simpleExpressions.add(secondSimpleExpressionNode);
            }
            for(TerminalNode terminalNode: ctx.SEMICOLON()){
                String semicolon = terminalNode.getText();
                semicolons.add(semicolon);
            }
            return new AExpressionNode(simpleExpressionNode,orKeywordWrapper,simpleExpressions,semicolons);
        }
        String semicolon = ctx.SEMICOLON(ctx.getChildCount()-1).getText();
        symbolTable.exitScope();
        AExpressionNode expressionNode = new AExpressionNode(simpleExpressionNode,semicolon);
        expressionNode.setStartToken(ctx.getStart());
        return  expressionNode;
    }
}
