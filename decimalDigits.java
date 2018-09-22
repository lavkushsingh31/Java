/*
Program to input decimal number and displaying the number of digits before and after the decimal number.
*/

package assignments;

import java.util.Scanner;

public class decimalDigits {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float input; 
        
        
        System.out.print("\nEnter the decimal number: ");
        input = scan.nextFloat();
        
        String floatString = Float.toString(input);
        String[] floatParts = floatString.split("[.]");       // or split("\\.");
        
        
        System.out.println("\nNumber you've entered: "+ input+"\n");
        
        System.out.println("Number before decimal: "+ floatParts[0]);
        System.out.println("Number of digits before decimal: "+ floatParts[0].length() + "\n" );
        System.out.println("Number after decimal: "+ floatParts[1]);
        System.out.println("Number of digits before decimal: "+ floatParts[1].length() + "\n\n\n" );
        
    }
}
