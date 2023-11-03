package org.patterns.creational.abstractfactory;

import org.patterns.creational.abstractfactory.comics.ArtDesigner;
import org.patterns.creational.abstractfactory.comics.Comics;
import org.patterns.creational.abstractfactory.comics.ComicsAuthor;

public class ComicsPublishing implements PublishingFactory{
    @Override
    public Author createAuthor() {
        return new ComicsAuthor();
    }

    @Override
    public Designer createDesigner() {
        return new ArtDesigner();
    }

    @Override
    public Book createBook() {
        return new Comics();
    }
}
