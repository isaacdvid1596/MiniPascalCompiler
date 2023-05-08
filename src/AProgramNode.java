public class AProgramNode {
    private String programKeyword;
    private String identifier;
    private ACodeBlockNode codeblock;

    public AProgramNode(String programKeyword, String identifier, ACodeBlockNode codeblock) {
        this.programKeyword = programKeyword;
        this.identifier = identifier;
        this.codeblock = codeblock;
    }
}
