package org.patterns.structural.decorator;

public abstract class CoffeDecorator extends Coffee {
    Coffee coffee;

    public CoffeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
