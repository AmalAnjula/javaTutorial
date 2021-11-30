package com.amal.factory;

public class Buyvehicle {
    public static void main(String[] args) {
        Factorymain factoryMain=new Factorymain();

        Vehicle myVehicle=factoryMain.getVehicle("CHEEP");
        myVehicle.showSpec();
    }
}
