package com.amal.InheritanceEx;

class  Car extends Vehicle{
    protected void RemoteLock() {
        System.out.println("car Remote lock ok.");
    }
    @Override
    public void  StopNow(){
        super.idle();
        System.out.println("Hybrid car Stoped");
    }
    private int NoOfDoor;
    public Car(String name,String fuel,String no,int no_of_door){
        setNo(no);
        setFuel(fuel);
        setName(name);
        this.NoOfDoor=no_of_door;
    }
}