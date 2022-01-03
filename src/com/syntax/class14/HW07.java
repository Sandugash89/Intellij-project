package com.syntax.class14;

public class HW07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// How would you swap  2 strings without a temporary variable?
		String a = "Sandugash";
		String b ="Evelin";
		a=a + b;
		b=a.replace(b, "");
		a=a.replace(b, "");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("---------------------");
		String str = "Hormat";
		String str2 = "Sorbon";
		str = str + str2;
		str2 = str.replace(str2, "");
		str = str.replace(str2, "");
		System.out.println(str);
		System.out.println(str2);
		
		 
		
		

	}

}
