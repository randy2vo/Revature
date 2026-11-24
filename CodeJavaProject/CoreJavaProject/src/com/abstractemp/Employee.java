package com.abstractemp;

public abstract class Employee {

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println(id + " | " + name + " | " + salary);
    }

    abstract double calculateSalary();
}