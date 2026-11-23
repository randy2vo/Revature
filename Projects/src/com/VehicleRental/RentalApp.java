package com.VehicleRental;

import java.util.Scanner;

public class RentalApp {
   
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of vehicles: ");
		
		int numberOfVehicles = sc.nextInt();
		sc.nextLine();
		
		Vehicle[] vehicles = new Vehicle[numberOfVehicles];
		
		for (int i = 0; i < numberOfVehicles; i++) {
            int type;

            do {
                System.out.print("Enter type (1-Car, 2-Bike): ");
                type = sc.nextInt();
                sc.nextLine();

                if (type != 1 && type != 2) {
                    System.out.println("Invalid type. Enter 1 for Car or 2 for Bike.");
                }
            } while (type != 1 && type != 2);

            System.out.print("Enter Vehicle Number: ");
            int vehicleNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Model: ");
            String model = sc.nextLine();

            System.out.print("Enter Rate per Day: ");
            double ratePerDay = sc.nextDouble();

            System.out.print("Enter Days: ");
            int days = sc.nextInt();
            sc.nextLine();

            Vehicle vehicle;

            if (type == 1) {
                System.out.print("Enter Insurance per Day: ");
                double insurancePerDay = sc.nextDouble();
                sc.nextLine();

                vehicle = new Car(vehicleNumber, model, ratePerDay, days, insurancePerDay);
            } else {
                vehicle = new Bike(vehicleNumber, model, ratePerDay, days);
            }

            vehicles[i] = vehicle;
        }

        System.out.println("--- Rental Details ---");

        double totalRent = 0;

        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            totalRent += vehicle.calculateRent();
        }

        System.out.println("Total Rent Collected: " + totalRent);

        sc.close();
     
	}
}