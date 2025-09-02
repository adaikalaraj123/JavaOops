package com.io.basics12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteReadTextFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String fileName = "example.txt"; // file to write and read

        // --- Write to the file ---
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Enter text to write into the file (type 'exit' to finish):");
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Text successfully written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // --- Read from the file ---
        System.out.println("\nReading from file: " + fileName);
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
	}

}
