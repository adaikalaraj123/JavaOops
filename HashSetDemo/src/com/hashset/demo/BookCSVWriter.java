package com.hashset.demo;

import java.io.*;
import java.util.*;

public class BookCSVWriter {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        books.add(new Book("Java Basics", "Author A", "101"));
        books.add(new Book("Advanced Java", "Author B", "102"));
        books.add(new Book("Spring Boot", "Author C", "103"));
        books.add(new Book("Hibernate", "Author D", "104"));
        books.add(new Book("Microservices", "Author E", "105"));
        books.add(new Book("Algorithms", "Author F", "106"));
        books.add(new Book("Data Structures", "Author G", "107"));
        books.add(new Book("Java Basics", "Author X", "101")); // duplicate ignored

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("books.csv"))) {
            // Header row
            bw.write("Title,Author,ISBN");
            bw.newLine();

            // Write each book
            for (Book book : books) {
                bw.write(book.getTitle() + "," + book.getAuthor() + "," + book.getIsbn());
                bw.newLine();
            }
            System.out.println("Books written to books.csv successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
