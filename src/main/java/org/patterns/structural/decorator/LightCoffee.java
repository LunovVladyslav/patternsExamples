package org.patterns.structural.decorator;

public class LightCoffee extends Coffee {
    public LightCoffee() {
        this.setDescription("Light coffee");
        this.setPrice(11);
    }

    @Override
    public int buyCoffee() {
        return this.price;
    }
}
