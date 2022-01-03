package com.syntax.class15;

public class StudentsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students SyntaxSchool =new Students();
		SyntaxSchool.studentName="Sandugash";
		SyntaxSchool.studentID=32;
		Students.numberofstudents++;
		
		
		Students JavaSchool =new Students();
		JavaSchool.studentName="Evelin";
		JavaSchool.studentID=32;
		Students.numberofstudents++;
		
		Students Course=new Students();
		Course.studentName="Baur";
		Course.studentID=31;
		Students.numberofstudents++;
		System.out.println(Students.numberofstudents);
	}

}
