package com.syntax.class02;

public class ModOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number1=13;
		double number2=5;
		System.out.println(number1%number2); 
		/*
		 * % is the surplus, that is, you cannot divide 13/5, but you can divide 10/5 and the surplus 3
         * total will be 3
		 */
		
		System.out.println(3%5);
		/*
		 *  if i am taking mod of smaller number with a bigger number 
		 *  I will always get small number as answer
		 */
		System.out.println(number1/number2); //13/5=2.6
		System.out.println(number1%number2); //3
		System.out.println(9%2); //9-8=1, you can not divide 9/2, but you can divide 8/2 so surplus is 1
		

		}

}
