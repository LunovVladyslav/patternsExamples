package org.patterns.creational.builder;

public class DealerCenter {
    LaptopBuilder builder;

    public void setBuilder(LaptopBuilder builder) {
        this.builder = builder;
    }

    Laptop sellLaptop() {
        builder.createLaptop();
        builder.buildBrand();
        builder.buildProcessor();
        builder.buildAmountRam();
        builder.buildSSDCapacity();
        Laptop laptop = builder.getLaptop();
        return laptop;
    }
}
