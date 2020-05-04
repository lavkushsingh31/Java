package com.javalearning.lavkush;

import java.util.Scanner;

public class SquareOfNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number upto which you wish to print squares: ");
		int input = scan.nextInt();
		
		printSquareOfNumbers(input);
		
		scan.close();

	}
	
	static void printSquareOfNumbers(int x)
	{
		for(int i=1;i<=x;i++)
		{
			System.out.printf("Square of %d: %d", i, i*i).println();
		}
	}
}
