package org.patterns.behavioral.observer;

public interface Observed {
    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void notifySubscribers();
}
