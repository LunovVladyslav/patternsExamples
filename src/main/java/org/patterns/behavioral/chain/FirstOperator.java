package org.patterns.behavioral.chain;

public class FirstOperator extends Support{
    public FirstOperator() {
        setOption(Options.ONE);
    }

    @Override
    public void solveProblem() {
        System.out.println("Check your internet connection");
    }
}
