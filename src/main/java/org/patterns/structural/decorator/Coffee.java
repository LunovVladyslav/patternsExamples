package org.patterns.structural.decorator;

public abstract class Coffee implements BuyCoffee{
    private String description = "No description";
    int price = 0;

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
