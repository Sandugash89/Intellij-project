package com.syntax.homework;

import java.util.Scanner;

public class Class04Hw02 {

	public static void main(String[] args) {
		/**
		 * You are a loan specialist 
		 * and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 
		 * then you would lend the money 
		 * otherwise you would reject the client.
		 */
Scanner in=new Scanner(System.in);

System.out.println("What is a amount of loan is needed");

double amount=in.nextDouble();

 if(amount<=200.000) {
	 
	 System.out.println("I will lend the money");
 } else {
	 
	 System.out.println("You will reject the client");
 }

	}

}
