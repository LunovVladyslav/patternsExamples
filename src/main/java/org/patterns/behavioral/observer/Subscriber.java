package org.patterns.behavioral.observer;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void showNotification(String text) {
        System.out.printf("""
                %s, new available rooms list:
                %s
                %n
                """, this.name, text);
    }
}
