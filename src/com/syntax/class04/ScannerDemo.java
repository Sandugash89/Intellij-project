package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
			System.out.println("Please enter you name");

			String name = scan.next();

			// it will capture String value from console
			System.out.println("Hello " + name);

			System.out.println("Please enter your age");

			int age = scan.nextInt(); // 1 integer value

			System.out.println(name + " you are " + age + " years old");

			System.out.println("Please enter you job");

			String job = scan.next();

			System.out.println("You are a " + job);
		

	}

}
