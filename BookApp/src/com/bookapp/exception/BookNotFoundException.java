package com.bookapp.exception;

public class BookNotFoundException extends Exception {

	public BookNotFoundException() {
		super("Book not found!");
		// TODO Auto-generated constructor stub
	}

	public BookNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
