package com.emp.inherit;

import java.util.Objects;

public class Employee {

    static {
        System.out.println("I am a static block");
    }

    protected double salary;
    protected int id;
    protected String name;

    static int number = 100;

    public Employee() {
        this.id = number++;
        this.name = "Alice";
        this.salary = 110000d;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
    	//this.id = number++;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.id + " | " + this.name + " | $" + this.salary;
    }
    
     double incrementSalary() {
    	return salary + (salary * 0.2);
    	
    }
     
     //To fetch the name property outside the class 
	 public String getName() {
		 return name;
	 }
	 
	 //For updating the private property name outside the class
	 public void setName(String name) {
		 this.name = name;
	 }

	 public double getSalary() {
		 return salary;
	 }

	 public void setSalary(double salary) {
		 this.salary = salary;
	 }

	 @Override
	 public int hashCode() {
		return Objects.hash(Integer.valueOf(id), name, Double.valueOf(salary));
	 }

	 @Override
	 public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
			//&& salary == other.salary;
		
	 }

	 @Override
	 protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		 System.out.println("Employee: " + id + "is garbage collected");
	 }
     
     
     public double calculateSalary(){
    	 return salary;
     }
     
     public void display() {
    	 System.out.println(this.id + " | " + this.name + " | $" + this.salary);
     }
}