package com.io.basics15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LongestWordInFile {

	public static void main(String[] args) {
		String fileName = "example.txt"; // replace with your file path
        String longestWord = "";
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Split the line into words
                StringTokenizer tokenizer = new StringTokenizer(line, " ,.;:-!?\"()[]{}");
                while (tokenizer.hasMoreTokens()) {
                    String word = tokenizer.nextToken();
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }

            if (!longestWord.isEmpty()) {
                System.out.println("The longest word in the file is: " + longestWord);
                System.out.println("Length: " + longestWord.length());
            } else {
                System.out.println("The file is empty or contains no valid words.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
