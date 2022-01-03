package com.syntax.class14;

public class StringBuldier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder stringBuilder= new StringBuilder();
        for(int i=0;i<5;i++) {
        	stringBuilder.append(i);
        }

        System.out.println(stringBuilder);
        
        String str4="Me: Look it's not you it's me, walking away)";
        
        StringBuilder strBuilder=new StringBuilder(str4);
        strBuilder.reverse();
        System.out.println(strBuilder);
        str4=strBuilder.toString();
        

	}

}
