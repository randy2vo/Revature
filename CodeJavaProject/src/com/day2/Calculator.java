package com.day2;

public class Calculator {
	
	public static int addition() {
		return 1 + 2;
	}
	
	public static int addition(int a, int b) {
		return a + b;
	}
	
	public static int multiplication() {
		return 2 * 3;
	}
	
	public static int multiplication(int a, int b) {
		return a * b;
	}
	
	public static int division() {
		return 2 / 2;
	}
	
	public static int division(int a, int b) {
		if(b == 0) {
			System.out.println("Error: Division by zero is not allowed.");
			return 0; // or throw an exception, depending on your design choice
		}
		return a / b;
	}
	
	
	public static void main(String[] args) {
	
	System.out.println(addition());
	System.out.println(addition(5, 10));
	
	System.out.println(multiplication());
	System.out.println(multiplication(5, 10));
	
	System.out.println(division());
	System.out.println(division(10, 2));
	
	
	}
	
}
