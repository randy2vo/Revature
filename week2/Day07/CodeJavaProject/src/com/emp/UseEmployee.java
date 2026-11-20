package com.emp;

public class UseEmployee {

	public static void main(String[] args) {
		Employee empObj1 = new Employee();
		System.out.println(empObj1.id);
		System.out.println(empObj1.name);
		System.out.println(empObj1.salary);
		
		System.out.println("==================================");
		
		Employee empObj2 = new Employee();
		System.out.println(empObj1.id);
		System.out.println(empObj1.name);
		System.out.println(empObj1.salary);
		
		System.out.println(empObj1);
		System.out.println(empObj2);
	}

}
