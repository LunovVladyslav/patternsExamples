package org.patterns.behavioral.template;

public abstract class Track {
    public void play() {
        System.out.println("Track is started");
        specifiedMelody();
        System.out.println("Track is end");
    }

    public abstract void specifiedMelody();
}
