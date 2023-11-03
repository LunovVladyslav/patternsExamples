package org.patterns.structural.decorator;

public class Espresso extends Coffee {
    public Espresso() {
        this.setDescription("Espresso");
        this.setPrice(10);
    }

    @Override
    public int buyCoffee() {
        return this.price;
    }
}
