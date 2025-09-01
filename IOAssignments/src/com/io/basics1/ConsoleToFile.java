package com.io.basics1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleToFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to write into the file (type 'exit' to stop):");
        try(FileWriter writer = new FileWriter("output.txt")) {
        	while(true) {
        		String input = scanner.nextLine();
        		if (input.equalsIgnoreCase("exit")) {
                    break;  // Stop when user types 'exit'
                }
        		writer.write(input + System.lineSeparator());
        		System.out.println("Data successfully written to output.txt");
        	}
        } catch (IOException e) {
        	System.out.println("An error occurred while writing to the file: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

}
