package com.lavkush.SimpleInterest;

import java.math.BigDecimal;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		// defining variable to work with, Scanner class to take input
		BigDecimal principal, rateOfInterest, numOfYears, totValue;
		Scanner scan = new Scanner(System.in);
		
		// taking user input
		System.out.println("Enter the principal amount: ");
		principal = scan.nextBigDecimal();
		System.out.println("Enter the rate of interest (in %): ");
		rateOfInterest = scan.nextBigDecimal();
		System.out.println("Enter the number of years: ");
		numOfYears = scan.nextBigDecimal();
		scan.close();
		
		// creating the class instance passing principal, rateOfInterest
		SimpleInterestCalculator calculator = new SimpleInterestCalculator(principal, rateOfInterest);
		//calling the class method to calculate the total amount passing the numOfYears
		totValue = calculator.calculateTotalValue(numOfYears);
		System.out.println("\nTotal Value you will get at the end of the duration: "+totValue);
		
	}

}
