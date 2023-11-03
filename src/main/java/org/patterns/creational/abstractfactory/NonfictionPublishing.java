package org.patterns.creational.abstractfactory;

import org.patterns.creational.abstractfactory.science.Encyclopedia;
import org.patterns.creational.abstractfactory.science.ProDesigner;
import org.patterns.creational.abstractfactory.science.ScientistAuthor;

public class NonfictionPublishing implements PublishingFactory{
    @Override
    public Author createAuthor() {
        return new ScientistAuthor();
    }

    @Override
    public Designer createDesigner() {
        return new ProDesigner();
    }

    @Override
    public Book createBook() {
        return new Encyclopedia();
    }
}
