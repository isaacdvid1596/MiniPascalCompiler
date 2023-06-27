import java.util.ArrayList;

public class AStatementVisit extends MiniPascalBaseVisitor<AStatementNode>{

    private ArrayList<String> delimiters = new ArrayList<>();
    private ArrayList<AVariableNode> variables = new ArrayList<>();

    @Override
    public AStatementNode visitStatement(MiniPascalParser.StatementContext ctx) {
        if(ctx.compound_statement()!=null){
            ACompoundStatementVisitor aCompoundStatementVisitor = new ACompoundStatementVisitor();
            ACompoundStatementNode compoundStatementNode = aCompoundStatementVisitor.visit(ctx.compound_statement());
            return compoundStatementNode;
        }else if(ctx.assignment_statement()!=null){
            AAssignmentStatementVisitor assignmentStatementVisitor = new AAssignmentStatementVisitor();
            AAssignmentStatementNode assignmentStatementNode = assignmentStatementVisitor.visit(ctx.assignment_statement());
            return assignmentStatementNode;
        }else if(ctx.if_statement()!=null){
            AIfStatementVisitor ifStatementVisitor = new AIfStatementVisitor();
            AIfStatementNode ifStatementNode = ifStatementVisitor.visit(ctx.if_statement());
            return ifStatementNode;
        }else if(ctx.while_statement()!=null){
            AWhileStatementVisitor whileStatementVisitor = new AWhileStatementVisitor();
            AWhileStatementNode whileStatementNode = whileStatementVisitor.visit(ctx.while_statement());
            return whileStatementNode;
        } else if(ctx.for_statement()!=null){
            AForStatementVisitor forStatementVisitor = new AForStatementVisitor();
            AForStatementNode forStatementNode = forStatementVisitor.visit(ctx.for_statement());
            return forStatementNode;
        }else if(ctx.repeat_statement()!=null){
            ARepeatStatementVisitor repeatStatementVisitor = new ARepeatStatementVisitor();
            ARepeatStatementNode repeatStatementNode = repeatStatementVisitor.visit(ctx.repeat_statement());
            return repeatStatementNode;
        }else if(ctx.write_statement()!=null){
            AWriteStatementVisitor writeStatementVisitor = new AWriteStatementVisitor();
            AWriteStatementNode writeStatementNode = writeStatementVisitor.visit(ctx.write_statement());
            return writeStatementNode;
        }else if(ctx.read_statement()!=null){
            AReadStatementVisitor aReadStatementVisit = new AReadStatementVisitor();
            AReadStatementNode readStatementNode = aReadStatementVisit.visit(ctx.read_statement());
            return readStatementNode;
        }else if(ctx.function_call()!=null){
            AFunctionCallVisitor aFunctionCallVisitor = new AFunctionCallVisitor();
            AFunctionCallNode functionCallNode = aFunctionCallVisitor.visit(ctx.function_call());
            return functionCallNode;
        }
        return null;
    }
}
