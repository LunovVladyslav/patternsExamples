package org.patterns.behavioral.state;

public class TextEditing implements State {
    @Override
    public void processing(Writer writer) {
        System.out.println("Author makes editing of the text");
        writer.setActivePhase(new Publish());
    }
}
