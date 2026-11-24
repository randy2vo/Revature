package com.fileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) {
		
		try (FileWriter fw = new FileWriter("written.txt");
				FileReader fr = new FileReader("written.txt");) {
			fw.write("Hello! My name is AI bot");
			fw.close();
			int i = fr.read();
			while(i != -1) {
				System.out.print((char) i);
				i = fr.read();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
