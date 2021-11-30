// parana gedara kitch, bed room eka aran alut geyak hadnwa wag
package com.amal.inheritance;

public class InheritanceEx {
    public static void main(String[] args) {
        BIke bike=new BIke("CT100","Petrol","BFB-3223");
        bike.startNow();
        Car car=new Car("Aqua","Hybrid","CBB3212",5);
        car.stopNow(); // stopNow enna ona
      //  Vehicle common=new Vehicle();
        car.remoteLock();
    }
}
