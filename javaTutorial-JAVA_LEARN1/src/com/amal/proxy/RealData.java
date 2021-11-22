package com.amal.proxy;

public class RealData implements Data {
    private String filename;
    @Override
    public void showData() {
        System.out.println("showing "+filename);
    }
    public RealData(String filename){
        this.filename=filename;
    }


}
