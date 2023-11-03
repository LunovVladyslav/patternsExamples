package org.patterns.structural.decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        Coffee coffee1 = new LightCoffee();
        System.out.println(coffee1.getDescription() + ": " + coffee1.buyCoffee());
        Coffee coffee2 = new Milk(coffee1);
        System.out.println(coffee2.getDescription() + ": " + coffee2.buyCoffee());
        Coffee coffee3 = new WhippedCream(coffee2);
        System.out.println(coffee3.getDescription() + ": " + coffee3.buyCoffee());
    }
}
