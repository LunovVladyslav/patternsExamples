package org.patterns.behavioral.strategy;

public class Chrome implements Browser{
    @Override
    public void use() {
        System.out.println("Chrome browser is using.");
    }
}
