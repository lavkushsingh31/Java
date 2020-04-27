package com.Lavkush.MutliplicationTable;

public class MutliplicationTable {
	
	//Table of two is Printed by Default 
		public void printTable()
		{
			for(int i = 1;i<=10;i++)
				System.out.printf("%d * %d = %d\n",2,i,2*i);
		}
		
		//User will pass a number and it's table will be printed by this method 
		public void printTable(int x)
		{
			for(int i = 1;i<=10;i++)
				System.out.printf("%d * %d = %d\n",x,i,x*i);
		}
		
		//User will choose number along with the limits from where till where to print the table
		public void printTable(int x, int from, int to)
		{
			for(int i = from;i<=to;i++)
				System.out.printf("%d * %d = %d\n",x,i,x*i);
		}
}
