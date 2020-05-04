package com.javalearning.lavkush;

import java.util.Scanner;

public class SumReturnThreeNumbers {

	public static void main(String[] args) {
		
		int firstNumber, secondNumber, thirdNumber, sum;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the numbers in order: ");
		firstNumber = scan.nextInt();
		secondNumber = scan.nextInt();
 		thirdNumber = scan.nextInt();
 		scan.close();
 		sum = sum(firstNumber, secondNumber, thirdNumber);
 		
 		System.out.printf("Their sum is: %d ",sum);
 		

	}

	static int sum (int a, int b, int c) {
		int computedSum = a+b+c;
		return computedSum;
	}
}
