package com.syntax.homework;

public class Dog {
	//Create a Dog Class and create 3 different objects of it: 
	//Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	String name;
	String breed;
	String color;
	double height;
	int    age;
	char   gender;
	
	void beahavior() {
		if(breed.equalsIgnoreCase("Husky")) {
			System.out.println(breed+ " loves running");
		} else if(breed.equalsIgnoreCase("Labrador")) {
			System.out.println(breed+ " high-spirited companions");
		} else {
			System.out.println(breed+ " watchdog");
		}
	}
	
	public static void main(String[]args) {
		Dog h=new Dog();
		h.name="Iyorik";
		h.breed="Husky";
		h.color="grey";
		h.height=20.21;
		h.age=2;
		h.gender='F';
		System.out.println("Name of dog is "+h.name);
		System.out.println("Breed of dog is "+h.breed);
		System.out.println("Color of dog is "+h.color);
		System.out.println("Height of dog is "+h.height);
		System.out.println("Age of dog is "+h.age);
		System.out.println("Gender of dog is "+h.gender);
		h.beahavior();
		
		System.out.println("***************");
		
		Dog l=new Dog();
		l.name="DUKE";
		l.breed="LABRADOR";
		l.color="BLACK";
		l.height=35;
		l.age=2;
		l.gender='M';
		System.out.println("Name of dog is "+l.name);
		System.out.println("Breed of dog is "+l.breed);
		System.out.println("Color of dog is "+l.color);
		System.out.println("Height of dog is "+l.height);
		System.out.println("Age of dog is "+l.age);
		System.out.println("Gender of dog is "+l.gender);
		l.beahavior();
		
		System.out.println("***************");
		
		Dog b=new Dog();
		b.name="Molly";
		b.breed="buldog";
		b.color="brown";
		b.height=15;
		b.age=1;
		b.gender='F';
		System.out.println("Name of dog is "+b.name);
		System.out.println("Breed of dog is "+b.breed);
		System.out.println("Color of dog is "+b.color);
		System.out.println("Height of dog is "+b.height);
		System.out.println("Age of dog is "+b.age);
		System.out.println("Gender of dog is "+b.gender);
		b.beahavior();
	}

}
