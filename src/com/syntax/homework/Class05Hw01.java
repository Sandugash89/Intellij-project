package com.syntax.homework;

import java.util.Scanner;

public class Class05Hw01 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in June, July or August  season
		 * =“Summer”.
		 * 
		 * At the end of the program we should see output as “You were born is season
		 * ______“.
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter you birth month?");
		String month = scan.next();
		String season = null;
		if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("December")) {
season="winter";
		}
		if(month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")) {
			season="spring";
		}
		if(month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")) {
			season="summer";
		
		}
		if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")) {
			season="fall";
		}
		System.out.println("You were born in season "+season);
	}

}
