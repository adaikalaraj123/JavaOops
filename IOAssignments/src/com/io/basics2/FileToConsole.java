package com.io.basics2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileToConsole {

	public static void main(String[] args) {
		String fileName = "output.txt";
		try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
			String content;
			while((content=reader.readLine())!=null) {
				System.out.println(content);
			}
		} catch (FileNotFoundException e) {
            System.out.println("An error occurred file is not found: " + e.getMessage());
		} catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
		}
	}

}
