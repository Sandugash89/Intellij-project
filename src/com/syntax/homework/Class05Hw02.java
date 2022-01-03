package com.syntax.homework;

import java.util.Scanner;

public class Class05Hw02 {

	public static void main(String[] args) {
		/*
		 * 2. Write a program 
		 * that will read three inputs of scores (quiz, mid term, and final scores) 
		 * and determine the grade based on the following rules: 
if the average score >=90 grade=A
if the average score >= 70 and <90  grade=B
if the average score>=50 and <70  grade=C
if the average score<50  grade=F

		 */
Scanner input=new Scanner (System.in);
System.out.println("Please, enter your quiz score");
int quiz=input.nextInt();

System.out.println("Please, enter your mid term score");
int midterm=input.nextInt();

System.out.println("Please, enter your final score");
int finalscore=input.nextInt();
int score=(quiz+midterm+finalscore)/3;


String grade=null;

if(score>=90) {
	grade="A";
}
if(score>=70 && score<90) {
	grade="B";
}
if(score>=50 && score<70) {
	grade="C";
}
if(score<50) {
	grade="F";
}
System.out.println("Your grade is " +grade);
	} 
	

}
