package com.example.scrollview;

public class PersonDataModel {
    final String name;
    final int age;
    final double salary;

    public PersonDataModel(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
