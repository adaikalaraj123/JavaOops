package com.bookapp.model;

import java.time.LocalDate;

public class Book {
    private String title;
    private Integer bookId;
    private double price;
    private String author;
    private String category;
    private LocalDate datePublished;

    // Default constructor
    public Book() {}

    // Parameterized constructor
    public Book(Integer bookId, String title, double price, String author, String category, LocalDate datePublished) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.category = category;
        this.datePublished = datePublished;
    }

    // Getters and setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Integer getBookId() { return bookId; }
    public void setBookId(Integer bookId) { this.bookId = bookId; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public LocalDate getDatePublished() { return datePublished; }
    public void setDatePublished(LocalDate datePublished) { this.datePublished = datePublished; }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price +
                ", author=" + author + ", category=" + category + ", datePublished=" + datePublished + "]";
    }
}
