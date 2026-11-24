package com.abstractemp;

public class PermanentEmployee extends Employee {

    private double bonus;

    public PermanentEmployee(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return salary + bonus;
    }
}