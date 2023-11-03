package org.patterns.structural.flyweight;

public class FlyweightExample {
    public static void main(String[] args) {
        FlywieghtFactory factory = new FlywieghtFactory();

        factory.getSymbol("J", "Arial")
                .drawSymbol(new PositionExternalContext(0, 1));
        factory.getSymbol("a", "Arial")
                .drawSymbol(new PositionExternalContext(0, 2));
        factory.getSymbol("v", "Arial")
                .drawSymbol(new PositionExternalContext(0, 3));
        factory.getSymbol("a", "Arial")
                .drawSymbol(new PositionExternalContext(0, 4));

    }
}
