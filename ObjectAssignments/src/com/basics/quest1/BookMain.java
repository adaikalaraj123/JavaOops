package com.basics.quest1;

public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book("Java","James Gosling",600,"Programing");
//		Book book2 = new Book("PHP","Rasmus Lerdorf",400,"Programing");
//		Book book3 = new Book("Ramayanam","Swami",400,"History");
		book1.getDetails();
		book1.checkBookType();
	}

}
