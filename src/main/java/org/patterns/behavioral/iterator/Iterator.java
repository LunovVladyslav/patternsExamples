package org.patterns.behavioral.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T getNext();
}
