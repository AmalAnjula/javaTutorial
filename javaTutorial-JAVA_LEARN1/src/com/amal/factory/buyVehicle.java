package com.amal.factory;

public class buyVehicle {
    public static void main(String[] args) {
        factorymain factoryMain=new factorymain();

        vehicle myVehicle=factoryMain.getVehicle("CHEEP");
        myVehicle.showSpec();
    }
}
