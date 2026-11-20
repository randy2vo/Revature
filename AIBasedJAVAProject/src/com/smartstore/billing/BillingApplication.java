package com.smartstore.billing;

import java.util.Scanner;

public class BillingApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to SmartStore Billing");

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter product name: ");
        String productName = sc.nextLine();

        System.out.print("Enter product price: ");
        double productPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Total purchase amount before discount
        double totalAmount = productPrice * quantity;

        // Decide discount percentage based on total amount
        double discountPercentage;
        if (totalAmount >= 5000) {
            discountPercentage = 10.0;
        } else if (totalAmount >= 1000) {
            discountPercentage = 5.0;
        } else {
            discountPercentage = 0.0;
        }

        // Calculate discount amount and final amount
        double discountAmount = (totalAmount * discountPercentage) / 100;
        double finalAmount = totalAmount - discountAmount;

        System.out.println("\n----- SmartStore Bill -----");
        System.out.println("Customer Name      : " + customerName);
        System.out.println("Product Name       : " + productName);
        System.out.println("Product Price (Rs) : " + String.format("%.2f", productPrice));
        System.out.println("Quantity           : " + quantity);
        System.out.println("Total Amount (Rs)  : " + String.format("%.2f", totalAmount));
        System.out.println("Discount %         : " + String.format("%.2f", discountPercentage));
        System.out.println("Discount Amount(Rs): " + String.format("%.2f", discountAmount));
        System.out.println("Final Amount (Rs)  : " + String.format("%.2f", finalAmount));

        sc.close();
    }
}
