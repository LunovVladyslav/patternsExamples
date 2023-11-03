package org.patterns.behavioral.visitor;

public class DetailingMaster implements Master{
    @Override
    public void fixCar(Hatchback hatchback) {
        System.out.println("Hatchback - %s %s, card body fixed.".formatted(
                hatchback.getColor(), hatchback.getBrand()
        ));
    }

    @Override
    public void fixCar(Sedan sedan) {
        System.out.println("Sedan - %s %s, card body fixed.".formatted(
                sedan.getColor(), sedan.getBrand()
        ));
    }
}
