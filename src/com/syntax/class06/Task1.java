package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 *   At the end your program should print which grade was entered 
		 *   by a user with explanation.
		 */
	Scanner scan=new Scanner(System.in);
	
	System.out.println("What is your grade?");
	String grade=scan.next();
	String expl;
	switch (grade) {
	case "A":
		expl="Excellent";
		break;
	case "B":
		expl="Good";
		break;
		
	case "C":
		expl="Avarage";
		break;
	case "D":
		expl="Bad";
		break;
		default:
			expl="Not Acceptable";
		}
	if (!expl.equals("Not Acceptable")) {
			System.out.println("You grade is "+ expl);
	} else
		System.out.println("Please enter correct grade");
	
	}

}
