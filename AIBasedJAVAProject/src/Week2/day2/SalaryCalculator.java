package Week2.day2;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Salary Calculator");

		int employeeId = readPositiveInt(sc, "Enter employee ID: ");

		System.out.print("Enter employee name: ");
		String employeeName = sc.nextLine();

		double basicSalary = readPositiveDouble(sc, "Enter basic salary (Rs): ");

		double hra = calculateHRA(basicSalary);
		double da = calculateDA(basicSalary);
		double grossSalary = calculateGrossSalary(basicSalary, hra, da);
		double professionalTax = calculateTax(grossSalary);
		double netSalary = calculateNetSalary(grossSalary, professionalTax);

		printSalarySlip(employeeId, employeeName, basicSalary, hra, da, grossSalary, professionalTax, netSalary);

		sc.close();
	}

	// Reads a positive integer value for employee ID.
	public static int readPositiveInt(Scanner sc, String prompt) {
		while (true) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				int value = sc.nextInt();
				sc.nextLine(); // Consume leftover newline after reading number
				if (value > 0) {
					return value;
				}
				System.out.println("Please enter an ID greater than 0.");
			} else {
				System.out.println("Invalid input. Please enter a whole number for ID.");
				sc.next();
			}
		}
	}

	// Reads a basic salary greater than 0.
	public static double readPositiveDouble(Scanner sc, String prompt) {
		while (true) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				double value = sc.nextDouble();
				if (value > 0) {
					return value;
				}
				System.out.println("Please enter a salary greater than 0.");
			} else {
				System.out.println("Invalid input. Please enter a numeric value.");
				sc.next();
			}
		}
	}

	// HRA is 20% of basic salary.
	public static double calculateHRA(double basicSalary) {
		return basicSalary * 0.20;
	}

	// DA is 10% of basic salary.
	public static double calculateDA(double basicSalary) {
		return basicSalary * 0.10;
	}

	// Gross salary is basic + HRA + DA.
	public static double calculateGrossSalary(double basicSalary, double hra, double da) {
		return basicSalary + hra + da;
	}

	// Professional tax is Rs. 200 only when gross salary is above Rs. 20,000.
	public static double calculateTax(double grossSalary) {
		if (grossSalary > 20000) {
			return 200.0;
		} else {
			return 0.0;
		}
	}

	// Net salary is gross salary minus professional tax.
	public static double calculateNetSalary(double grossSalary, double professionalTax) {
		return grossSalary - professionalTax;
	}

	public static void printSalarySlip(int employeeId, String employeeName, double basicSalary, double hra, double da,
			double grossSalary, double professionalTax, double netSalary) {
		System.out.println("\n----- Employee Salary Slip -----");
		System.out.println("Employee ID            : " + employeeId);
		System.out.println("Employee Name          : " + employeeName);
		System.out.println("Basic Salary (Rs)      : " + String.format("%.2f", basicSalary));
		System.out.println("HRA 20% (Rs)           : " + String.format("%.2f", hra));
		System.out.println("DA 10% (Rs)            : " + String.format("%.2f", da));
		System.out.println("Gross Salary (Rs)      : " + String.format("%.2f", grossSalary));
		System.out.println("Professional Tax (Rs)  : " + String.format("%.2f", professionalTax));
		System.out.println("Net Salary (Rs)        : " + String.format("%.2f", netSalary));
	}
}