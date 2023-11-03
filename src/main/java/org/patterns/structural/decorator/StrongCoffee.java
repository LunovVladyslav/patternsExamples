package org.patterns.structural.decorator;

public class StrongCoffee extends Coffee{

    public StrongCoffee() {
        this.setDescription("Strong coffee");
        this.setPrice(14);
    }

    @Override
    public int buyCoffee() {
        return this.price;
    }
}
