package com.day1;

public class TestWrapper {

	public static void main(String[] args) {
	
		//wrapping a primitive value into corresponding wrapper class.
		Integer age = 24;
		Double price = 48.00;
		Character grade = 'A';
		Boolean active = true;
		
		System.out.println(age);
		System.out.println(price);
		System.out.println(grade);
		System.out.println(active);
	
		int x = 210;
		Integer y = x; //autoboxing: primitive to wrapper
		System.out.println(y);
		
		int z = 2;
		z = age.intValue(); //unboxing: wrapper to primitive
		System.out.println(z); //prints the unboxed primitive value
		
		double p = price.doubleValue(); //unboxing: wrapper to primitive
		System.out.println(p);
		
		String num = "200";
		int amount = Integer.parseInt(num); //parsing string to primitive
		System.out.println(amount);
		
		
	}

}
