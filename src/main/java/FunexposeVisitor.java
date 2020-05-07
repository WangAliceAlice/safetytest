public class FunexposeVisitor extends frameBaseVisitor {

    @Override
    public Integer visitFunctionDefinition(frameParser.FunctionDefinitionContext ctx) {
        String s =ctx.modifierList().getText();
        if(s.equals(""))
        {
            System.out.println();
            System.out.println("函数缺少权限修饰符");
        }
        return 0;
    }

}
