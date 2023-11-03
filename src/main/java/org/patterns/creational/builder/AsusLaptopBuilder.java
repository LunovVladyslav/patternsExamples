package org.patterns.creational.builder;

public class AsusLaptopBuilder extends LaptopBuilder{
    @Override
    void buildBrand() {
        laptop.setBrand("ASUS");
    }

    @Override
    void buildProcessor() {
        laptop.setProcessor(Processor.INTEL);
    }

    @Override
    void buildAmountRam() {
        laptop.setAmountRam(16);
    }

    @Override
    void buildSSDCapacity() {
        laptop.setSsdCapacity(512);
    }
}
