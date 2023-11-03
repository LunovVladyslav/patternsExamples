package org.patterns.structural.decorator;

public class Milk extends CoffeDecorator{

    int price = 1;
    public Milk(Coffee coffee) {
        super(coffee);
        this.setDescription(this.coffee.getDescription() + " with milk");
    }

    @Override
    public int buyCoffee() {
        return this.coffee.buyCoffee() + price;
    }
}
