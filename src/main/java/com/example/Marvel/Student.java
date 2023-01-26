package com.example.Marvel;

public class Student {
    private int AdmnNo;
    private String name;
    private int age;
    private String state;

    //Constructor

    public Student(int admnNo, String name, int age, String state) {
        AdmnNo = admnNo;
        this.name = name;
        this.age = age;
        this.state = state;
    }

    //Getters and Setters

    public int getAdmnNo() {
        return AdmnNo;
    }

    public void setAdmnNo(int admnNo) {
        AdmnNo = admnNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
