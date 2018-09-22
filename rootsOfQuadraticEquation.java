
package assignments;

import java.util.Scanner;

public class rootsOfQuadraticEquation {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        float[] coeffs = new float[3];      // at the index 0,1,2 are stored 'a','b','c' respectively!
        double x, D;                       // D = Discriminant
        
        System.out.print("*****\t\tQuadratic Equation in one variable\t\t*****\n\n");
        System.out.print("\t\t1. ax^2 + bx + c = 0\n"
                + "\nEnter the coefficients (a,b,c) of the above equation: ");
        
        for(int i=0;i<coeffs.length;i++)
            coeffs[i] = scan.nextInt();
        
        D = (coeffs[1]*coeffs[1]) - (4*coeffs[0]*coeffs[2]);
        
        
        if(D>0)
        {
            System.out.print("\nThe quadratic equation has distinct solution!");
            x=(-coeffs[1]+ Math.sqrt(D))/(2*coeffs[0]);
            D=(-coeffs[1]- Math.sqrt(D))/(2*coeffs[0]);
            System.out.print("\nSolutions: "+x+", "+D+"\n\n");
        }
        else if(D==0)
        {
            System.out.print("\nThe quadratic equation has unique solution!");
            x=-coeffs[1]/(2*coeffs[0]);
            System.out.print("\nSolutions: "+x+", "+x+"\n\n");
        }
        else
        {
            System.out.print("\nThe quadratic equation has imaginary solution!");
            x=2*coeffs[0];
            System.out.print("\nSolutions:\n-"+coeffs[1]+" + √"+D+"i/"+x+"\n-"
                                            +coeffs[1]+" - √"+D+"i/"+x+"\n\n\n");
        }
    }
}
