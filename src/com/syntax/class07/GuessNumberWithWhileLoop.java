package com.syntax.class07;

import java.util.Scanner;

public class GuessNumberWithWhileLoop {

	public static void main(String[] args) {
		
		int secretNumber=78;
		Scanner in=new Scanner(System.in);
		int  num;
		System.out.println("Please guess my secret number");
		num=in.nextInt();
		 while(num!=secretNumber) {
			System.out.println("Please guess my secret number. it is a number from 1 to 100");
			
			num=in.nextInt();
			
		}
	 System.out.println("You got it");


	}

}
