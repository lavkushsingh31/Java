package table;

import java.util.Scanner;

public class Table {
	
	public static void main(String args [])
	{
		Scanner scan = new Scanner(System.in);
		int i;
		System.out.println("\nEnter the number you wish to print table of: ");
		i = scan.nextInt();
		scan.close();
		table(i);
	}
	
	public static void table(int x)
	{
		for(int i = 1;i<=10;i++)
			System.out.printf("%d * %d = %d\n",x,i,x*i);
	}
	
}
