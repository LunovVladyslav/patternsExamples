package org.patterns.behavioral.chain;

public class SecondOperator extends Support {
    public SecondOperator() {
        setOption(Options.TWO);
    }

    @Override
    public void solveProblem() {
        System.out.println("Please restart the system");
    }
}
