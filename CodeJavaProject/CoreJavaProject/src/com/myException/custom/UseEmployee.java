package com.myException.custom;

public class UseEmployee {

	public static void main(String[] args) {
		
		try {
			Employee e1 = new Employee(100, "Bob", 232.32);
			System.out.println(e1);
		}catch (InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}
	}

}
