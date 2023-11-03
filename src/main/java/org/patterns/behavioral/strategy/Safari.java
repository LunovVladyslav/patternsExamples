package org.patterns.behavioral.strategy;

public class Safari implements Browser{
    @Override
    public void use() {
        System.out.println("Safari browser is using.");
    }
}
