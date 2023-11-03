package org.patterns.creational.abstractfactory.science;

import org.patterns.creational.abstractfactory.Author;

public class ScientistAuthor implements Author {
    @Override
    public void writeText() {
        System.out.println("Write text for nonfiction literature");
    }
}
