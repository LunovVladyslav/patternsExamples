package org.patterns.behavioral.interpret;

import java.util.Stack;

public class Context {
    private Stack<Expression> stack = new Stack<>();

    public void push(Expression expression) {
        stack.push(expression);
    }

    public Expression pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }
}
