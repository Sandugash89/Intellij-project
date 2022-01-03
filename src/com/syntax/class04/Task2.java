package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* * Create a Java program and store values of mortgage rate and mortgageprice. 
		 * * First, program should check if rate is higher than 4.5 user will notbuy a 
		 * \* house, otherwise user will consider buying. Once user decides to buya house, 
		 * * if price of the house is larger than 200000 than user will take a loan, 
		 * * otherwise user will pay cash. 
		 * *  
		 * */
		double rate=4.0;
		int price=10000000;
		if (rate>4.5) {
			System.out.println("I dont buy a house");
		} else {
			System.out.println("I consider to buy a house");
		} if(price>200000) {
			System.out.println("I will tae a loan");
			
			} else {
				System.out.println("I am going to buy a house");
				}
		}
	}


