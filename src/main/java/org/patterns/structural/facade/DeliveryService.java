package org.patterns.structural.facade;

public class DeliveryService {
    Warehouse warehouse;

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    void registerNewDelivery() {
        warehouse.takeNewOrder();
        System.out.println("DeliveryService register new transport");
    }

    void checkTransferStatus() {
        if (warehouse.checkOrderStatus()) {
            System.out.println("Courier going to the client");
            return;
        }
        System.out.println("Courier waits for an order completions");
    }

    void completeTransfer() {
        System.out.println("Order have been delivered to the client");
    }
}
