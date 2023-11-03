package org.patterns.behavioral.chain;

public enum Options {
    ONE(1), TWO(2), THREE(3);

    private int value;

    Options(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
