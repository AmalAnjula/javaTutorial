package com.amal.sqlInsert;

public class AddStudent extends Student{
    public AddStudent(String name, int age, String password, int id) {
        super(name, age, password, id);
        setName(name);
        setAge(age);
        setPassword(password);
        setId(id);
    }
}
