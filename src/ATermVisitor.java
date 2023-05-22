import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class ATermVisitor extends MiniPascalBaseVisitor<ATermNode>{

    ArrayList<AMulOpNode> mulops = new ArrayList<>();
    ArrayList<AFactorNode> factors = new ArrayList<>();
    @Override
    public ATermNode visitTermino(MiniPascalParser.TerminoContext ctx) {
        AFactorVisitor factorVisitor = new AFactorVisitor();
        AFactorNode factorNode = factorVisitor.visit(ctx.factor(0));
        if (ctx.mulop()!=null && ctx.factor(1)!=null){
            for(MiniPascalParser.MulopContext mulopContext: ctx.mulop()){
                AMulOpVisitor mulOpVisitor = new AMulOpVisitor();
                AMulOpNode mulOpNode = mulOpVisitor.visit(mulopContext);
                mulops.add(mulOpNode);
            }
        }
        return null;
    }
}
