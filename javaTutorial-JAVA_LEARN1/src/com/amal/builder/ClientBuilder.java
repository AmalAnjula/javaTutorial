package com.amal.builder;

public class ClientBuilder {

    private String name;
    private int age;
    private String hometown;
    private String position;

    public ClientBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ClientBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public ClientBuilder sethomeTown(String homeTown) {
        this.hometown = homeTown;
        return this;
    }

    public ClientBuilder setPosition(String position) {
        this.position = position;
        return this;
    }

    public Client getDetail() {
        return new Client(name, age, hometown, position);
    }
}
