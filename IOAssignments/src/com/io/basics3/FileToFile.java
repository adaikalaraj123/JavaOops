package com.io.basics3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileToFile {

	public static void main(String[] args) {
		String inputFile = "input.txt";
		String outputFile = "output.txt";
		try(
				BufferedReader reader = new BufferedReader(new FileReader(outputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile));
		) {
			String line;
			while((line = reader.readLine())!=null){
				writer.write(line);
				writer.newLine();
			}
            System.out.println("File copied successfully from " + inputFile + " to " + outputFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			 System.out.println("An error occurred: " + e.getMessage());
		}
	}

}
