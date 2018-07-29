/*
 * Program to check if the number is palinddrome or not
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Luvkush
 */
public class palindrome {
    public static void main(String[] args) {
        int num, rev=0, rem, original;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number: ");
        num = scan.nextInt(); 
        original = num;
        while(num!=0)
        {
            rem = num%10;
            num =  num/10;
            rev = rev*10 + rem;
            
        }
        
        System.out.println("\nReverse of the number: "+ rev);
        
        if(rev == original)
            System.out.println("\nThis is a palindrome number!\n");
        else
            System.out.println("\nThis is NOT a palindrome number!\n");
    }
}
