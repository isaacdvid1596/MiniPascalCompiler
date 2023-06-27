import java.util.ArrayList;

public class AStatementListVisitor extends MiniPascalBaseVisitor<AStatementListNode>{
    ArrayList<String> semicolons = new ArrayList<>();
    ArrayList<AStatementNode> statements = new ArrayList<>();

    @Override
    public AStatementListNode visitStatementList(MiniPascalParser.StatementListContext ctx) {
        AStatementVisit statementVisit = new AStatementVisit();

        // The first statement is stored separately
        AStatementNode firstStatement = null;

        for(int i = 0; i < ctx.statement().size(); i++) {
            // Visit each statement
            AStatementNode statementNode = statementVisit.visit(ctx.statement(i));

            // The first statement is stored separately
            if (i == 0) {
                firstStatement = statementNode;
            }
            else {
                statements.add(statementNode);
            }

            // If there is a semicolon following the current statement, add it to semicolons list
            if(i < ctx.SEMICOLON().size()) {
                semicolons.add(ctx.SEMICOLON(i).getText());
            }
        }

        if (statements.size() > 0) {
            return new AStatementListNode(firstStatement, semicolons, statements);
        } else {
            return new AStatementListNode(firstStatement, semicolons);
        }
    }
}
