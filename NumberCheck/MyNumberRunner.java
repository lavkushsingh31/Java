package com.lavkush.NumberCheck;

import java.util.Scanner;

public class MyNumberRunner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nEnter the number to display info about it: ");
		int n = scan.nextInt();
		scan.close();
		
		MyNumber number = new MyNumber(n);
		
		System.out.println("\nIs the number prime: "+number.isPrime()); 
		System.out.println("Sum upto the number entered: "+number.sumUptoN()); 
		System.out.println("Sum of divisors of number entered (excluding 1 and the number itself): "+number.sumOfDivisors()); 
		
		System.out.println("The number triangle: \n");
		number.printNumberTriangle();
		

	}

}
