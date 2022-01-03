package com.syntax.class14;

public class Hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How would you reverse a String word by word?
		
		String str = "This is sentence i want to reverse";
		String[] strArr = str.split(" ");

		for (String word : strArr) {
			StringBuilder stringBuilder = new StringBuilder(word);
			System.out.print(stringBuilder.reverse() + " ");
		}
		

	}

}
