package com.syntax.class13;

public class StringDemo {

	public static void main(String [] args) {
		
		String name=new String("Sebastian");
		
		String name1="Mykl";
		
		System.out.println(name.length());
		System.out.println(name1.length());
		
	   System.out.println(name1.toLowerCase());
	   System.out.println(name.toUpperCase());
	   
	   String str="This is easy 123456& ^%*";
	   System.out.println(str.toLowerCase());
	   
	   System.out.println(name.concat(name1)); // not recommanded to use always
	}
}

