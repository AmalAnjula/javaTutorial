package com.amal.factory;

public class factoryMain {

    public  vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("CHEEP")){
            return new alto();
        }
        else if(type.equalsIgnoreCase("MIDDLE")){
            return new wagonR();
        }
        return  null;
    }
}
