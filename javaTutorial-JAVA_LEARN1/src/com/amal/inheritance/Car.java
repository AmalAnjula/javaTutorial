package com.amal.inheritance;

class  Car extends Vehicle{
    protected void remoteLock() {
        System.out.println("car Remote lock ok.");
    }
    @Override
    public void stopNow(){
        super.idle();
        System.out.println("Hybrid car Stoped");
    }
    int noOfDoor =0;
    public Car(String name,String fuel,String no,int noOfDoor){
        super(name,fuel,no);
        this.noOfDoor =noOfDoor;
    }
}