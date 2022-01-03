package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		/*
		 * Lets create secret number (1 to 100)
		 * 
		 * lets ask user to gues my secret number
		 * 
		 * keep asking for a number till user guess the secret number
		 */
		int secretNumber=78;
		Scanner in=new Scanner(System.in);
		int  num;
		do {
			System.out.println("Please guess my secret number. it is a number from 1 to 100");
			
			num=in.nextInt();
			
		} while(num!=secretNumber);
	 System.out.println("You got it");

}}
