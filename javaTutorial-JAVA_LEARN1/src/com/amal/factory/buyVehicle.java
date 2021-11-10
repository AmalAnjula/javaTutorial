package com.amal.factory;

public class buyVehicle {
    public static void main(String[] args) {
        factoryMain factoryMain=new factoryMain();

        vehicle myVehicle=factoryMain.getVehicle("CHEEP");
        myVehicle.showSpec();
    }
}
