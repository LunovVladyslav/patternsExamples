package org.patterns.behavioral.visitor;

public interface Master {
    void fixCar(Hatchback hatchback);
    void fixCar(Sedan sedan);
}
