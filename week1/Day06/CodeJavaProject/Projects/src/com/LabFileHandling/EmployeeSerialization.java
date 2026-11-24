package com.LabFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {

	public static void main(String[] args) throws ClassNotFoundException {
		Employee[] employees = {
				new Employee(101, "Randy", "SWE", 72000.00),
				new Employee(102, "Grace", "Hr", 62000.00),
				new Employee(103, "Sophie", "Engineer", 82000.00),
				new Employee(104, "Jodi", "Marketing", 88000.00),
				new Employee(105, "Richard", "IT", 46000.00),
		};
		
		try(FileOutputStream fos = new FileOutputStream("employees.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(employees);
			System.out.println("Employee array saved to employees.dat");
			
		} catch(IOException e) {
			e.getMessage();
			return;
		}
		
		try(FileInputStream fis = new FileInputStream("employees.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Employee[] savedEmployees = (Employee[]) ois.readObject();
			
			System.out.println("\nEmployee read from file");
			for(Employee employee : savedEmployees) {
				System.out.println(employee);
				
			}
		} catch (IOException e) {
			e.getMessage();
		}

	}

}
