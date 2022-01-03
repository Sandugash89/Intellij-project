package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter any sentence");
		
		String entireline = in.nextLine();
		
		System.out.println(entireline);
		
		System.out.println("Please enter you phone number");
		
		long phone = in.nextLong();
		
		System.out.println("My phone number is " + phone);
		

	}

}
