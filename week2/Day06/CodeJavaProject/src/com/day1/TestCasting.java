package com.day1;

public class TestCasting {

	public static void main(String[] args) {
		
		int num = 200;
		double d = num;
		System.out.println("Widening cast converstion from int to double: " + d);
		
		double value = 9.87;
		int rounded = (int) value;
		System.out.println("Narrowing cast converstion from double to int: " + rounded); // rounded down
		
		char ch = 'A';
		int ascii = ch;
		System.out.println("Char to int conversion: " + ascii);
		
		
	}

}
