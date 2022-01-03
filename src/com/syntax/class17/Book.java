package com.syntax.class17;

public class Book {
	/*
	 * Write Book class that will have instance variables and 2 Constructors.
	 *  While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
	 */
String name;
String author;

protected Book(){
	System.out.print("My favotire book is a ");
}
private Book(int year){
	System.out.print("The book was printed in "+year+ " by author ");
}

public static void main(String[]args) {
	Book book =new Book();
	book.name="Mother and daugther";
	System.out.println(book.name);
	  new Book(2000);
	book.author="Sandugash";
	System.out.println(book.author);
}
}
