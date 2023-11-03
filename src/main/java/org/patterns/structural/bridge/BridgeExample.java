package org.patterns.structural.bridge;

public class BridgeExample {
    public static void main(String[] args) {
        Photographer photographer = new Beginner(new Nikon());
        photographer.makeSession();

        System.out.println("==============");

        photographer = new Professional(new Canon());
        photographer.makeSession();
    }
}
