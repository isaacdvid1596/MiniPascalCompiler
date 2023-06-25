import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;

public class MiniPascalCompiler {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if(args.length>0) inputFile = args[0];
        InputStream is = System.in;
        if(inputFile!=null) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        MiniPascalLexer lexer = new MiniPascalLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniPascalParser parser = new MiniPascalParser(tokens);
        ParseTree tree = parser.prog();
        AProgramVisitor visitor = new AProgramVisitor();
        visitor.visit(tree);
        System.out.println("Compilation completed successfully!");
        System.out.println("Generating LLVM IR...");
        ALLVMVisitor llvmVisitor = new ALLVMVisitor();
        String llvmCode = llvmVisitor.visit(tree);
        String testLLVM = inputFile+".ll";
        PrintWriter writer = new PrintWriter(new FileWriter(testLLVM));
        writer.println(llvmCode);
        writer.close();
        System.out.println("LLVM IR code written to "+testLLVM);
    }
}
