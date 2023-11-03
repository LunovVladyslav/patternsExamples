package org.patterns.structural.bridge;

public abstract class Photographer {
    protected Camera camera;

    public Photographer(Camera camera) {
        this.camera = camera;
    }

    abstract void makeSession();
}
