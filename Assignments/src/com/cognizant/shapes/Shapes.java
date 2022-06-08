package com.cognizant.shapes;

public class Shapes {
	
	int numberofSides;
	
	void calculateShapeArea(int numberofSides, int length) {
		
		this.numberofSides = numberofSides;
		
		if (numberofSides == 1) {
			// To run the next line, uncomment the multiline comment in Circle.java and the below line
			//System.out.println("The Area of the Circle is " + new Circle().calculateArea(length) + ".");
		} else if (numberofSides == 3) {
			System.out.println("The Area of the Triangle is " + new Triangle().calculateArea(length) + ".");
		} else if (numberofSides == 4) {
			System.out.println("The Area of the Square is " + new Square().calculateArea(length) + ".");
		} else {
			System.out.println("No Shapes Present.");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		//Test Case 1
		new Shapes().calculateShapeArea(3,  12);
		
		//Test Case 2
		new Shapes().calculateShapeArea(4,  15);
		
		//Test Case 3
		new Shapes().calculateShapeArea(5,  15);
	}
	
}	
