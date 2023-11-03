package org.patterns.creational.builder;

public class BuilderExample {
    public static void main(String[] args) {
        DealerCenter dc = new DealerCenter();
        dc.setBuilder(new MacLaptopBuilder());

        Laptop laptop = dc.sellLaptop();
        System.out.println(laptop);
    }
}
