package com.lavkush.OperationOnNumbers;

import java.util.Scanner;

public class BiNumberRunner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int firstNumber, secondNumber;
		
		System.out.println("Enter the first number: ");
		firstNumber = scan.nextInt();
		System.out.println("Enter the second number: ");
		secondNumber = scan.nextInt();
		scan.close();
		
		BiNumber numbers = new BiNumber(firstNumber, secondNumber);
		
		System.out.println("\nSum of numbers:"+numbers.add());
		System.out.println("Product of numbers:"+numbers.multiply());
		numbers.Double();
		System.out.println("First number after doubling: "+numbers.getNumber1());
		System.out.println("Second number after doubling: "+numbers.getNumber2());
	}

}
