package org.patterns.structural.bridge;

public class Beginner extends Photographer{
    public Beginner(Camera camera) {
        super(camera);
    }

    @Override
    void makeSession() {
        System.out.println("Beginner photographer session have been started");
        camera.takeShot();
        camera.takeShot();
    }
}
