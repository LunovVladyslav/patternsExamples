package org.patterns.creational.builder;

public class Laptop {
    private String brand;
    private Processor processor;
    private int amountRam;
    private int ssdCapacity;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setAmountRam(int amountRam) {
        this.amountRam = amountRam;
    }

    public void setSsdCapacity(int ssdCapacity) {
        this.ssdCapacity = ssdCapacity;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", processor=" + processor +
                ", amountRam=" + amountRam +
                ", ssdCapacity=" + ssdCapacity +
                '}';
    }
}
