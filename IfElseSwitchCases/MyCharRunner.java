package com.lavkush.CharacterIdentify;

import java.util.Scanner;

public class MyCharRunner {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the charater you wish to check: ");
		char ch = scan.next().charAt(0);
		scan.close();
		
		MyChar mychar = new MyChar(ch);
		
		System.out.print("\nYou have entered: "+ch);
		System.out.println("\n\nIs this vowel: "+mychar.isVowel());
		System.out.println("Is this consonent: "+mychar.isConsonent());
		System.out.println("Is this Digit: "+mychar.isDigit());
		System.out.println("Is this Alphabet: "+mychar.isAlhpabet());
		
		System.out.println("\n\nPrinting Upper case letters \n");
		MyChar.printUpperCaseAlphabets();
		
		System.out.println("\n\n\nPrinting Lower case letters \n");
		MyChar.printLowerCaseAlphabets();
		
	}

}
