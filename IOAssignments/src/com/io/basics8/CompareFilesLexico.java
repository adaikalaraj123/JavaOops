package com.io.basics8;

import java.io.File;
import java.util.Scanner;

public class CompareFilesLexico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter path of first file: ");
        String path1 = sc.nextLine();

        System.out.print("Enter path of second file: ");
        String path2 = sc.nextLine();

        File file1 = new File(path1);
        File file2 = new File(path2);

        if (!file1.exists() || !file2.exists()) {
            System.out.println("One or both files do not exist.");
            sc.close();
            return;
        }

        // Compare lexicographically by file name
        int result = file1.getName().compareTo(file2.getName());

        if (result < 0) {
            System.out.println(file1.getName() + " comes before " + file2.getName());
        } else if (result > 0) {
            System.out.println(file1.getName() + " comes after " + file2.getName());
        } else {
            System.out.println("Both files have the same name.");
        }

        sc.close();
	}

}
