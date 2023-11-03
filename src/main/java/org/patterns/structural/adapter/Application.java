package org.patterns.structural.adapter;

public class Application {
    void getAllData() {
        System.out.println("All data from service were downloaded");
    }

    void getDataById(Long id) {
        System.out.println("Data with id %s was downloaded".formatted(id));
    }

    void postNewData() {
        System.out.println("New data uploaded to the service successfully");
    }
}
