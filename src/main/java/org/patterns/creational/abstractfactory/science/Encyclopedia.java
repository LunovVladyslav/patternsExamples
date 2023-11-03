package org.patterns.creational.abstractfactory.science;

import org.patterns.creational.abstractfactory.Book;

public class Encyclopedia implements Book {
    @Override
    public void printBook() {
        System.out.println("New encyclopedia printed");
    }
}
