package org.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class RealtyAgency implements Observed{
    private List<Observer> subscribers = new ArrayList<>();
    private List<String> avalibleRooms = new ArrayList<>();

    public void addNewRoom(String room) {
        avalibleRooms.add(room);
        notifySubscribers();
    }

    public void removeRoomFromList(String room) {
        avalibleRooms.remove(room);
        notifySubscribers();
    }
    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (Observer o : subscribers) {
            o.showNotification(avalibleRooms.toString());
        }
    }
}
