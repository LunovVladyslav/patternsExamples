package org.patterns.creational.factorymethod.objects;

public class Smartphone extends Product{
    public Smartphone(String brandName, int price) {
        this.brandName = brandName;
        this.price = price;
    }


    @Override
    public void showDescription() {
        System.out.printf("%s is smartphone %d$ costs.%n", this.brandName, this.price);
    }
}
