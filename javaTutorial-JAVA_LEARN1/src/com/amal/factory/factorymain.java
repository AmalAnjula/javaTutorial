package com.amal.factory;

public class factorymain {

    public  vehicle getVehicle(String type){ // Vehcile enna ona
        if(type.equalsIgnoreCase("CHEEP")){
            return new ALTO();
        }
        else if(type.equalsIgnoreCase("MIDDLE")){
            return new WAGONR();
        }
        return  null; // return statemnt ekak danna
    }
}
