package org.patterns.structural.flyweight;

import java.util.HashMap;

public class FlywieghtFactory {
    static HashMap<String, SymbolFlyweight > map = new HashMap<>();

    public SymbolFlyweight getSymbol(String symbol, String symbolStyle) {
        if (map.get(symbol) == null) {
            map.put(symbol, new FlyweightImpl(symbol, symbolStyle));
        }

        return map.get(symbol);
    }
}
