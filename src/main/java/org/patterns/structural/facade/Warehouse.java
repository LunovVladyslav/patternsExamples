package org.patterns.structural.facade;

public class Warehouse {
    boolean orderComplete = true;

    void takeNewOrder() {
        System.out.println("Warehouse taking new order");
        orderComplete = false;
    }

    void packNewOrder() {
        System.out.println("Order is packing into the box");
    }

    void completeOrder() {
        orderComplete = true;
    }

    boolean checkOrderStatus() {
        if (orderComplete) {
            System.out.println("Order is complete and waits for delivery");
            return orderComplete;
        }

        System.out.println("Order completion in progress ");
        return orderComplete;
    }
}
