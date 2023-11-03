package org.patterns.behavioral.strategy;

public class Opera implements Browser{
    @Override
    public void use() {
        System.out.println("Opera browser is using.");
    }
}
