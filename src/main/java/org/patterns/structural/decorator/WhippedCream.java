package org.patterns.structural.decorator;

public class WhippedCream extends CoffeDecorator{
    int price = 5;
    public WhippedCream(Coffee coffee) {
        super(coffee);
        this.setDescription(this.coffee.getDescription() + " with whipped cream");
    }

    @Override
    public int buyCoffee() {
        return this.coffee.buyCoffee() + this.price;
    }
}
