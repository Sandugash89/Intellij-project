package com.syntax.homework;

import java.util.Scanner;

public class Class04Hw05 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. If you
		 * user does not have a credit card then offer them. If they do have one ask
		 * what is balance on the card? If balance of the card is larger than 1000, tell
		 * them to pay off immediately, otherwise you can tell them that they can spend
		 * more.
		 */
		Scanner card = new Scanner(System.in);
		
		System.out.println("Do you have a credit card or not?");
		
		String str= card.next();
		
		if (str.equalsIgnoreCase("yes")){
		
		System.out.println("What is balance on the credit Card?");
	
		double balance = card.nextDouble();
		
		
		if(balance>1000) {
			System.out.println("You have to pay off immediately");
		}else {
			System.out.println("You can spend more");
		}
	
		
		} else {
			System.out.println("I am offering you to open the credit card");
			}
		}
	} 


