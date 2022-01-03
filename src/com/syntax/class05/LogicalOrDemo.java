package com.syntax.class05;



import java.util.Scanner;

public class LogicalOrDemo {

	public static void main(String[] args) {
		/*
		 * /* * ask user to enter today's day if monday or friday --> no class if
		 * tuesday or * wednesday --> manual class if saturday or sunday --> java class
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Which day is it today?");
		String day = scan.next();
		if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")) {
        System.out.println("Today no class");
		} else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")) {
			System.out.println("Today is the manual class");
		} else if (day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")) {
			System.out.println("Today is the java class");
		}
	}

}
