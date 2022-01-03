package com.syntax.homework;

public class Phone {
	/*
	 * Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with
	 * specific attributes and behaviors.
	 */
	String model;
	String series;
	String color;

	void work() {
		if (model.equals("Iphone")) {
			System.out.println(model + " works very fast");
		} else if (model.equals("Samsung")) {
			System.out.println(model + " works normal");
		} else {
			System.out.println(model + " works slow");
		}
	}

	public static void main(String[] args) {
		Phone i = new Phone();
		i.model = "Iphone";
		i.series = "13PRO";
		i.color = "GOLD";

		System.out.println("Model of phone is " + i.model);
		System.out.println("Series of model is " + i.model + i.series);
		System.out.println("Color of " + i.model + " is " + i.color);
		i.work();

		System.out.println("***************");
		Phone a = new Phone();
		a.model = "Samsung";
		a.series = "A72";
		a.color = "Black";

		System.out.println("Model of phone is " + a.model);
		System.out.println("Series of model is " + a.model + a.series);
		System.out.println("Color of " + a.model + " is " + a.color);
		a.work();

		System.out.println("***************");
		Phone b = new Phone();
		b.model = "Nokia";
		b.series = "G300";
		b.color = "Grey";

		System.out.println("Model of phone is " + b.model);
		System.out.println("Series of model is " + b.model + b.series);
		System.out.println("Color of " + b.model + " is " + b.color);
		b.work();

	}
}