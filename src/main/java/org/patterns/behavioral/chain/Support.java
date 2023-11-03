package org.patterns.behavioral.chain;

public abstract class Support {
    private Support next;
    private Options option;

    public void setOption(Options option) {
        this.option = option;
    }

    public void setNext(Support next) {
        this.next = next;
    }

    public void checkProblem(int operationNumber) {
        if (next != null && operationNumber > option.getValue()) {
            next.checkProblem(operationNumber);
        } else {
            solveProblem();
        }
    }

    public abstract void solveProblem();
}
