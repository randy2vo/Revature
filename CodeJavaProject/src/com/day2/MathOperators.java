package com.day2;

public class MathOperators {

	public static void main(String[] args) {
		double a = 25.0;
		double b = 7.0;

		System.out.println("Math.abs(-15) = " + Math.abs(-15)); // absolute value
		System.out.println("Math.max(a, b) = " + Math.max(a, b)); // larger of two numbers
		System.out.println("Math.min(a, b) = " + Math.min(a, b)); // smaller of two numbers
		System.out.println("Math.pow(2, 5) = " + Math.pow(2, 5)); // 2 raised to power 5
		System.out.println("Math.sqrt(a) = " + Math.sqrt(a)); // square root
		System.out.println("Math.cbrt(27) = " + Math.cbrt(27)); // cube root
		System.out.println("Math.ceil(4.2) = " + Math.ceil(4.2)); // round up
		System.out.println("Math.floor(4.8) = " + Math.floor(4.8)); // round down
		System.out.println("Math.round(4.6) = " + Math.round(4.6)); // nearest whole number
		System.out.println("Math.random() = " + Math.random()); // random value from 0.0 to less than 1.0
		System.out.println("Math.sin(Math.toRadians(30)) = " + Math.sin(Math.toRadians(30))); // sine of 30 degrees
		System.out.println("Math.log(10) = " + Math.log(10)); // natural logarithm (base e)
	}

}