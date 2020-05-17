package com.lavkush.PrintUntilLimit;

import java.util.Scanner;

public class UntilLimitRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter the limit number: ");
		int n = scan.nextInt();
		scan.close();
		
		UntilLimit number = new UntilLimit(n);
		
		System.out.print("\nSquares until the limit entered: ");
		number.printSquareUptoLimit();
		System.out.print("\nCubes until the limit entered: ");
		number.printCubeUptoLimit();

	}

}
