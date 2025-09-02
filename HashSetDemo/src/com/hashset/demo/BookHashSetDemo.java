package com.hashset.demo;

import java.util.HashSet;
import java.util.Set;

public class BookHashSetDemo {

    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();

        books.add(new Book("Java Basics", "Author A", "101"));
        books.add(new Book("Advanced Java", "Author B", "102"));
        books.add(new Book("Spring Boot", "Author C", "103"));
        books.add(new Book("Hibernate", "Author D", "104"));
        books.add(new Book("Microservices", "Author E", "105"));
        books.add(new Book("Algorithms", "Author F", "106"));
        books.add(new Book("Data Structures", "Author G", "107"));
        books.add(new Book("Java Basics", "Author X", "101")); // duplicate (title+isbn same)

        System.out.println("Books in HashSet (duplicates removed):");
        for (Book b : books) {
            System.out.println(b);
        }
    }

}
