package com.lavkush.IfElseSwitchCases;

import java.util.Scanner;

public class ArithmeticMenuSwitchRunner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int choice; float number1, number2;
		
		System.out.print("Enter the first number: ");
		number1 = scan.nextInt();
		System.out.print("Enter the second number: ");
		number2 = scan.nextInt();
		
		ArithmeticMenu obj = new ArithmeticMenu(number1, number2);
		
		System.out.println("\n *****  Arithmetic Menu  *****  ");
		System.out.print("\n\n1. Add \n2. Substract \n3. Multiply \n4. Divide\n\nEnter your choice:  ");
		choice = scan.nextInt();
		
		scan.close();
		
		switch(choice) {
			case 1:
				System.out.println("\n\nYour choice : "+choice);
				System.out.println("Your first number : "+obj.getNum1());
				System.out.println("Your second number : "+obj.getNum2());
				System.out.println("The result is: "+obj.add() );
				break;
			case 2:
				System.out.println("\n\nYour choice : "+choice);
				System.out.println("Your first number : "+obj.getNum1());
				System.out.println("Your second number : "+obj.getNum2());
				System.out.println("The result is: "+obj.substract());
				break;
			case 3:
				System.out.println("\n\nYour choice : "+choice);
				System.out.println("Your first number : "+obj.getNum1());
				System.out.println("Your second number : "+obj.getNum2());
				System.out.println("The result is: "+obj.multiply() );
				break;
			case 4:
				System.out.println("\n\nYour choice: "+choice);
				System.out.println("Your first number : "+obj.getNum1());
				System.out.println("Your second number : "+obj.getNum2());
				System.out.println("The result is: "+obj.divide());
				break;
			default:
				System.out.println("You have entered the invalid choice, Please try again!");
			
		}
		
	}

}
