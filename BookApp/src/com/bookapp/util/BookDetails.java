package com.bookapp.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
    public static List<Book> getBooks() {
        return Arrays.asList(
            new Book(101, "Java Fundamentals", 450.0, "James Gosling", "Programming", LocalDate.of(2020, 5, 10)),
            new Book(102, "Spring in Action", 600.0, "Craig Walls", "Programming", LocalDate.of(2019, 8, 15)),
            new Book(103, "Clean Code", 800.0, "Robert Martin", "Programming", LocalDate.of(2015, 3, 12)),
            new Book(104, "Effective Java", 700.0, "Joshua Bloch", "Programming", LocalDate.of(2018, 11, 1)),
            new Book(105, "Harry Potter", 500.0, "J.K. Rowling", "Fiction", LocalDate.of(2001, 7, 21)),
            new Book(106, "The Alchemist", 350.0, "Paulo Coelho", "Fiction", LocalDate.of(1995, 6, 1))
        );
    }
}
