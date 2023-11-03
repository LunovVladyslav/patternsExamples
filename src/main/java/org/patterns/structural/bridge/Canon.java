package org.patterns.structural.bridge;

public class Canon implements Camera{
    @Override
    public void takeShot() {
        System.out.println("Canon takes a shot");
    }
}
