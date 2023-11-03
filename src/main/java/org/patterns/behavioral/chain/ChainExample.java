package org.patterns.behavioral.chain;

public class ChainExample {
    public static void main(String[] args) {
        Support firstOperator = new FirstOperator();
        Support secondOperator = new SecondOperator();
        Support thirdOperator = new ThirdOperator();

        firstOperator.setNext(secondOperator);
        secondOperator.setNext(thirdOperator);

        firstOperator.checkProblem(3);
    }
}
