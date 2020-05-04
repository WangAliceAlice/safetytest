public class TxoriginVisitor extends frameBaseVisitor {

    @Override
    public Integer visitFunctionCallArguments(frameParser.FunctionCallArgumentsContext ctx) {
        String string = ctx.expressionList().getText();
        if(string.contains("tx.origin"))
        {
            System.out.println();
            System.out.println("存在tx.origin漏洞");
        }
        return 0;
    }
}
