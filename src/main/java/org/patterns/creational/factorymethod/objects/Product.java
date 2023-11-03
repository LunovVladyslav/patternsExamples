package org.patterns.creational.factorymethod.objects;

public abstract class Product {
    protected int price;
    protected String brandName;

    public abstract void showDescription();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
