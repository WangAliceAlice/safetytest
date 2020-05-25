import java.util.concurrent.ConcurrentHashMap;

//对漏洞检测
public class SafetyVisitor extends frameBaseVisitor {
    Integer count;
    ConcurrentHashMap<String, Integer> memory = new ConcurrentHashMap<String, Integer>();

    @Override
    //Solidity版本检查
    public Integer visitVersion(frameParser.VersionContext ctx) {
        String s =ctx.versionConstraint(0).versionOperator().getText();
        int line2 = ctx.getStart().getLine();
        //System.out.println(s);
        if(!s.equals("="))
        {
            System.out.println(line2+":Solidity版本未固定");

        }
        return 0;
    }

    @Override
    //检查是否使用safemath库
    public Object visitSourceUnit(frameParser.SourceUnitContext ctx) {
        System.out.println();
        System.out.println("未使用SafeMath库");
        return visitChildren(ctx);
    }
    public Object visitImportDirective(frameParser.ImportDirectiveContext ctx) {
            String ss =ctx.getText();
            if(!ss.contains("SafeMath"))
            {
                System.out.println("未使用SafeMath库");
            }

            return visitChildren(ctx);
    }

    @Override
    //短地址攻击漏洞
    public Object visitContractDefinition(frameParser.ContractDefinitionContext ctx) {
        System.out.println("输入地址");
        Init init = new Init();
        init.scanin();
        return visitChildren(ctx);
    }

    @Override
    //对敏感操作的检查
    public Object visitCompare(frameParser.CompareContext ctx) {
        String string1 =ctx.expression(0).getText();
        String string2 =ctx.expression(1).getText();
        int line6 =ctx.getStart().getLine();
        //System.out.println(string1);
        //System.out.println(string2);
        if(memory.get(string1)==null||memory.get(string2)==null)
        {
            System.out.println(line6+":区块链存在参数依赖，如为合约逻辑设计，需要谨慎使用");
        }
        return visitChildren(ctx);
    }


    @Override
    public Object visitFunctionDefinition(frameParser.FunctionDefinitionContext ctx)  {
        //检查是否规定返回值类型

        int line1 = ctx.getStart().getLine();
        if(ctx.returnParameters()==null)
        {
            System.out.println(line1+":函数没有规定返回值类型");

        }

        //特权功能漏洞
        String s1 =ctx.modifierList().getText();
        int line0 =ctx.modifierList().start.getLine();
        if(s1.equals(""))
        {
            System.out.println(line0+":函数缺少权限修饰符");

        }
        //Tx.origin漏洞检测
        String string = ctx.block().getText();
        if(string.contains("tx.origin"))
        {
            System.out.println("存在tx.origin漏洞");
        }
        //跨合约调用漏洞
        String s2 =ctx.identifier().getText();
        int line = ctx.identifier().getStart().getLine();
        if(s2.contains("call")||s2.contains("Delegat"))
        {
            System.out.println();
            System.out.println(line+":跨合约调用漏洞");

        }
        //构造函数导致的拒绝服务漏洞
        if(ctx.identifier()==null)
        {
            String s3 = ctx.block().statement().get(0).getText();
            //System.out.println(s3);
            if(s3.contains("revert()"))
            {
                System.out.println("拒绝服务漏洞");
            }

        }
        return visitChildren(ctx);
    }

    @Override
    //拒绝服务漏洞
    public Object visitRequireStatement(frameParser.RequireStatementContext ctx) {
        String s =ctx.expression().getText();
        int line5 = ctx.getStart().getLine();
        if(s.contains("send")||s.contains("call.value"))
        {
            System.out.println(line5+":拒绝服务漏洞");
        }
        return visitChildren(ctx);
    }

    @Override
    //if内容判断
    public Object visitIfStatement(frameParser.IfStatementContext ctx) {
        String string = ctx.expression().getText();
        int line4 = ctx.getStart().getLine();
        //重入漏洞
        if(string.contains("call.value")||string.contains("transfer")||string.contains("send"))
        {
            if(ctx.statement(0).getText().contains("balance"))
            {
                //System.out.println(ctx.statement(0).getText());
                System.out.println(line4+":存在重入漏洞");
            }
        }
        //溢出漏洞
        if(string.contains(">0")||string.contains("!=0"))
        {

            if(ctx.statement(0).getText().contains("+"))
            {
                System.out.println("可能存在溢出漏洞");
            }
        }
        return visitChildren(ctx);
    }



    //整型溢出漏洞
    @Override
    public Object visitStateVariableDeclaration(frameParser.StateVariableDeclarationContext ctx) {
        String id = ctx.identifier().getText();
        Integer value=0;
        //System.out.println("fdger");
        if(ctx.expression()!=null)
        {
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

            else
            {
                value =(Integer) visit(ctx.expression());
                memory.put(id, value);

            }
        }
        else{ }

        //限制范围
        //byte为-128-127
        if(ctx.typeName().elementaryTypeName()!=null)
        {
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

    @Override
    //对+=和-=可能出现得整型溢出加以判断
    public Integer visitOther(frameParser.OtherContext ctx) {
        Integer left =0;
        Integer right=0;
        //System.out.println(ctx.getText());
        int line9 =ctx.getStart().getLine();
        //System.out.println(ctx.expression(1).getText());
        left = (Integer) visit(ctx.expression(0));
        right = (Integer) visit(ctx.expression(1));
        Integer result;
        //System.out.println(left);
        //System.out.println(right);
        if(ctx.PLUSEQUAL()!=null||ctx.MINUSEQUAL()!=null)
        {
            System.out.println(ctx.getText());
            if(left!=null&&right!=null)
            {

                if (ctx.PLUSEQUAL() != null) {

                    result = (left + right)%count;
                    if (result >= left && result >= right) {
                        System.out.println(result);
                        memory.put(ctx.expression(0).getText(),result);
                        return result;
                    } else {
                        System.out.println("加法溢出");
                        return 0;
                    }

                } else if(ctx.MINUSEQUAL()!=null){

                    result = (left - right)%count;
                    if (right<=left) {
                        System.out.println(result);
                        memory.put(ctx.expression(0).getText(),result);
                        return result;

                    } else {
                        System.out.println("减法溢出");

                    }
                }

            }
            else{
                System.out.println(line9+":区块链存在参数依赖，如为合约逻辑设计，需要谨慎使用");
            }

        }

        return 0;
    }

    //乘除法检查
    @Override
    public Integer visitMulity(frameParser.MulityContext ctx) {
        Integer left =0;
        Integer right=0;
        System.out.println(ctx.getText());
        int line7 =ctx.getStart().getLine();
        //System.out.println(ctx.expression(1).getText());
        left = (Integer) visit(ctx.expression(0));
        right = (Integer) visit(ctx.expression(1));
        Integer result;
        System.out.println(left);
        System.out.println(right);
        if(left!=null&&right!=null)
        {

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
        }
        else{
            System.out.println(line7+":区块链存在参数依赖，如为合约逻辑设计，需要谨慎使用");
        }

        return  0;

    }

    //加减法检查
    @Override
    public Integer visitComplexaddsub(frameParser.ComplexaddsubContext ctx) {
        Integer left =0;
        Integer right=0;
        System.out.println(ctx.getText());
        int line8 = ctx.getStart().getLine();
        //System.out.println(ctx.expression(1).getText());
        left = (Integer) visit(ctx.expression(0));
        right = (Integer) visit(ctx.expression(1));
        Integer result;
        if(left!=null&&right!=null)
        {
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

                }

            }
        }
        else{
            System.out.println(line8+":区块链存在参数依赖，如为合约逻辑设计，需要谨慎使用");
        }
        return 0;

    }

}
