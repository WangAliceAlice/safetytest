import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.*;
import org.apache.commons.io.IOUtils;
public class safety {
    public static  String getFile(String fileName){
        String result = "";

        ClassLoader classLoader = test.class.getClassLoader();
        try {
            result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;

    }


    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(test.getFile("overflow.sol"));
        // create a lexer that feeds off of input CharStream
        frameLexer lexer = new frameLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        frameParser parser = new frameParser(tokens);

        // frameParser.SourceUnitContext sourceUnitContext = parser.sourceUnit();

        //PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
        MyListener underlineListener = new MyListener();

        MyVisitor myVisitor = new MyVisitor();

        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(underlineListener); // add ours

        frameParser.SourceUnitContext sourceUnitContext = parser.sourceUnit();
        myVisitor.visit(sourceUnitContext);


    }
}
