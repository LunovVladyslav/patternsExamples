package org.patterns.creational.abstractfactory.science;

import org.patterns.creational.abstractfactory.Designer;

public class ProDesigner implements Designer {
    @Override
    public void createDesign() {
        System.out.println("Create professional design for the book");
    }
}
