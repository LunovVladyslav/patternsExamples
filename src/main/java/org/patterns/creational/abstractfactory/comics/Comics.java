package org.patterns.creational.abstractfactory.comics;

import org.patterns.creational.abstractfactory.Book;

public class Comics implements Book {
    @Override
    public void printBook() {
        System.out.println("New comics book printed");
    }
}
