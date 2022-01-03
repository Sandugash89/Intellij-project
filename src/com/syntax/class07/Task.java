package com.syntax.class07;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// I want to ask a user name and age 5 times
		
		Scanner in=new Scanner(System.in);
		int i=5;
		while (i>=1) {
		System.out.println("enter  your name and age?");
		String name=in.next();
		int age=in.nextInt();
		
	
		System.out.println("You name is "+name+" and you are "+age+" years old");
		i--;
	}
		}

}
