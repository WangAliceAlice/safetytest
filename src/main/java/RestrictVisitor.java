import jdk.nashorn.internal.ir.Terminal;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.persistence.criteria.CriteriaBuilder;
import javax.smartcardio.TerminalFactory;
import java.util.concurrent.ConcurrentHashMap;
public class RestrictVisitor extends frameBaseVisitor {

    int count;

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
                //System.out.println(id + " " + value);

            } else if (ctx.expression().primary().identifier() != null)//类似x=y
            {
                value = memory.get(ctx.expression().primary().identifier().getText());
                //System.out.println(value);


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
        //限制范围
        //byte为-128-127
        String type = ctx.typeName().elementaryTypeName().getText();
        switch (type){
            case "byte" :
                count = 256;
                int a = memory.get(id);
                if(a>127||a<-128)
                {
                    System.out.println("存在整型溢出漏洞");
                }

            case "uint8":
                count = 256;
                int b = memory.get(id);
                if(b<0||b>255)
                {
                    System.out.println("存在整数溢出漏洞");
                }
            default:

        }


        return visitChildren(ctx);
    }


    @Override
    public Integer visitComplexaddsub(frameParser.ComplexaddsubContext ctx) {
        Integer left =0;
        Integer right=0;
        System.out.println(ctx.getText());
        //System.out.println(ctx.expression(1).getText());

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

    @Override
    public Integer visitMulity(frameParser.MulityContext ctx) {
        Integer left =0;
        Integer right=0;
        System.out.println(ctx.getText());
        //System.out.println(ctx.expression(1).getText());

        //x=2*3

        if(ctx.expression(0)!=null&&ctx.expression(1)!=null)
        {
            if(ctx.expression(0).primary().numberLiteral()!=null&&ctx.expression(1).primary().numberLiteral()!=null)
            {
                String lefts = ctx.expression(0).primary().numberLiteral().DecimalNumber().getText();
                left =Integer.valueOf(lefts);
                String rights = ctx.expression(1).primary().numberLiteral().DecimalNumber().getText();
                right =Integer.valueOf(rights);
            }
            //x=x*1
            else if (ctx.expression(0).primary().identifier()!=null&&ctx.expression(1).primary().numberLiteral()!=null)
            {
                left =memory.get(ctx.expression(0).primary().identifier().getText());
                String rights = ctx.expression(1).primary().numberLiteral().DecimalNumber().getText();
                right =Integer.valueOf(rights);
            }
            //x=1*x
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

}
