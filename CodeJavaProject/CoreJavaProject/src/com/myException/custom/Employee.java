package com.myException.custom;

public class Employee {

	int id;
	String name;
	double salary;
	
	
	
	@Override
	public String toString() {
		
		return "Employee [id=" + id + ", name= " + name + ", salary=" + salary + "]";
	}


	public Employee(int id, String name, double salary) throws InvalidSalaryException {
		super();
		this.id = id;
		this.name = name;
		if(salary < 0) {
			throw new InvalidSalaryException("you may not enter this amount");
		}
		this.salary = salary;
	}
	
	
}
