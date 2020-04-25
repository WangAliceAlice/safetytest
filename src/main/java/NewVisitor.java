import jdk.nashorn.internal.ir.Terminal;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.persistence.criteria.CriteriaBuilder;
import javax.smartcardio.TerminalFactory;
import java.util.concurrent.ConcurrentHashMap;



public class NewVisitor extends frameBaseVisitor {
    ConcurrentHashMap<String, Integer> memory = new ConcurrentHashMap<String, Integer>();


    /*@Override
    public Integer visitPrimaryExpression(frameParser.PrimaryExpressionContext ctx) {
        Integer value=0;
        if(ctx.numberLiteral()!=null)
        {
            String s = ctx.numberLiteral().DecimalNumber().getText();

            value = Integer.valueOf(s);

        }
        else if(ctx.identifier()!=null)
        {
            String ss = ctx.identifier().getText();
            System.out.println(ss);
            value =2;
        }
        System.out.println(value);
        return value;
    }
    */


    @Override
    public Object visitStateVariableDeclaration(frameParser.StateVariableDeclarationContext ctx) {
        String id = ctx.identifier().getText();
        Integer value=0;
        if(ctx.expression().primary()!=null)
        {
            if(ctx.expression().primary().numberLiteral()!=null)//类似x=1情况
            {
                String string=ctx.expression().primary().numberLiteral().DecimalNumber().getText().toString();
                value=Integer.valueOf(string);
                memory.put(id,value);
                System.out.println(id+" "+value);
            }
            else if (ctx.expression().primary().identifier()!=null)//类似x=y
            {
                  value =memory.get(ctx.expression().primary().identifier().getText());
                  System.out.println(ctx.expression().primary().identifier().Identifier().getText()+":"+value);
            }

        }

        /*else if (ctx.expression().primary()==null)
        {
            //System.out.println(ctx.expression().complexaddsubContext().getText());
            visitComplexaddsub(ctx.expression().complexaddsubContext());
        }
        */
        else if (ctx.expression().primary()==null)
        {
            value =(Integer) visit(ctx.expression());
            memory.put(id, value);

        }




        //String express =ctx.expression().getText();
        //Integer value = Integer.valueOf(express);
        //System.out.println(express);
        //Integer value = (Integer) visit(ctx.expression());
        //Integer value = visitPrimaryExpression(ctx.expression().primary());
        //TerminalNode value = ctx.expression().primary().numberLiteral().DecimalNumber();
        //System.out.println(id);
        //System.out.println(value);
        //memory.put(id, value);
        //return value;
        return visitChildren(ctx);

    }




    @Override
    public Integer visitPrimaryExpression(frameParser.PrimaryExpressionContext ctx) {
        Integer value=0;
        if(ctx.numberLiteral()!=null)
        {
            String s = ctx.numberLiteral().DecimalNumber().getText();

            value = Integer.valueOf(s);

        }
        else if(ctx.identifier()!=null)
        {
            String ss = ctx.identifier().getText();
            //System.out.println(ss);
            value =memory.get(ctx.identifier().getText());
        }
        //System.out.println(value);
        return value;
    }


    /*@Override
    public Integer visitIdentifier(frameParser.IdentifierContext ctx) {
        String text = ctx.getText();
        if (text.matches("[a-z]+")) {
            String id = text;
            return memory.containsKey(id) ? memory.get(id) : 0;
        }
        return Integer.valueOf(text);
    }
    */




    @Override
    public Integer visitComplexaddsub(frameParser.ComplexaddsubContext ctx) {
        Integer left =0;
        Integer right=0;
        System.out.println(ctx.getText());
        //System.out.println(ctx.expression(1).getText());
        left = (Integer) visit(ctx.expression(0));
        right = (Integer) visit(ctx.expression(1));

        //x=2+3

        /*if(ctx.expression(0)!=null&&ctx.expression(1)!=null)
        {
            if(ctx.expression(0).primary().numberLiteral()!=null&&ctx.expression(1).primary().numberLiteral()!=null)
            {
                String lefts = ctx.expression(0).primary().numberLiteral().DecimalNumber().getText();
                left =Integer.valueOf(lefts);
                String rights = ctx.expression(1).primary().numberLiteral().DecimalNumber().getText();
                right =Integer.valueOf(rights);
            }
            //x=x+1
            else if (ctx.expression(0).primary().identifier()!=null&&ctx.expression(1).primary().numberLiteral()!=null)
            {
                left =memory.get(ctx.expression(0).primary().identifier().getText());
                String rights = ctx.expression(1).primary().numberLiteral().DecimalNumber().getText();
                right =Integer.valueOf(rights);
            }
            //x=1+x
            else if(ctx.expression(1).primary().identifier()!=null&&ctx.expression(0).primary().numberLiteral()!=null)
            {
                String lefts = ctx.expression(1).primary().numberLiteral().DecimalNumber().getText();
                left =Integer.valueOf(lefts);
                right =memory.get(ctx.expression(1).primary().identifier().getText());
            }
            //x=z+y
            else if(ctx.expression(0).primary().identifier()!=null&&ctx.expression(1).primary().identifier()!=null)
            {
                left =memory.get(ctx.expression(0).primary().identifier().getText());
                right=memory.get(ctx.expression(1).primary().identifier().getText());
            }
        }
        */

        Integer result;
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
