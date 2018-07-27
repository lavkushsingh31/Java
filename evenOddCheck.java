/*
 * Program to check if the given number is even or odd
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Luvkush
 */
public class evenOddCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        if(num%2 == 0)
            System.out.println("\nIt is divided by two, and is an even number!\n ");
        else
        {
            System.out.println("\nThis number is not divided by two, and is an odd number!\n ");
        }
    }
}
