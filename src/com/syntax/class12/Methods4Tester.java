package com.syntax.class12;

public class Methods4Tester {

	public static void main(String[] args) {
		
Methods4 canBeanyName=new Methods4();
//value from method1 will be stored in name variable
String name1=canBeanyName.method1();
System.out.println(name1);
System.out.println(canBeanyName.method2("Roman"));
canBeanyName.methods3();
canBeanyName.methods4("nasir");
canBeanyName.method5("Henok"); // do not print in console 
System.out.println(canBeanyName.method5("Roman"));
	}

}
