package com.syntax.class04;

public class NestedIfMoreExapmles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean replCompleted = false;
		int assigment = 10;
		if (replCompleted) {
			if (assigment > 16) {
				System.out.println("You did an amazing work");
			} else if (assigment > 10) {
				System.out.println("You did good, but you should do more");
			} else if (assigment > 6) {
				System.out.println("You need to try do more hw");
			} else {
				System.out.println("why?");

			}
		} else {
			System.out.println("Please make sure you do your homework");
		}
	}
}
