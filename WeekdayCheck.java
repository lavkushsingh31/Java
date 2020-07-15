package com.lavkush.CharacterIdentify;

import java.util.Scanner;

public class WeekdayCheck {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		short input;
		
		System.out.println("Enter the corresponding number (0-Sunday to 6-Saturday): ");
		input = scan.nextShort();
		
		scan.close();
		
		if(input>=0 && input<=6) {
			if(isWeekday(input)) {
				System.out.println("\nCorresponding day is a Weekend, Enjoy!");
			} else {
				System.out.println("\nCorresponding day is a Weekday, Happy working!");
			}
		} else {
			System.out.println("Entered input is invalid! Try again.");
		}

	}
	
	public static boolean isWeekday(short input) {
		if(input == 0 || input == 6) {
			return true;
		} else {
			return false;
		}
	}

}
