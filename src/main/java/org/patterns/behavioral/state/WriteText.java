package org.patterns.behavioral.state;

public class WriteText implements State {

    @Override
    public void processing(Writer writer) {
        System.out.println("Author writes text");
        writer.setActivePhase(new TextEditing());
    }
}
