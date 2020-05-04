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


public class test {

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
        ANTLRInputStream input = new ANTLRInputStream(test.getFile("txorigin.sol"));
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

        //frameParser.SourceUnitContext sourceUnitContext = parser.sourceUnit();
        //myVisitor.visit(sourceUnitContext);
        //System.out.println(parser.numberLiteral().HexNumber());

        //myVisitor.visitNumberLiteral(parser.numberLiteral());
       //System.out.println(parser.numberLiteral().getToken(98,0));
       //System.out.println("\n"+((frameParser.SourceUnitContext) tree).getToken(92,0)+"\n");
        ParseTree tree = parser.sourceUnit(); // begin parsing at init rule
        //System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        //System.out.println(((frameParser.SourceUnitContext) tree).getChild(0));





        //show AST in GUI
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(0.8);//scale a little
        panel.add(viewr);

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setVisible(true);



    }

}
