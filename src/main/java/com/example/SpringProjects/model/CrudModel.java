package com.example.SpringProjects.model;

public class CrudModel {
    private String name;
    private int age;

    public CrudModel(){}

    public CrudModel(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    
}
