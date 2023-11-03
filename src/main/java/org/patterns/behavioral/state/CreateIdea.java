package org.patterns.behavioral.state;

public class CreateIdea implements State {
    @Override
    public void processing(Writer writer) {
        System.out.println("Author created idea..");
        writer.setActivePhase(new WriteText());
    }
}
