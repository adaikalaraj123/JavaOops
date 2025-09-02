package com.io.basics14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirstThreeLines {

	public static void main(String[] args) {
		String fileName = "example.txt"; // file to read
        int linesToRead = 3;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;

            System.out.println("First " + linesToRead + " lines from " + fileName + ":");
            while ((line = br.readLine()) != null && count < linesToRead) {
                System.out.println(line);
                count++;
            }

            if (count == 0) {
                System.out.println("The file is empty!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
