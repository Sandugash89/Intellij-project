package com.syntax.class12;

public class MethodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Line before method call");
		Methods methods=new Methods();
		methods.times=3;
	
		methods.sayHello();
		methods.sayHelloManyTimes();
		System.out.println("Line after method call");
		methods.sayHelloManyTimesWithState();
		System.out.println("Line after method call");
		methods.sayHelloTimesWithParameter(6);
		System.out.println("Line after method call");

	}

}