package com.bookapp.main;

import java.util.List;
import java.util.Scanner;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;
import com.bookapp.exception.BookNotFoundException;

public class Client {
    public static void main(String[] args) {
        IBookService bookService = new BookServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== BookApp Menu =====");
            System.out.println("1. Get All Books");
            System.out.println("2. Get Books by Author");
            System.out.println("3. Get Books by Category");
            System.out.println("4. Get Books by Price less than");
            System.out.println("5. Get Books by Year");
            System.out.println("6. Get Books by Author and Category");
            System.out.println("7. Get Book by ID");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        List<Book> allBooks = bookService.getAll();
                        allBooks.forEach(System.out::println);
                        break;
                    case 2:
                        System.out.print("Enter author: ");
                        String author = sc.nextLine();
                        bookService.getByAuthorContains(author).forEach(System.out::println);
                        break;
                    case 3:
                        System.out.print("Enter category: ");
                        String category = sc.nextLine();
                        bookService.getByCategory(category).forEach(System.out::println);
                        break;
                    case 4:
                        System.out.print("Enter max price: ");
                        double price = sc.nextDouble();
                        bookService.getByPriceLessThan(price).forEach(System.out::println);
                        break;
                    case 5:
                        System.out.print("Enter year: ");
                        int year = sc.nextInt();
                        bookService.getByDatePublished(year).forEach(System.out::println);
                        break;
                    case 6:
                        System.out.print("Enter author: ");
                        String auth = sc.nextLine();
                        System.out.print("Enter category: ");
                        String cat = sc.nextLine();
                        bookService.getByAuthorContainsAndCategory(auth, cat).forEach(System.out::println);
                        break;
                    case 7:
                        System.out.print("Enter book ID: ");
                        int id = sc.nextInt();
                        System.out.println(bookService.getById(id));
                        break;
                    case 8:
                        System.out.println("Exiting... Goodbye!");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (BookNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
