


import java.util.concurrent.ConcurrentHashMap;
public class OverflowVisitor extends  frameBaseVisitor {

    ConcurrentHashMap<String, Integer> memory = new ConcurrentHashMap<String, Integer>();

    @Override
    public Object visitStateVariableDeclaration(frameParser.StateVariableDeclarationContext ctx) {
        String id = ctx.identifier().getText();
        Integer value = 0;
        if (ctx.expression().primary() != null) {
            if (ctx.expression().primary().numberLiteral() != null)//类似x=1情况
            {
                String string = ctx.expression().primary().numberLiteral().DecimalNumber().getText().toString();
                value = Integer.valueOf(string);
                memory.put(id, value);
                System.out.println(id + " " + value);

            } else if (ctx.expression().primary().identifier() != null)//类似x=y
            {
                value = memory.get(ctx.expression().primary().identifier().getText());
                System.out.println(value);


            }
        }
        else if (ctx.expression().primary()==null)
        {
             value =(Integer) visit(ctx.expression());
            memory.put(id, value);

        }
        /*else if (ctx.expression().primary() == null) {
            System.out.println(ctx.expression().getText());
            visitComplexaddsub(ctx.expression().complexaddsubContext());
        }
        */
        //System.out.println(ctx.expression().getText());
        return visitChildren(ctx);
    }

    /*@Override
    public Integer visitPrimaryExpression(frameParser.PrimaryExpressionContext ctx) {
        Integer value=0;
        if(ctx.numberLiteral()!=null)
        {
            String s = ctx.numberLiteral().DecimalNumber().getText();

            value = Integer.valueOf(s);
            System.out.println(value);

        }
        else if(ctx.identifier()!=null)
        {
            String ss = ctx.identifier().getText();
            //System.out.println("irejghieor");
            System.out.println(ss);
            value =memory.get(ctx.identifier().getText());
        }
        //System.out.println(value);
        return value;
    }
    */




    @Override
    public Integer visitComplexaddsub(frameParser.ComplexaddsubContext ctx) {
        Integer left =0;
        Integer right=0;
        //System.out.println("fg");
        System.out.println(ctx.getText());
        //System.out.println(ctx.expression(1).getText());
        //left = (Integer) visit(ctx.expression(0));
        //right = (Integer) visit(ctx.expression(1));

        //x=2+3

        if(ctx.expression(0)!=null&&ctx.expression(1)!=null)
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


        Integer result;
        System.out.println("left:"+left);
        System.out.println("right:"+right);
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
