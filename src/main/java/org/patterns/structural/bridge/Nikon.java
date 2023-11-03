package org.patterns.structural.bridge;

public class Nikon implements Camera{
    @Override
    public void takeShot() {
        System.out.println("Nikon takes a shot");
    }
}
