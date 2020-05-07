public class CrossconVisitor extends frameBaseVisitor {

    @Override
    public Integer visitFunctionDefinition(frameParser.FunctionDefinitionContext ctx) {
        String s =ctx.identifier().getText();
        //System.out.println(s);
        if(s.contains("call")||s.contains("Delegat"))
        {
            System.out.println();
            System.out.println("跨合约调用漏洞");
        }
        else{

        }
        return 0;
    }

}
