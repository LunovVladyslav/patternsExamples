package org.patterns.behavioral.interpret;

public class InterpreterExample {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = new SubtractExpression(
                new AddExression(new NumberExpression(15), new NumberExpression(5)),
                new NumberExpression(10)
        );

        context.push(expression);
        int result = context.pop().interpret();
        System.out.println("Result: " + result);
    }
}
