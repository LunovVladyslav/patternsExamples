package org.patterns.structural.facade;

public class TransferApp {
    Warehouse warehouse = new Warehouse();
    DeliveryService service = new DeliveryService();

    void submitNewOrder() {
        service.setWarehouse(warehouse);
        service.registerNewDelivery();
        System.out.println("==========");

        service.checkTransferStatus();
        warehouse.packNewOrder();
        warehouse.completeOrder();
        service.checkTransferStatus();
        System.out.println("==========");
        service.completeTransfer();
    }
}
