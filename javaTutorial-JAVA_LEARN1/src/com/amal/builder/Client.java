package com.amal.builder;

public class Client {

    private  String name;
    private int age;
    public String homeTown ;
    public String position;

    public  Client (String name,int age,String homeTown,String position){
        super();
        this.name=name;
        this.age=age;
        this.homeTown=homeTown;
        this.position=position;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", homeTown='" + homeTown + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
