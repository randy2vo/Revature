package com.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObject {

	public static void main(String[] args) {
		
		Employee obj = new Employee(001, "Randy", 23232);
		Employee e2;
		
		try (FileOutputStream fos = new FileOutputStream("emp.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(obj);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e3) {
			e3.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("emp.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			e2 = (Employee) ois.readObject();
			System.out.println(e2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
