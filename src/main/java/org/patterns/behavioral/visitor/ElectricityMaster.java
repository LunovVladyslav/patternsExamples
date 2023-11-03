package org.patterns.behavioral.visitor;

public class ElectricityMaster implements Master {
    @Override
    public void fixCar(Hatchback hatchback) {
        System.out.println("Hatchback - %s %s, electricity fixed.".formatted(
                hatchback.getColor(), hatchback.getBrand()
        ));
    }

    @Override
    public void fixCar(Sedan sedan) {
        System.out.println("Sedan - %s %s, electricity fixed.".formatted(
                sedan.getColor(), sedan.getBrand()
        ));
    }
}
