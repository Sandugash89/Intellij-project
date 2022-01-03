package com.syntax.homework;

import java.util.Scanner;

public class Class04Hw03 {

	public static void main(String[] args) {
		//You are DMV representative and you need to ask customer their age.
		//If they are 18 and older you will issue a driver license to them, 
		//otherwise you will offer them to get a learners permit.
Scanner scan=new Scanner(System.in);
System.out.println("How old are you, sir?");
int num=scan.nextInt();
if(num>17) {
System.out.println("You will issue a driver license");
} else {
	System.out.println("You will get a leaners permit");
}
}
	

}
