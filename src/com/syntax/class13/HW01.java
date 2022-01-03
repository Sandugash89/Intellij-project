package com.syntax.class13;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that reads two people's first
	names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your Mom's first name?");
		String mom=scan.next();
		System.out.println("What is your Dad's first name?");
		String dad=scan.next();
		System.out.println("Expecting boy or girl?");
		String gender=scan.next();
		String name=null;
		
		if(gender.equalsIgnoreCase("boy")) {
			name=dad.toUpperCase().substring(0, 3)+mom.toUpperCase().substring(2);
			} else if (gender.equalsIgnoreCase("girl")) {
				name=mom.toUpperCase().substring(0, 2)+dad.toUpperCase().substring(3);
			}
		System.out.println(name);
	}

}
