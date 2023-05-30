public class AProgramNode {
    private String programKeyword;
    private String identifier;
    private String semicolon;
    private ACodeBlockNode codeblock;
    public AProgramNode(String programKeyword, String identifier, String semicolon, ACodeBlockNode codeblock) {
        this.programKeyword = programKeyword;
        this.identifier = identifier;
        this.codeblock = codeblock;
        this.semicolon = semicolon;
    }
    @Override
    public String toString() {
        return this.programKeyword+this.identifier+this.semicolon+this.codeblock;
    }
}
