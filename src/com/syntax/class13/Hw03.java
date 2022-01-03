package com.syntax.class13;

public class Hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a String and print it in reverse order (Sunday yadnuS).
String str="Sunday";

for (int i=str.length()-1; i>=0; i--)
	System.out.print(str.charAt(i)+" ");



System.out.println("---------------------");
String newstr="";
String str1="Sunday";
for (int i=str1.length()-1; i>=0; i--) {
	newstr+=str.charAt(i);
	}
System.out.println(newstr);

}
	
	}

