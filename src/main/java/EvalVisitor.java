import java.util.concurrent.ConcurrentHashMap;

public class EvalVisitor extends frameBaseVisitor <Integer> {

    ConcurrentHashMap<String, Integer> memory = new ConcurrentHashMap<String, Integer>();
    /*@Override

    public Integer visitPrint(frameParser.PrintContext ctx) {
        Integer value = visit(ctx.expr());
        System.out.println(value);
        return 0;
    }

    @Override
    public Integer visitAssign(frameParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        Integer value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    @Override
    public Integer visitMulDiv(frameParser.MulDivContext ctx) {
        Integer left = visit(ctx.expr(0));
        Integer right = visit(ctx.expr(1));
        if (ctx.MULTIPLY() != null) {
            return left * right;
        } else {
            return left / right;
        }
    }

    @Override
    public Integer visitAddSub(frameParser.AddSubContext ctx) {
        Integer left = visit(ctx.expr(0));
        Integer right = visit(ctx.expr(1));
        if (ctx.PLUS() != null) {
            return left + right;
        } else {
            return left - right;
        }
    }

    @Override
    public Integer visitIdInt(antlrtestParser.IdIntContext ctx) {
        String text = ctx.getText();
        if (text.matches("[a-z]+")) {
            String id = text;
            return memory.containsKey(id) ? memory.get(id) : 0;
        }
        return Integer.valueOf(text);
    }

    @Override
    public Integer visitPrivate(antlrtestParser.PrivateContext ctx) {
        return visit(ctx.expr());
    }

    */


}
