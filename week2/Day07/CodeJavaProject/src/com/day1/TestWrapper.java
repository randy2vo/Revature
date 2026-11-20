package com.day1;

public class TestWrapper {

	public static void main(String[] args) {

		String age = "25";
		String salary = "45000.75";
		String active = "true";

		try {
			Integer ageValue = Integer.valueOf(age);      // String -> Integer
			Double salaryValue = Double.valueOf(salary);  // String -> Double
			Boolean activeValue = Boolean.valueOf(active); // String -> Boolean

			double incrementedSalary = salaryValue + (salaryValue * 0.10); // unboxing happens here

			printWithType("age", ageValue);
			printWithType("salary", salaryValue);
			printWithType("active", activeValue);
			printWithType("salaryAfter10Percent", incrementedSalary); // autoboxing to Double for Object

		} catch (NumberFormatException e) {
			System.out.println("Invalid numeric input: " + e.getMessage());
		}
	}

	private static void printWithType(String label, Object value) {
		System.out.println(label + " = " + value + " (" + value.getClass().getSimpleName() + ")");
	}

}