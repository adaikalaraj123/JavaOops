package com.io.basics4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample {

	public static void main(String[] args) {
		String fileName = "newfile.txt"; // File to create
	    String content = "Hello! This is a sample content.\nWelcome to Java file handling.";
	    try {
            File file = new File(fileName);

            // Check if file already exists
            if (file.createNewFile()) {
                System.out.println("created: " + file.getName());
            } else {
                System.out.println("File already exists. Contents will be overwritten.");
            }

            // Write content to the file
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write(content);
                System.out.println("Content written to file successfully!");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	    
	}

}
