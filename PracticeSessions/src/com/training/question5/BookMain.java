package com.training.question5;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book0 = new Book();
		Book book1 = new Book("Book1");
		Book book2 = new Book("Book2",43);
		Book book3 = new Book("Book3","se",3465);
		book1.printDetails();
		book2.printDetails();
		book3.printDetails();
	}

}
