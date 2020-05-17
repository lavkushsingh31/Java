package com.lavkush.CubeOfInput;

import java.util.Scanner;

public class CubeOfInputRunner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input=-1;
		
		do {
			if(input != -1) {
				System.out.println("Cube: "+calculateCube(input));
			}
			System.out.println("Enter the number: ");
			input = scan.nextInt();
			
		} while (input >= 0);
		System.out.println("Thank you!");
		scan.close();
	}

	public static int calculateCube(int input) {
		return input * input * input;
	}

}
