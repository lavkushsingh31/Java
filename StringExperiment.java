package com.javalearning.lavkush;

import java.util.Scanner;

public class StringExperiment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputStr;
		
		System.out.println("Enter the string to print each letter in next line: ");
		inputStr = scan.nextLine();
		
		for(int i=0; i<inputStr.length(); i++) {
			System.out.println(inputStr.charAt(i));
		}
		
		scan.close();
	}

}
