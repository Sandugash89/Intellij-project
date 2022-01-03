package com.syntax.homework;

public class Class09Hw03 {

	public static void main(String[] args) {
		/*
		 * Create an array to store double values and then print those in reverse order
		 */
 double []num =new double[3];
 num[0]=11.90;
 num[1]=12.91;
 num[2]=13.92;
  
  System.out.println(num[2]+ ";"+ num[1]+ " ;"+ num[0]);
  
 System.out.println("--------------------------------");
 
 double []n =new double[3];
 n[0]=11.90;
 n[1]=12.91;
 n[2]=13.92;
 
for(int i=n.length-1; i>=0; i--) {
System.out.print(n[i]+ " ");
}
  }
	}


