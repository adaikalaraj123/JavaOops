package com.io.basics13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "example.txt"; // existing file

        // --- Append to the file ---
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            System.out.println("Enter text to append into the file (type 'exit' to finish):");
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Text successfully appended to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // --- Read updated file content ---
        System.out.println("\nReading updated content from file: " + fileName);
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
