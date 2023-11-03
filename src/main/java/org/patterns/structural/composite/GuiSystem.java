package org.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GuiSystem {
    private List<Element> elements = new ArrayList<>();

    void addElement(Element element) {
        elements.add(element);
    }

    void addAllElements(List<Element> elementList) {
        elements.addAll(elementList);
    }

    void removeElement(Element element) {
        elements.remove(element);
    }

    void renderSystem() {
        System.out.println("GUI system is rendering...");
        for (Element element : elements) {
            element.render();
        }
    }
}
