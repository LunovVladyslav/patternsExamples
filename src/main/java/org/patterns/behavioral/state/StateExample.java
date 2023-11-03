package org.patterns.behavioral.state;



public class StateExample {
    public static void main(String[] args) {
        Writer author = new Writer(new CreateIdea());

        for (int i = 0; i < 8; i++) {
            author.processing();
        }
    }
}
