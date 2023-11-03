package org.patterns.structural.flyweight;

public class FlyweightImpl implements SymbolFlyweight{

    private String symbol;
    private String symbolStyle;

    public FlyweightImpl(String symbol, String symbolStyle) {
        this.symbol = symbol;
        this.symbolStyle = symbolStyle;
    }

    @Override
    public void drawSymbol(PositionExternalContext position) {
        System.out.println("%s, x:%d y:%d; style: %s".formatted(
                this.symbol, position.getX(), position.getY(), this.symbolStyle
        ));
    }
}
