package org.patterns.creational.abstractfactory;

public class PublishingHouse {
    private PublishingFactory factory;

    public PublishingHouse(PublishingFactory factory) {
        this.factory = factory;
    }

    void publishNewBook() {
        factory.createAuthor().writeText();
        factory.createDesigner().createDesign();
        factory.createBook().printBook();
    }
}
