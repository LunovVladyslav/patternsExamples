package org.patterns.structural.composite;

public class Image implements Element{
    @Override
    public void render() {
        System.out.println("Image was rendered");
    }
}
