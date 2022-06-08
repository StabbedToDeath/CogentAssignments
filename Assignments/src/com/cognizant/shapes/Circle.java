package com.cognizant.shapes;

public class Circle {
	
	/*
	 * Problem Statement 4 changes
	 * made radius private
	 * Constructor 2 is default
	 * Constructor 3 is private
	*/
	
	private float radius;
	float pi = 3.5f;

	public Circle() {
		radius = 1.5f;
	}

	Circle(float radius) {
		
		//Problem Statement 3
		this(radius, 3.5f);
		
		//Problem Statement 2
		//this.radius = radius;
			
	}

	private Circle(float radius, float pi) {
		super();
		this.radius = radius;
		this.pi = pi;
	}
	
	
	public double calculateCircleArea(float radius) {
		return (pi * radius * radius);
	}
	
	public double calculateCircumference(float radius) {
		return 2 * pi * radius;
	}
	
	public static void main(String[] args) {
		
		//Problem Statement 5
		System.out.println(new Circle().calculateCircleArea(3.5f));
		
		System.out.println(new Circle().calculateCircumference(3.25f));
	}
	/*
	 * Hands on Assignment 2
	 * double calculateArea(int radius) {
		return 3.14 * radius * radius;
	}
	 */
	
	
	
	
}
