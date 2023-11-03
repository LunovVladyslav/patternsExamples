package org.patterns.creational.abstractfactory.comics;

import org.patterns.creational.abstractfactory.Designer;

public class ArtDesigner implements Designer {
    @Override
    public void createDesign() {
        System.out.println("Create design for comics");
    }
}
