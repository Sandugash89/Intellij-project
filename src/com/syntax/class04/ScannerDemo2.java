package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an item you want to buy");
		String item = input.next();
		System.out.println("Please enter the price of the " + item);
		double price=input.nextDouble(); //1 double value
		System.out.println("You selected "+item+" with price ="+price );
	}

}
