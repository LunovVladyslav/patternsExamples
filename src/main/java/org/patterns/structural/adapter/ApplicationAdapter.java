package org.patterns.structural.adapter;

public class ApplicationAdapter extends Application implements ApiService{
    @Override
    public void sendAllData() {
        getAllData();
    }

    @Override
    public void sendDataById(Long id) {
        getDataById(id);
    }

    @Override
    public void upload() {
        postNewData();
    }
}
