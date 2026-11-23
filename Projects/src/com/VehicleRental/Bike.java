package com.VehicleRental;

public class Bike extends Vehicle{

	public Bike(int vehicleNumber, String model, double ratePerDay, int days) {
		super(vehicleNumber, model, ratePerDay, days);
	}
	
	@Override
	public double calculateRent() {
		double regularRent = ratePerDay * days;
		return regularRent * 0.90;
	}
	
	@Override
	public void displayDetails() {
        System.out.println("Bike | " + vehicleNumber + " | " + model
                + " | Days: " + days + " | Rent: " + calculateRent());
    }

}
