/*
 * Program to sort the elements of Integer array using BUBBLE SORT
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Luvkush
 */
public class sortingIntArray {
    public static void main(String [] args)
    {
        int[] arr = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array elements: ");
        
        for (int i = 0; i < 10; i++) {
            arr[i] =  scan.nextInt();
        }
        
        System.out.print("Your array looks like this:\t");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+ "  ");
        }
        
        for (int i = 0; i < 10-1; i++) {
            for (int j = 0; j < 10-i-1; j++) {
                if(arr[j] > arr [j+1])
                {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        
        System.out.print("\n\nArray after sorting:\t");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+ "  ");        
        }
        System.out.println("\n");
    }
}
