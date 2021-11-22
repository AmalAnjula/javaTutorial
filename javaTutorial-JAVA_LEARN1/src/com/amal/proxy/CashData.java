package com.amal.proxy;

public class CashData implements Data {

    private RealData realData;
    private String filename;
    public CashData(String filename){
        this.filename=filename;
    }
    @Override
    public void showData() {
        if (realData==null){
            realData=new RealData(filename);
            System.out.println("reqsting fresh");
        }
        realData.showData();
    }
}
