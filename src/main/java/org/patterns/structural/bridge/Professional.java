package org.patterns.structural.bridge;

public class Professional extends Photographer{
    public Professional(Camera camera) {
        super(camera);
    }

    @Override
    void makeSession() {
        System.out.println("Professional photographer session have been started");
        camera.takeShot();
        camera.takeShot();
        camera.takeShot();
    }
}
