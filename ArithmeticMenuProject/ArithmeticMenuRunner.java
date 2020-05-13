package com.lavkush.ArithmeticOperations;

import java.util.Scanner;

public class ArithmeticMenuRunner {

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
		
		if(choice == 1) {
			System.out.println("You have selected : Addition");
			System.out.println("The result is: "+obj.getNum1()+" + "+obj.getNum2()+" = "+obj.add() );
		} else if(choice == 2) {
			System.out.println("You have selected : Substraction");
			System.out.println("The result is: "+obj.getNum1()+" - "+obj.getNum2()+" = "+obj.substract() );
		} else if (choice == 3) {
			System.out.println("You have selected : Mutliplication");
			System.out.println("The result is: "+obj.getNum1()+" * "+obj.getNum2()+" = "+obj.multiply() );
		} else if (choice == 4) {
			System.out.println("You have selected : Division");
			System.out.println("The result is: "+obj.getNum1()+" / "+obj.getNum2()+" = "+obj.divide());
		} else
		{
			System.out.println("You have entered the invalid choice, Please try again!");
		}

	}

}
