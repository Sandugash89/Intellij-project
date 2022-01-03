package com.syntax.class14;

public class EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject="I love Java and I want to learn more";
		//Using space “ ” as a delimiter 
		//Split returns an array of Strings
		String [] splittedSub = subject.split(" ");
		System.out.println(splittedSub.length);
		
		//Looping through the array to get all the values
		for (int i = 0; i< splittedSub.length; i++) {
		System.out.println(splittedSub[i]);
		}
		
		
		String mix="3213Hello 89 World354545 *&***^&*^&*";
		System.out.println(mix.replaceAll("[0-9]", ""));
		System.out.println(mix.replaceAll("[a-z]", ""));
		System.out.println(mix.replaceAll("[a-z A-Z]", ""));
		System.out.println(mix.replaceAll("[^A-Za-z0-9]", ""));
	}

}
