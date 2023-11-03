package org.patterns.creational.abstractfactory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        PublishingHouse ph = new PublishingHouse(new ComicsPublishing());
        ph.publishNewBook();

        System.out.println("===========");
        ph = new PublishingHouse(new NonfictionPublishing());
        ph.publishNewBook();
    }
}
