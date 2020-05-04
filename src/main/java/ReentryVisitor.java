public class ReentryVisitor extends frameBaseVisitor {

    @Override
    public Integer visitIfStatement(frameParser.IfStatementContext ctx) {
       String string = ctx.expression().getText();
       if(string.contains("value"))
       {
           if(ctx.statement(0).getText().contains("balance"))
           {
               //System.out.println(ctx.statement(0).getText());
               System.out.println("存在重入漏洞");
           }
       }
        return 0;
    }

    /*@Override
    public Integer visitAttribute(frameParser.AttributeContext ctx) {
        //TerminalNode x =ctx.getToken(111,0);
        String s =ctx.identifier().Identifier().getText();
        if (s.equals("value"))
        {
            System.out.println("可能存在重入漏洞");
        }
        return 0;
    }
    */
}
