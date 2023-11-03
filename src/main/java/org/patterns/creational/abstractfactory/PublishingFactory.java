package org.patterns.creational.abstractfactory;

public interface PublishingFactory {
    Author createAuthor();
    Designer createDesigner();
    Book createBook();
}
