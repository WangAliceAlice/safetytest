public class DosVisitor extends frameBaseVisitor {
//拒绝服务漏洞
@Override
public Integer visitFunctionDefinition(frameParser.FunctionDefinitionContext ctx) {

    if(ctx.identifier()==null)
    {
        String s = ctx.block().statement().get(0).getText();
        System.out.println(s);
        if(s.contains("revert()"))
        {
            System.out.println("存在反复调用风险");
        }

    }
    return 0;
}

@Override
public Integer visitIfStatement(frameParser.IfStatementContext ctx) {
    //System.out.println(Integer.valueOf(ctx.expression().getText()));
    return 0;
}

@Override
public Integer visitRequireStatement(frameParser.RequireStatementContext ctx) {
   // System.out.println(Integer.valueOf(ctx.expression().getText()));
    return 0;
}

}
