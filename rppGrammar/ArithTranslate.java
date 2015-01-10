import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ArithTranslate {

    public static void main(String[] args) throws Exception {

        if (args.length == 0)
            args = new String[]{"arithmeticsTest.art"};

        System.out.println("parsing: " + args[0]);

        arithmeticsLexer lexer = new arithmeticsLexer(new ANTLRFileStream(args[0]));
        arithmeticsParser parser = new arithmeticsParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.line();
        ArithWalk visitor = new ArithWalk();

        System.out.println(visitor.visit(tree));
    }
}
