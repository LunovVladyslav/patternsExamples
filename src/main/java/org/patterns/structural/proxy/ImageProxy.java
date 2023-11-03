package org.patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ImageProxy implements Image{
    private RealImage realImage;
    private String filename;
    private static Map<String, RealImage> imageCache = new HashMap<>();

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            if (imageCache.containsKey(filename)) {
                realImage = imageCache.get(filename);
            } else {
                realImage = new RealImage(filename);
                imageCache.put(filename, realImage);
            }
        }
        realImage.display();
    }
}
