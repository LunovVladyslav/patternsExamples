package org.patterns.behavioral.visitor;

public class Hatchback extends Car {
    public Hatchback(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void accept(Master master) {
        master.fixCar(this);
    }
}
