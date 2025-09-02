package com.io.basics7;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileProperties {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file/directory path: ");
        String path = sc.nextLine();

        File file = new File(path);

        // a) Check if file or directory exists
        if (file.exists()) {
            System.out.println("File/Directory exists.");
        } else {
            System.out.println("File/Directory does not exist.");
            sc.close();
            return; // exit if path doesn't exist
        }

        // b) Check read/write permissions
        System.out.println("Read permission: " + file.canRead());
        System.out.println("Write permission: " + file.canWrite());

        // c) Check if directory or file
        if (file.isDirectory()) {
            System.out.println("This is a Directory.");
        } else if (file.isFile()) {
            System.out.println("This is a File.");
        }

        // d) Get file size
        long bytes = file.length();
        double kb = bytes / 1024.0;
        double mb = kb / 1024.0;
        System.out.printf("File size: %d bytes | %.2f KB | %.2f MB%n", bytes, kb, mb);

        // e) Last modified date
        long lastModified = file.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = sdf.format(new Date(lastModified));
        System.out.println("Last modified: " + formattedDate);

        sc.close();
	}

}
