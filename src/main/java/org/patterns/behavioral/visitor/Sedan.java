package org.patterns.behavioral.visitor;

public class Sedan extends Car {

    public Sedan(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void accept(Master master) {
        master.fixCar(this);
    }
}
