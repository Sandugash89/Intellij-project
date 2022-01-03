package com.syntax.class17;

public class Student {
	/*
	 * Write a Student class that have instance variables name and address. 
	 * Create a constructor that will initialize those variables. 
	 * Print name & address of given  student using displayInfo method.
	 */
	
	String name;
	String address;
	
	public Student() {
		System.out.println();
	}
	public Student(String name) {
		this();
		this.name=name;
	}
	public Student(String name, String address) {
		this(name);
		this.address=address;
	}
	void printAllInfo() {
		System.out.println("name is "+name+" address is "+ address);
	}
	

	

}
