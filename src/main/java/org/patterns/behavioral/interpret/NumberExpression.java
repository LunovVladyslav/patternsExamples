package org.patterns.behavioral.interpret;

public class NumberExpression implements Expression{
    int data;

    public NumberExpression(int data) {
        this.data = data;
    }

    @Override
    public int interpret() {
        return data;
    }
}
