package com.io.basics5;

import java.io.File;
import java.util.Scanner;

public class ListFilesInDirectory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String dirPath = sc.nextLine();

        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            String[] fileList = directory.list(); // get list of file/directory names
            System.out.println("Contents of directory: " + dirPath);
            for (String name : fileList) {
                System.out.println(name);
            }
        } else {
            System.out.println("Invalid directory path or path does not exist.");
        }
        sc.close();
	}

}
