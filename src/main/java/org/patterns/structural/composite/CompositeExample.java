package org.patterns.structural.composite;

import java.util.List;

public class CompositeExample {
    public static void main(String[] args) {
        GuiSystem system = new GuiSystem();

        system.addAllElements(List.of(
                new Image(), new Form(), new Button()
        ));

        system.renderSystem();
    }
}
