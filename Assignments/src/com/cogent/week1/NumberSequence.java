package com.cogent.week1;

public class NumberSequence {
	
	public static void main(String[] args) {
		
		//Problem Statement 1
		for (int i = 1; i < 200; i+=2) {System.out.print(i + ",");}
		
		System.out.println();
		
		System.out.println();
		
		//Problem Statement 2
		int max = 6;
		//upper triangle
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		//lower triangle
		for (int i = max - 1; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Problem Statement 1 Activity 5
		int num = 1;
		
		while(num!= 150) {
			
			int factors = 0;
			int count = 1;
			while (count <= num) {
				
				if (num%count == 0)
					factors++;
				
				count++;
			}
			
			if (factors == 2)
				System.out.print(num + ",");
			
			num++;
		}
		System.out.println();
		
		
		
		
		
		
	}
	
}
