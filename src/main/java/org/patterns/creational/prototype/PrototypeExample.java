package org.patterns.creational.prototype;

public class PrototypeExample {
    public static void main(String[] args) {
        ProductCard card1 = new ProductCard("Product title", 1500);
        ProductCardFactory factory = new ProductCardFactory(card1);
        ProductCard card2 = factory.copyProductCard();

        System.out.println(card1.equals(card2));
    }
}
