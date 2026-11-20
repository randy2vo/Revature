package Week2.day2;

import java.util.Scanner;

public class BillingApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to SmartStore Billing");

		System.out.print("Enter customer name: ");
		String customerName = sc.nextLine();

		System.out.print("Enter product name: ");
		String productName = sc.nextLine();

		double unitPrice = readPositiveDouble(sc, "Enter product price: ");

		int quantityPurchased = readPositiveInt(sc, "Enter quantity: ");

		// Calculate total purchase amount
		double totalAmount = unitPrice * quantityPurchased;
		double discountPercentage = getDiscountPercentage(totalAmount);
		double discountAmount = calculateDiscount(totalAmount);
		double finalAmount = totalAmount - discountAmount;

		printBill(customerName, productName, unitPrice, quantityPurchased, totalAmount, discountPercentage, discountAmount,
				finalAmount);

		sc.close();
	}

	// Reads a positive decimal value from console and keeps prompting until valid.
	public static double readPositiveDouble(Scanner sc, String prompt) {
		while (true) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				double value = sc.nextDouble();
				if (value > 0) {
					return value;
				}
				System.out.println("Please enter a value greater than 0.");
			} else {
				System.out.println("Invalid number. Please enter a numeric value.");
				sc.next();
			}
		}
	}

	// Reads a positive integer value from console and keeps prompting until valid.
	public static int readPositiveInt(Scanner sc, String prompt) {
		while (true) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				int value = sc.nextInt();
				if (value > 0) {
					return value;
				}
				System.out.println("Please enter an integer greater than 0.");
			} else {
				System.out.println("Invalid quantity. Please enter a whole number.");
				sc.next();
			}
		}
	}

	// Returns discount percentage based on purchase total.
	public static double getDiscountPercentage(double totalAmount) {
		if (totalAmount >= 5000) {
			return 10.0;
		}
		if (totalAmount >= 1000) {
			return 5.0;
		}
		return 0.0;
	}

	// Returns discount amount in rupees based on total purchase amount
	public static double calculateDiscount(double totalAmount) {
		return totalAmount * (getDiscountPercentage(totalAmount) / 100.0);
	}

	public static void printBill(String customerName, String productName, double unitPrice, int quantityPurchased,
			double totalAmount, double discountPercentage, double discountAmount, double finalAmount) {
		System.out.println("\n----- SmartStore Bill -----");
		System.out.println("Customer Name      : " + customerName);
		System.out.println("Product Name       : " + productName);
		System.out.println("Product Price (Rs) : " + String.format("%.2f", unitPrice));
		System.out.println("Quantity           : " + quantityPurchased);
		System.out.println("Total Amount (Rs)  : " + String.format("%.2f", totalAmount));
		System.out.println("Discount %         : " + String.format("%.2f", discountPercentage));
		System.out.println("Discount Amount(Rs): " + String.format("%.2f", discountAmount));
		System.out.println("Final Amount (Rs)  : " + String.format("%.2f", finalAmount));
	}
}