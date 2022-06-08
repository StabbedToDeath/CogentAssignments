package com.cognizant.shapes;

public class Shapes02 {
	
	int numberofSides;
	
	void calculateShapeArea(int numberofSides, int length) {
		
		this.numberofSides = numberofSides;
		
		switch(this.numberofSides) {
		case 1:
			// To run the next line, uncomment the multiline comment in Circle.java and the below line
			//System.out.println("The Area of the Circle is " + new Circle().calculateArea(length) + ".");
			break;
		case 3:
			System.out.println("The Area of the Triangle is " + new Triangle().calculateArea(length) + ".");
			break;
		case 4:
			System.out.println("The Area of the Square is " + new Square().calculateArea(length) + ".");
			break;
		default:
			System.out.println("No Shapes Present.");
			break;
		}
	}

	public static void main(String[] args) {
		
		//Test Case 1
		new Shapes02().calculateShapeArea(3,  12);
		
		//Test Case 2
		new Shapes02().calculateShapeArea(4,  15);
		
		//Test Case 3
		new Shapes02().calculateShapeArea(5,  15);
	}
	
}	
