package org.patterns.structural.composite;

public class Button implements Element{
    @Override
    public void render() {
        System.out.println("Button was rendered");
    }
}
