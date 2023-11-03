package org.patterns.behavioral.state;

public class Writer {
    State activeState;

    public Writer(State activeState) {
        this.activeState = activeState;
    }

    public void setActivePhase(State activeState) {
        this.activeState = activeState;
    }

//    public void nextPhase() {
//        if (activeState instanceof CreateIdea) {
//            setActivePhase(new WriteText());
//        } else if (activeState instanceof WriteText) {
//            setActivePhase(new TextEditing());
//        } else if (activeState instanceof TextEditing) {
//            setActivePhase(new Publish());
//        } else if (activeState instanceof Publish) {
//            setActivePhase(new CreateIdea());
//        }
//    }

    void processing() {
        activeState.processing(this);
    }
}
