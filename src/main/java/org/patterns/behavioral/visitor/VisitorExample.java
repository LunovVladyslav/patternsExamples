package org.patterns.behavioral.visitor;

public class VisitorExample {
    public static void main(String[] args) {
        Car sedan = new Sedan("Honda", "silver");
        Car hatchback = new Hatchback("Ford", "red");

        Master engineMaster = new EngineMaster();
        Master electricityMaster = new ElectricityMaster();
        Master detailingMaster = new DetailingMaster();

        sedan.accept(electricityMaster);
        sedan.accept(engineMaster);
        sedan.accept(detailingMaster);

        hatchback.accept(electricityMaster);
        hatchback.accept(engineMaster);
        hatchback.accept(detailingMaster);
    }
}
