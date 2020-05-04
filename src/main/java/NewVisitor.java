import jdk.nashorn.internal.ir.Terminal;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.persistence.criteria.CriteriaBuilder;
import javax.smartcardio.TerminalFactory;
import java.util.concurrent.ConcurrentHashMap;



public class NewVisitor extends frameBaseVisitor {
    Integer count;
    ConcurrentHashMap<String, Integer> memory = new ConcurrentHashMap<String, Integer>();
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
                //System.out.println(id+" "+value);
            }
            else if (ctx.expression().primary().identifier()!=null)//类似x=y
            {
                  value =memory.get(ctx.expression().primary().identifier().getText());
                  //System.out.println(ctx.expression().primary().identifier().Identifier().getText()+":"+value);
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
        //限制范围
        //byte为-128-127
        String type = ctx.typeName().elementaryTypeName().getText();
        switch (type) {
            case "byte":
                count = 256;
                int a = memory.get(id);
                if (a > 127 || a < -128) {
                    System.out.println("存在整型溢出漏洞");
                }

            case "uint8":
                count = 256;
                int b = memory.get(id);
                if (b < 0 || b > 255) {
                    System.out.println("存在整数溢出漏洞");
                }
            default:
        }
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

    //乘除法检查
    @Override
    public Integer visitMulity(frameParser.MulityContext ctx) {
        Integer left =0;
        Integer right=0;
        System.out.println(ctx.getText());
        //System.out.println(ctx.expression(1).getText());
        left = (Integer) visit(ctx.expression(0));
        right = (Integer) visit(ctx.expression(1));
        Integer result;
        System.out.println(left);
        System.out.println(right);
        if (ctx.MULTIPLY() != null) {
            result = (left * right)%count;
            if (left==0||(result/left==right)) {
                System.out.println(result);
                return result;
            } else {
                System.out.println("乘法溢出");
                return 0;
            }

        } else if(ctx.DIVIDE()!=null){
            if(right>0)
            {
                result = (left / right)%count;
                if (left==result*right+left%right) {
                    System.out.println(result);
                    return result;

                } else {
                    System.out.println("除法溢出");

                }
            }
            else
            {
                System.out.println("除数为0");
            }

        }
        return  0;

    }

    //加减法检查
    @Override
    public Integer visitComplexaddsub(frameParser.ComplexaddsubContext ctx) {
        Integer left =0;
        Integer right=0;
        System.out.println(ctx.getText());
        //System.out.println(ctx.expression(1).getText());
        left = (Integer) visit(ctx.expression(0));
        right = (Integer) visit(ctx.expression(1));
        Integer result;
        System.out.println(left);
        System.out.println(right);
        if (ctx.PLUS() != null) {
            result = (left + right)%count;
            if (result >= left && result >= right) {
                System.out.println(result);
                return result;
            } else {
                System.out.println("加法溢出");
                return 0;
            }

        } else {
            result = (left - right)%count;
            if (right<=left) {
                System.out.println(result);
                return result;

            } else {
                System.out.println("减法溢出");
                return 0;
            }

        }
    }


}
