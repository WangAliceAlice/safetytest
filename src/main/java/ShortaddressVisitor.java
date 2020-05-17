import java.io.IOException;

public class ShortaddressVisitor extends frameBaseVisitor {

    @Override
    public Integer visitFunctionDefinition(frameParser.FunctionDefinitionContext ctx)  {
        String s =ctx.parameterList().getText();
        if(s.contains("address")) {
            System.out.println("输入地址");
            Init init = new Init();
            init.scanin();
        }
        return 0;
    }
}
