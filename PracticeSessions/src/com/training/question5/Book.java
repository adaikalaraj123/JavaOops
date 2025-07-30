package com.training.question5;

public class Book {
//	 create 1 constr with title
//	   1 constr with title, price
//	   1 constr with title, author, price
	String title;
	String author;
	double price; 
	
	Book(){
		super();
		System.out.println("default Constructor");
	}
	Book(String title){
		super();
		this.title=title;
	}
	Book(String title, double price){
		this(title);
//		super();
//		this.title=title;
		this.price=price;
	}
	Book(String title, String author, double price ){
		this(title,price);
//		super();
//		this.title=title;
//		this.price=price;
		
		this.author=author;
	}

	void printDetails(){
	   //print the properties. if the value is not there it should not be printed
		if(title!=null)
			System.out.println("title:"+title);
		if(author!=null)
			System.out.println("author:"+author);
		if(price>0)
			System.out.println("price:"+price);
	}

}
