package com.io.basics6;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class ListFilesWithExtension {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String dirPath = sc.nextLine();

        System.out.print("Enter file extension (e.g., txt, csv, java): ");
        String extension = sc.nextLine().trim();

        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            // Filter files with the given extension
            FilenameFilter filter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.toLowerCase().endsWith("." + extension.toLowerCase());
                }
            };

            String[] matchingFiles = directory.list(filter);

            if (matchingFiles != null && matchingFiles.length > 0) {
                System.out.println("Files with ." + extension + " extension:");
                for (String fileName : matchingFiles) {
                    System.out.println(fileName);
                }
            } else {
                System.out.println("No files with ." + extension + " found in the directory.");
            }

        } else {
            System.out.println("❌ Invalid directory path or path does not exist.");
        }

        sc.close();
	}

}
