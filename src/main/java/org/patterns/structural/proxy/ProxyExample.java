package org.patterns.structural.proxy;

public class ProxyExample {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("avatar.jpg");
        Image image2 = new ImageProxy("car.jpg");

        image1.display();
        image2.display();
        System.out.println("===========");
        image1.display();
        image2.display();
    }
}
