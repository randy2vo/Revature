package com.day1;

public class StringtoWrap {

	public static void main(String[] args) {
		// Valid input case
		processInput("25", "45000.75", "true");

		System.out.println("----------------------");

		// Invalid numeric input case
		processInput("2x5", "45000.75", "true");
	}

	private static void processInput(String age, String salary, String active) {
		try {
			Integer ageValue = Integer.valueOf(age);
			Double salaryValue = Double.valueOf(salary);
			Boolean activeValue = Boolean.valueOf(active);

			double salaryAfterIncrement = salaryValue + (salaryValue * 0.10);

			printWithType("age", ageValue);
			printWithType("salary", salaryValue);
			printWithType("active", activeValue);
			printWithType("salaryAfter10Percent", salaryAfterIncrement);
		} catch (NumberFormatException e) {
			System.out.println("Invalid numeric input: " + e.getMessage());
		}
	}

	private static void printWithType(String label, Object value) {
		System.out.println(label + " = " + value + " (" + value.getClass().getSimpleName() + ")");
	}

}