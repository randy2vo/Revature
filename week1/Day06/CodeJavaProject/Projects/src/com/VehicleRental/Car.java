package com.VehicleRental;

public class Car extends Vehicle {
	
	private double insurancePerDay;

	public Car(int vehicleNumber, String model, double ratePerDay, int days, double insurancePerDay) {
		super(vehicleNumber, model, ratePerDay, days);
		this.insurancePerDay = insurancePerDay;
	}	
	
	@Override
	public double calculateRent() {
		
		return (ratePerDay + insurancePerDay) * days;
	}

	@Override
	public void displayDetails() {
	
		System.out.println("Car | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + calculateRent());
	}
	
	

	

}