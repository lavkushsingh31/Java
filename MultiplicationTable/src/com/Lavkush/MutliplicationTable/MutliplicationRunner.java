package com.Lavkush.MutliplicationTable;

import java.util.Scanner;

public class MutliplicationRunner {

	public static void main(String[] args) {
		
		//Scanner class to take input
		Scanner scan = new Scanner(System.in);
		
		//MutliplicationTable object to run its methods
		MutliplicationTable tableObj = new MutliplicationTable();
		
		//Defining variables which will be required
		int input, upperlimit, lowerlimit;
		char choice;
		
		System.out.print("Enter the number of which table you wish to print (0 for default/demo): ");
		input = scan.nextInt();
		
		if(input ==0)
		{
			System.out.println("Printing the default table of '2' as demo: ");
			tableObj.printTable();
		}
		else
		{
			System.out.println("Do you wish to enter customized table from and to speciffied numbers? (y/n): ");
			choice = scan.next().charAt(0);
			
			switch(choice) {
				case 'y':
					System.out.println("Enter the upper limit: ");
					upperlimit = scan.nextInt();
					System.out.println("Enter the lower limit: ");
					lowerlimit = scan.nextInt();
					System.out.println("Below is the required table: ");
					tableObj.printTable(input, upperlimit, lowerlimit);
					break;
				case 'n':
					System.out.println("Below is the required table: ");
					tableObj.printTable(input);
					break;
				default:
					System.out.println("Invalid choice, printing the table of the entered input: ");
					tableObj.printTable(input);
			}			
				
		}
		scan.close();
	}

}
