package org.patterns.creational.factorymethod.objects;

public class Laptop extends Product {
    public Laptop(String brandName, int price) {
        this.brandName = brandName;
        this.price = price;
    }


    @Override
    public void showDescription() {
        System.out.printf("%s is laptop %d$ costs.%n", this.brandName, this.price);
    }
}
