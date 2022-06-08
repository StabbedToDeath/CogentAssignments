package com.cogent.week1;

public class SimpleInterestCalculator {
	
	double principalAmount;
	int numberOfYears;
	double interest;
	
	void calculateSimpleInterest() {
		
		if (principalAmount > 100000) {
			if (numberOfYears > 10) {
				interest = principalAmount * numberOfYears * 0.1;
			} else {
				interest = principalAmount * numberOfYears * 0.095;
			}
		} else {
			if (numberOfYears > 10) {
				interest = principalAmount * numberOfYears * 0.05;
			} else {
				interest = principalAmount * numberOfYears * 0.045;
			}
		}
		
		System.out.println("The interest amount for a principal of " + this.principalAmount + " and years " +
							this.numberOfYears + " is " + this.interest + ".");
	}
	
	
	
	public static void main(String[] args) {
		
		SimpleInterestCalculator obj1 = new SimpleInterestCalculator();
		obj1.principalAmount = 200000;
		obj1.numberOfYears = 12;
		obj1.calculateSimpleInterest();
		
		SimpleInterestCalculator obj2 = new SimpleInterestCalculator();
		obj2.principalAmount = 50000;
		obj2.numberOfYears = 12;
		obj2.calculateSimpleInterest();
		
		SimpleInterestCalculator obj3 = new SimpleInterestCalculator();
		obj3.principalAmount = 50000;
		obj3.numberOfYears = 5;
		obj3.calculateSimpleInterest();
		
		
	}
	
	
}
