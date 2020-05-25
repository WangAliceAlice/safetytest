public class TxoriginVisitor extends frameBaseVisitor {

    @Override
    public Integer visitFunctionDefinition(frameParser.FunctionDefinitionContext ctx) {
        String string = ctx.block().getText();
        if(string.contains("tx.origin"))
        {
            System.out.println();
            System.out.println("存在tx.origin漏洞");
        }
        return 0;
    }
}
