package org.patterns.creational.factorymethod;


public class FactoryMethodExample {
    public static void main(String[] args) {
        ProductFactory productFactory = new LaptopFactory();
        productFactory.createProduct("Asus", 1500).showDescription();
        System.out.println("==================");

        productFactory = new SmartphoneFactory();
        productFactory.createProduct("Samsung", 1500).showDescription();
    }
}
