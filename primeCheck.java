/*
 * Program to check if a number is prime or not
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Luvkush
 */
public class primeCheck {
    public static void main(String[] args) {
        
        int flag =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        if(num==0||num==1)
            System.out.println("\nEntered number isn't prime!\n ");
        else
        {
            for(int i=2; i<num; i++)
            {
                if(num % i == 0)
                {
                    flag = 1;
                    break;
                }
            }
        }
        
        
        if(flag == 1)
        {
            System.out.println("\nEntered number isn't prime!\n ");
        }
        else
        {
            System.out.println("\nEntered number is prime!\n ");
        }
        
    }
}
