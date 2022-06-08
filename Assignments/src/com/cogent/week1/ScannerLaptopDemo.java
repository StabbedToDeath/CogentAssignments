package com.cogent.week1;

import java.util.Scanner;

public class ScannerLaptopDemo {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int option, a, b;
		do {
			System.out.println("Enter Option:\n"
					+ "1 - Add\n"
					+ "2 - SUbtract\n"
					+ "3 - Multiply\n"
					+ "4 - Quit");
			
			System.out.println();
			option = read.nextInt();
						
			switch(option) {
			case 1:
				System.out.println("Enter two numbers to be added");
				a = read.nextInt();
				b = read.nextInt();
				System.out.println("The result is " + (a + b) + "\n");
				break;
			case 2:
				System.out.println("Enter two numbers to be subtracted");
				a = read.nextInt();
				b = read.nextInt();
				System.out.println("The result is " + (a - b) + "\n");
				break;
			case 3:
				System.out.println("Enter two numbers to be multiplied");
				a = read.nextInt();
				b = read.nextInt();
				System.out.println("The result is " + (a * b) + "\n");
				break;
			}
						
		} while (option != 4);
		
		read.close();
	}

}
