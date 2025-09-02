package com.io.basics10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileToVariable {

	public static void main(String[] args) {
		String filePath = "input.txt"; // replace with your file path
        StringBuilder fileContent = new StringBuilder(); // variable to store file content

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File does not exist: " + filePath);
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                fileContent.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the content stored in the variable
        System.out.println("File content stored in variable:");
        System.out.println(fileContent.toString());
	}

}
