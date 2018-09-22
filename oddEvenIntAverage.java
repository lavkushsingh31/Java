/*
Program which reads int numbers, one per line, until a negative number is entered and then print the
average of the even numbers and the average of the odd numbers.
 */
package assignments;

import java.util.Scanner;

public class oddEvenIntAverage {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int x=0, countEven=0, countOdd=0;
        float evenAverage=0, oddAverage=0;
        
        do
        {
            System.out.print("\nEnter the number: ");
            x = scan.nextInt();
            
            if(x<0)
                break;
            
            if(x%2 == 0)
            {
                countEven++;
                evenAverage = evenAverage + x;
            }
            else
            {
                countOdd++;
                oddAverage = oddAverage + x;
            }
        }while(x>=0);
        
        evenAverage = (float) evenAverage/countEven;
        oddAverage = (float) oddAverage/countOdd;
        
        System.out.print("\n\nTotal Even numbers entered: "+ countEven);
        System.out.print("\nAverage of Even numbers: "+ evenAverage);
        System.out.print("\n\nTotal Odd numbers entered: "+ countOdd);
        System.out.print("\nAverage of Odd numbers: "+ oddAverage + "\n\n");
        
    }
}
