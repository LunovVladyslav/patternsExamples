package org.patterns.creational.abstractfactory.comics;

import org.patterns.creational.abstractfactory.Author;

public class ComicsAuthor implements Author {
    @Override
    public void writeText() {
        System.out.println("Write story for comics");
    }
}
