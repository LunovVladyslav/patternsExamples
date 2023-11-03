package org.patterns.behavioral.template;

public class TemplateExample {
    public static void main(String[] args) {
        Track track1 = new InstrumentalTrack();
        Track track2 = new ElectronicTrack();

        track1.play();
        System.out.println("---------");
        track2.play();
    }
}
