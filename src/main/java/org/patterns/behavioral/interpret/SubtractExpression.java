package org.patterns.behavioral.interpret;

public class SubtractExpression implements Expression{
    Expression expression1;
    Expression expression2;

    public SubtractExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public int interpret() {
        return expression1.interpret() - expression2.interpret();
    }
}
