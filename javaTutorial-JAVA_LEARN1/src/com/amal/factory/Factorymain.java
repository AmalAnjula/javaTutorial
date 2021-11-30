package com.amal.factory;

public class Factorymain {

    public Vehicle getVehicle(String type){ // Vehcile enna ona
        if(type.equalsIgnoreCase("CHEEP")){
            return new Alto();
        }
        else if(type.equalsIgnoreCase("MIDDLE")){
            return new Wagonr();
        }
        return  null; // return statemnt ekak danna
    }
}
