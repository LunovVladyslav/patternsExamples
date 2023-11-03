package org.patterns.behavioral.chain;

public class ThirdOperator extends Support {
    public ThirdOperator() {
        setOption(Options.THREE);
    }

    @Override
    public void solveProblem() {
        System.out.println("Send your contacts and address to our email please");
    }

}
