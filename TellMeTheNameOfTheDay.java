package com.lavkush.CharacterIdentify;

import java.util.Scanner;

public class TellMeTheNameOfTheDay {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			short input;

			System.out.print("Enter the corresponding number (0-Sunday to 6-Saturday): ");
			input = scan.nextShort();

			scan.close();

			System.out.println("\n"+whatDayIsIt(input));

		}

		public static String whatDayIsIt(short input) {
			
			switch(input)
			{
				case 0:
					return "Sunday";
				case 1:
					return "Monday";
				case 2:
					return "Tuesday";
				case 3:
					return "Wednesday";
				case 4:
					return "Thursday";
				case 5:
					return "Friday";
				case 6:
					return "Saturday";
				default:
					return "Invalid Input! Try again!";
			}
		}

	}