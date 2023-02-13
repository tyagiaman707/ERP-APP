package com.example.erpapp.model;

import java.util.List;

public class Student {
    private int rollnumber;
    private String name;
    private String gender;
    private List<Double> marks;
    private String city;

    public Student(int rollnumber, String name, String gender, List<Double> marks, String city) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.gender = gender;
        this.marks = marks;
        this.city = city;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Double> getMarks() {
        return marks;
    }

    public void setMarks(List<Double> marks) {
        this.marks = marks;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollnumber=" + rollnumber +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", marks=" + marks +
                ", city='" + city + '\'' +
                '}';
    }

}
