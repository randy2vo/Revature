package com.abstractemp;

public class UseEmployee {

	public static void main(String[] args) {
	PermanentEmployee e1 = new PermanentEmployee( 100, "Alice", 500, 1344);
	System.out.println(e1.calculateSalary());
	
	
	Employee s2 = new PermanentEmployee(100, "boi", 20999, 2323);
	System.out.println(s2.calculateSalary());
	}

}