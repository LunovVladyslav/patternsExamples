package org.patterns.creational.builder;

public abstract class LaptopBuilder {
    Laptop laptop;

    void createLaptop() {
        laptop = new Laptop();
    }

    abstract void buildBrand();
    abstract void buildProcessor();
    abstract void buildAmountRam();
    abstract void buildSSDCapacity();

    Laptop getLaptop() {
        return laptop;
    }
}
