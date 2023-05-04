public class AProgramNode {
    private String identifier;
    private ACodeBlockNode codeblock;

    public AProgramNode(String identifier, ACodeBlockNode codeblock) {
        this.identifier = identifier;
        this.codeblock = codeblock;
    }
}
