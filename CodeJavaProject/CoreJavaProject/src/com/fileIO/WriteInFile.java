package com.fileIO;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class WriteInFile {

	public static void main(String[] args) throws Throwable {
		
		FileOutputStream fops = null;
		
		try {
		fops = new FileOutputStream("testfile.txt");
		String toWrite = "the quick red fox jumped over the lazy dog";
		fops.write(toWrite.getBytes());
		System.out.println("Content has been written");
		} catch (IOException e) {
		System.out.println("File not avaiable");
		} finally {
		fops.close();
		System.out.println("File closed");
	}
	
		
	}		

}
