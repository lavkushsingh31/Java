//Program to calculate the terminal zeros of any input integer's factorial

package assignments;

import java.math.BigInteger;
import java.util.Scanner;


public class terminalZeros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int input, termialZeros=0;
        
        BigInteger factorial = new BigInteger("1");
        BigInteger rem = new BigInteger("0");
        
        System.out.println("\nEnter the number: ");
        input = scan.nextInt();
        
        if(input==0)
            System.out.println("The factorial of the number is: 1");
        else
        {
            for(int i=1; i<=input;i++)
                factorial = factorial.multiply(BigInteger.valueOf(i));
            System.out.println("The factorial of the number is: "+ factorial);
        }
        
        while(factorial.compareTo(BigInteger.ZERO) == 1)
        {
            rem = factorial.mod(BigInteger.TEN);
            if(rem.compareTo(BigInteger.ZERO) == 0)
                termialZeros++;
            else
                break;
            factorial = factorial.divide(BigInteger.TEN);
        }
        
        System.out.println("Number of Terminal Zeros: "+ termialZeros);
    }
  
}