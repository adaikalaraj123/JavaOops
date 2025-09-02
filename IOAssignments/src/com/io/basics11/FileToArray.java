package com.io.basics11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileToArray {

	public static void main(String[] args) {
		String filePath = "input.txt"; // replace with your file path
        List<String> linesList = new ArrayList<>();

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("sFile does not exist: " + filePath);
            return;
        }

        // Read the file line by line
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                linesList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert List to Array
        String[] linesArray = linesList.toArray(new String[0]);

        // Print array contents
        System.out.println("File content stored in array:");
        for (int i = 0; i < linesArray.length; i++) {
            System.out.println("Line " + (i + 1) + ": " + linesArray[i]);
        }
	}

}
