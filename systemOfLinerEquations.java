/*

Program to read six integers a, b, c and d, e, f of the following system of Linear Equations:

ax + by + c = 0;
dx + ey + f = 0;

And reports whether the lines are parallel, co-incident or intersecting. If they intersect, it prints the intersection point.

*/
package assignments;

import java.util.Scanner;

public class systemOfLinerEquations {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] coeffs1 = new int[3];     // at the index 0,1,2 are stored 'a','b','c' respectively!
        int[] coeffs2 = new int[3];     // at the index 0,1,2 are stored 'd','e','f' respectively!
        int x,y;
        
        System.out.print("*****\t\tSystem of Linear Equations in two Variables\t\t*****\n\n");
        System.out.print("\t\t1. ax + by + c = 0\n"
                + "\t\t2. dx + ey + f = 0\n\nEnter the coefficients of (1) Equation (a,b,c): ");
        
        for(int i=0;i<coeffs1.length;i++)
            coeffs1[i] = scan.nextInt();
        
        System.out.print("\nEnter the coefficients of (2) Equation (d,e,f): ");
        
        for(int i=0;i<coeffs2.length;i++)
            coeffs2[i] = scan.nextInt();
        if(coeffs1[0]==0 || coeffs1[1]==0 || coeffs2[0]==0 || coeffs2[1]==0)
        {
            System.out.print("\nSorry! this is not a linear system of quation in two vvariables!");
            return;
        }
        
        if(coeffs1[0]/coeffs2[0] == coeffs1[1]/coeffs2[1] && coeffs1[2]/coeffs2[2] == coeffs1[1]/coeffs2[1] )
            System.out.println("\nThe system of Equations has infinity many solutions!");
        else if(coeffs1[0]/coeffs2[0] == coeffs1[1]/coeffs2[1] && coeffs1[2]/coeffs2[2] != coeffs1[1]/coeffs2[1])
            System.out.println("\nThe system of Equations has NO solution!");
        else 
        {
            System.out.println("\nThe system of Equations has unique solution!");
            
            y = ( ( (coeffs2[0]*coeffs1[2])/ coeffs1[0] ) - coeffs2[2]  )/( coeffs2[1] - (coeffs2[0]/coeffs1[0]) );
            
            x = ( (-coeffs1[1]*y) - coeffs1[2])/(coeffs1[0]);
            
            System.out.print("\nTheir points of intersection ( x, y ) is: ( "+x+", "+y+" )\n\n");
        }
        
    }
    
}
