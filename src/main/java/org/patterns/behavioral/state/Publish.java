package org.patterns.behavioral.state;

public class Publish implements State {

    @Override
    public void processing(Writer writer) {
        System.out.println("New book was published");
        writer.setActivePhase(new CreateIdea());
    }
}
