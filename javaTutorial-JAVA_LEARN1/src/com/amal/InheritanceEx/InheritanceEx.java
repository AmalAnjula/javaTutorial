// parana gedara kitch, bed room eka aran alut geyak hadnwa wag
package com.amal.InheritanceEx;

public class InheritanceEx {
    public static void main(String[] args) {
        bike bike=new bike("CT100","Petrol","BFB-3223");
        bike.startNow();
        Car car=new Car("Aqua","Hybrid","CBB3212",5);
        car.StopNow();
        Vehicle common=new Vehicle();
        car.RemoteLock();
    }
}
