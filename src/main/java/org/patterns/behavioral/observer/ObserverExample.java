package org.patterns.behavioral.observer;

public class ObserverExample {
    public static void main(String[] args) throws InterruptedException {
        RealtyAgency agency = new RealtyAgency();
        agency.addNewRoom("Room 1");
        agency.addNewRoom("Room 2");

        Subscriber s1 = new Subscriber("John");
        Subscriber s2 = new Subscriber("Alice");
        agency.addSubscriber(s1);
        agency.addSubscriber(s2);

        agency.addNewRoom("Room 3");
        Thread.sleep(1000);
        agency.addNewRoom("Room 4");
        Thread.sleep(1000);
        agency.removeRoomFromList("Room 1");
    }
}
