/*
Program to print the following pattern:

        999999999
        88888888
        7777777
        666666
        55555
        4444
        333
        22
        1
*/


package assignments;

public class printingPattern {
    public static void main(String[] args) {
        
        for(int i=9;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
                System.out.print(i);
            System.out.print("\n");
        }
    }
}
