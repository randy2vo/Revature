package com.fileIO;

import java.io.Serializable;

public class Employee implements Serializable{

	int id;
	String name;
	double salary;
	
	
	@Override
	public String toString() {
		
		return "Employee [id=" + id + ", name= " + name + ", salary=" + salary + "]";
	}

	public double calculateSalary() {
		return salary + 1.0;
}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}
