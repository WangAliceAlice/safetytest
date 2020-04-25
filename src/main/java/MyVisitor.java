import jdk.nashorn.internal.ir.Terminal;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.smartcardio.TerminalFactory;
import java.util.concurrent.ConcurrentHashMap;

public class MyVisitor extends frameBaseVisitor {
    ConcurrentHashMap<String, Integer> memory = new ConcurrentHashMap<String, Integer>();


   /* @Override
    public frameParser.NumberLiteralContext visitPrimaryExpression(frameParser.PrimaryExpressionContext ctx) {
        System.out.println("uiuiiij");
        System.out.println(ctx.numberLiteral().DecimalNumber());
        return ctx.numberLiteral();
    }
    */

   /*@Override
   public Integer visitNameValue(frameParser.NameValueContext ctx) {
       Integer value = visit(ctx.expression());
       System.out.println(value);
       return 0;
   }
   */


   /*@Override
    public TerminalNode visitPrimaryExpression(frameParser.PrimaryExpressionContext ctx)
    {
        //String id = ctx.getText();
        //TerminalNode a =ctx.primaryExpression().numberLiteral().DecimalNumber();
        //System.out.println(a);

        //System.out.println("jsdhgiaerhifud");
        //System.out.println(id);
        TerminalNode worth = ctx.numberLiteral().DecimalNumber();
        //System.out.println(worth);
        //Integer x = visit(ctx.numberLiteral());
        return worth;
    }
    */



    /*@Override
    public Integer visitStateVariableDeclaration(frameParser.StateVariableDeclarationContext ctx) {
        String id = ctx.getText();
        Integer value = visit(ctx.expression());
        System.out.println(value);
        memory.put(id, value);
        return value;
    }
    */


   /*@Override
    public TerminalNode visitStateVariableDeclaration(frameParser.StateVariableDeclarationContext ctx) {
        String id = ctx.identifier().getText();
        TerminalNode value = visitPrimaryExpression(ctx.expression().primary());
        //TerminalNode value = ctx.expression().primary().numberLiteral().DecimalNumber();
       System.out.println(id);
        System.out.println(value);
        memory.put(id, value);
        return value;

    }
    */


    //返回数据类型
    @Override
    public Integer visitElementaryTypeName(frameParser.ElementaryTypeNameContext ctx) {
        TerminalNode terminalNode = ctx.Uint();
        //System.out.println(terminalNode);
        return 0;

    }

    /*@Override
    public Integer visitOther(frameParser.OtherContext ctx) {
        String s = ctx.expression(0).primary().numberLiteral().DecimalNumber().getText();
        Integer num = Integer.valueOf(s);
        return num;

    }
    */

    @Override
    public Integer visitPrimaryExpression(frameParser.PrimaryExpressionContext ctx) {
        String s = ctx.numberLiteral().DecimalNumber().getText();
        Integer i = Integer.valueOf(s);
        //System.out.println(i);
        return i;
    }

    /*@Override
    public Integer visitStateVariableDeclaration(frameParser.StateVariableDeclarationContext ctx) {
        String id = ctx.identifier().getText();
        Integer value = (Integer) visit(ctx.expression());
        //Integer value = visitPrimaryExpression(ctx.expression().primary());
        //TerminalNode value = ctx.expression().primary().numberLiteral().DecimalNumber();
       System.out.println(id);
        System.out.println(value);
        memory.put(id, value);
        return value;

    }
    */




    @Override
    public Integer visitComplexaddsub(frameParser.ComplexaddsubContext ctx) {
        Integer left = (Integer) visit(ctx.expression(0));
        Integer right = (Integer) visit(ctx.expression(1));
        Integer result;
        System.out.println(ctx.getText());
        System.out.println(left);
        System.out.println(right);
        if (ctx.PLUS() != null) {
            result = left + right;
            if (result >= left && result >= right) {
                System.out.println(result);
                return result;
            } else {
                System.out.println("加法溢出");
                return 0;
            }

        } else {
            result = left - right;
            if (result <= left && result <= right) {
                System.out.println(result);
                return result;

            } else {
                System.out.println("减法溢出");
                return 0;
            }

        }
    }
}




