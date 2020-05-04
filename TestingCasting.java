package com.javalearning.lavkush;

public class TestingCasting {
	
	public static void main(String[] args) {
		int i = 56, j=24;
		long l = 345600008777l, k=1234456578557546l;
		
		System.out.println("Value of i before casting: "+i);
		i = (int) l; 
		System.out.println("Value of i after casting: "+i+"\n");
		
		System.out.println("Value of k before casting: "+k);
		k = j; 
		System.out.println("Value of k after casting: "+k+"\n");
		
		int eight = 010;
		int sixteen = 0x10;
		int fifteen = 0xF;
		
		System.out.println("Value of integer 'eight': "+eight);
		System.out.println("Value of integer 'sixteen': "+sixteen);
		System.out.println("Value of integer 'fifteen': "+fifteen);
	}
}
