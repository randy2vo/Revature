package com.emp.inherit;

public class TemporaryEmployee extends Employee {

    private int workingDays;
    private double perDayRate;

    public TemporaryEmployee(int id, String name, double salary, int workingDays, double perDayRate) {
        super(id, name, salary);
        this.workingDays = workingDays;
        this.perDayRate = perDayRate;
    }

    public double calculateSalary() {
        return this.salary + (workingDays * perDayRate);
    }

    @Override
    public String toString() {
        return super.toString() + " | Per-day rate: $" + perDayRate + " | Working days: " + workingDays;
    }

    @Override
    public void display() {
        System.out.println(this);
    }
}
