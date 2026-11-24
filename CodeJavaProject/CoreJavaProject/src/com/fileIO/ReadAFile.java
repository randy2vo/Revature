package com.fileIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAFile {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("testfile.txt");
				BufferedInputStream bis = new BufferedInputStream(fis)) {

			int data;
			while ((data = bis.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: testfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}