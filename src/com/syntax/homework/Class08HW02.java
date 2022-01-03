package com.syntax.homework;

import java.util.Scanner;

public class Class08HW02 {

	public static void main(String[] args) {
		/*
		  * 2. Create a program that will keep asking user to apply for a credit card. 
		  * As soon you get “yes” from a user program should stop asking.
		  */
		
		Scanner scan=new Scanner(System.in);
	 boolean answer=true;
	 String str=null;
		
		while(answer) {
			System.out.println("Will you apply for a credit card?");
			str=scan.next();
			if(str.equalsIgnoreCase("yes")) {
			
				break;
			}
		}

	}}


