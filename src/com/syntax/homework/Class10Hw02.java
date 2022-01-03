package com.syntax.homework;



public class Class10Hw02 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array in which first array will consist of 4 names 
		 * and second array will contain grades. 
		 * Then your program should print name of the students that has A and B grade

		 */
 String[][]student= {
		 {"Sandugash", "Bauyrzhan", "Evelin", "Adele"},
		 {"grade A", "grade B"}
		 
 };
 System.out.println(student[0][0]+ " has "+student[1][0]);
 System.out.println(student[0][1]+ " has "+student[1][1]);
 System.out.println(student[0][2]+ " has "+student[1][0]);
 System.out.println(student[0][3]+ " has "+student[1][1]);
	}

}
