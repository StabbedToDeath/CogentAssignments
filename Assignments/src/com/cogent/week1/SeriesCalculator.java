package com.cogent.week1;

public class SeriesCalculator {
	
	int calculateSum(int n) {
		
		return ((n/2) * (2 + ((n - 1) * 2)));
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(new SeriesCalculator().calculateSum(3));
		System.out.println(new NumberManipulator().reverseNumber(145));
		System.out.println(new NumberManipulator().calculateSum(245));
		System.out.println(new PrimeChecker().checkPrime(13));
		System.out.println(new PrimeChecker().checkPrime(14));
	}
}

class NumberManipulator {
	
	int reverseNumber(int num) {
		return ((num % 10 * 100)) + (((num / 10) % 10) * 10) + ((num / 10) / 10);
	}
	
	int calculateSum(int num) {
		return ((num % 10) + ((num / 10) % 10) + ((num / 10) / 10));
	}
}

class PrimeChecker {
	
	boolean checkPrime(int num) {
		int factors = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num%i == 0)
				factors++;
		}
		
		if (factors == 2) {
			return true;
		}
		
		return false;
	}
	
}
