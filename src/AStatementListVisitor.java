import java.util.ArrayList;

public class AStatementListVisitor extends MiniPascalBaseVisitor<AStatementListNode>{
    ArrayList<String> semicolons = new ArrayList<>();
    ArrayList<AStatementNode> statements = new ArrayList<>();
    @Override
    public AStatementListNode visitStatementList(MiniPascalParser.StatementListContext ctx) {
//        ArrayList<AStatementNode> statements = new ArrayList<>();
//        ArrayList<String> semicolons = new ArrayList<>();
//
//        AStatementVisit statementVisit = new AStatementVisit();
//
//        for (int i = 0; i < ctx.statement().size(); i++) {
//            AStatementNode statementNode = statementVisit.visit(ctx.statement(i));
//            statements.add(statementNode);
//
//            // Check if there's a SEMICOLON following the statement
//            if (ctx.SEMICOLON(i) != null) {
//                String semicolon = ctx.SEMICOLON(i).getText();
//                semicolons.add(semicolon);
//            }
//        }
//
////        return new AStatementListNode(statements, semicolons);
//        return null;
//    }
//    }
        return null;
    }
}
