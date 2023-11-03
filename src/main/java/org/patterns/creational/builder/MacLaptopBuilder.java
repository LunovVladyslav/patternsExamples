package org.patterns.creational.builder;

public class MacLaptopBuilder extends LaptopBuilder {

    @Override
    void buildBrand() {
        laptop.setBrand("Macintosh");
    }

    @Override
    void buildProcessor() {
        laptop.setProcessor(Processor.M2);
    }

    @Override
    void buildAmountRam() {
        laptop.setAmountRam(16);
    }

    @Override
    void buildSSDCapacity() {
        laptop.setSsdCapacity(256);
    }
}
