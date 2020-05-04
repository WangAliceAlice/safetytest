import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.io.IOUtils;
import org.junit.Ignore;
import org.junit.Test;



public class grammertest {
    private String getFile(String fileName){
        String result = "";

        ClassLoader classLoader = getClass().getClassLoader();
        try {
            result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;

    }

    @Test
    public void testComentsGrammar()  {

        String result = getFile("overflow.sol");


        ANTLRInputStream input = new ANTLRInputStream(result);
        // create a lexer that feeds off of input CharStream
        frameLexer lexer = new frameLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        frameParser parser = new frameParser(tokens);
        //PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
        MyListener underlineListener = new MyListener();
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(underlineListener); // add ours

        ParseTree tree = parser.sourceUnit(); // begin parsing at init rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree


        assertEquals(false, underlineListener.hasError());

    }

}
