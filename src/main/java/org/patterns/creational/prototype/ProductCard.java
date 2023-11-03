package org.patterns.creational.prototype;

import java.util.Objects;

public class ProductCard implements Prototype {
    private String  title;
    private int price;

    public ProductCard(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Object copy() {
        ProductCard clone = new ProductCard(title, price);
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCard that = (ProductCard) o;
        return price == that.price && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public String toString() {
        return "ProductCard{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
