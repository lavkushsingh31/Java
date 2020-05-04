package com.javalearning.lavkush;

import java.util.Scanner;

public class printNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number upto which you want to print numbers: ");
		int n = scan.nextInt();
		printNumberrs(n);
		scan.close();
	}
	
	static void printNumberrs(int x) {
		
		for(int i=1; i<=x; i++)
			System.out.println(i);
	}

}
