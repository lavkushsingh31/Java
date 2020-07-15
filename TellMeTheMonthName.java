package com.lavkush.CharacterIdentify;

import java.util.Scanner;

public class TellMeTheMonthName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		short input;

		System.out.print("Enter the corresponding number (1-January to 12-December): ");
		input = scan.nextShort();

		scan.close();

		System.out.println("\n"+whatMonthIsIT(input));

	}

	public static String whatMonthIsIT(short input) {
		
		switch(input)
		{
			case 1:
				return "January";
			case 2:
				return "February";
			case 3:
				return "March";
			case 4:
				return "April";
			case 5:
				return "May";
			case 6:
				return "June";
			case 7:
				return "July";
			case 8:
				return "August";
			case 9:
				return "September";
			case 10:
				return "October";
			case 11:
				return "November";
			case 12:
				return "December";
			default:
				return "Invalid Input! Try again!";
		}
	}

}
