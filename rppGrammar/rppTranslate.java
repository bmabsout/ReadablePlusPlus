import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

public class rppTranslate {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"rppTest.rpp"};
        }

        System.out.println("parsing: " + args[0]);

        rppLexer lexer = new rppLexer(new ANTLRFileStream(args[0]));
        rppParser parser = new rppParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.compilationUnit();
        rppWalk visitor = new rppWalk();
        System.out.println(visitor.visit(tree));
    }
}
