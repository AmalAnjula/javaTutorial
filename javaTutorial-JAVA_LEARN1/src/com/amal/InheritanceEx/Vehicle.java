package com.amal.InheritanceEx;

class  Vehicle{

    private String name;
    private String fuel;
    private String no;

    public Vehicle(String name, String fuel, String no) {
        this.name = name;
        this.fuel = fuel;
        this.no = no;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public void startNow(){
        System.out.println(name+"  Starting");
        // System.out.println("Starting");
    }
    public void  StopNow(){
        System.out.println(name+"  Stoped");
    }
    public  void idle(){
        System.out.println("Car idle");
    }
}