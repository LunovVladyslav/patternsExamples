package org.patterns.structural.adapter;

public class AdapterExample {
    public static void main(String[] args) {
        ApiService service = new ApplicationAdapter();

        service.sendAllData();
        service.sendDataById(10L);
        service.upload();
    }
}
