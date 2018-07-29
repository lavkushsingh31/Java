/*
 * Program to find if the number is in power of '2'
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Luvkush
 */
public class powerOf2 {
    public static void main(String[] args) {
        int num, check=1;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number: ");
        num = scan.nextInt();
        
        while(check<=num)
        {
            check = check*2;
            if(check == num)
                break;
        }
        
        if(check == num)
        {
            System.out.println("\nWooo! This number can be expressed in powers of '2'. Cheers!\n");
        }
        else
        {
            System.out.println("\nSorry, This number CANNOT be expressed in powers of '2'. \n");
        }
    }
}
