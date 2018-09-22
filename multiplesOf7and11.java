/*
Program to print all the integers from 1 to 1001, except those which are multiples of 7 or 11.
 */
package assignments;

public class multiplesOf7and11 {
    public static void main(String[] args) {
        
        for(int i=1;i<1001;i++)
        {
            if( i%7==0 || i%11==0)
                continue;
            System.out.println(i);
            
        }
    }
}
