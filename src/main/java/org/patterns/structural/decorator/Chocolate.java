package org.patterns.structural.decorator;

public class Chocolate extends CoffeDecorator{
    int price = 3;
    public Chocolate(Coffee coffee) {
        super(coffee);
        this.setDescription(this.coffee.getDescription() + " with chocolate");
    }

    @Override
    public int buyCoffee() {
        return this.coffee.buyCoffee() + this.price;
    }
}
