package com.javalearning.lavkush;

public class TestingBasicDataTypes {
	
	public static void main(String[] args) {
		
		char ch='L';
		short sh=100;
		int integ = 50; 	 
		long lon = 2345674376788000456l;
		float fl = 3.1456f;
		double dbl = 23.45678543;
		
		System.out.println("\nPrinting the values;\n");
		System.out.println("int value: "+integ);
		System.out.println("char value: "+ch);
		System.out.println("short value: "+sh);
		System.out.println("long value: "+lon);
		System.out.println("float value: "+fl);
		System.out.println("double value: "+dbl);
		
		System.out.println("\nPrinting the information of 'char';\n");
		System.out.println("Size of char: "+Character.SIZE);
		System.out.println("Size of char (in Bytes): "+Character.BYTES);
		System.out.println("Min value that can be stored char: "+Character.MIN_VALUE);
		System.out.println("Max value that can be stored char: "+Character.MAX_VALUE);
		
		System.out.println("\nPrinting the information of 'short';\n");
		System.out.println("Size of short: "+Short.SIZE);
		System.out.println("Size of short (in Bytes): "+Short.BYTES);
		System.out.println("Min value that can be stored short: "+Short.MIN_VALUE);
		System.out.println("Max value that can be stored short: "+Short.MAX_VALUE);
		
		System.out.println("\nPrinting the information of 'int';\n");
		System.out.println("Size of int: "+Integer.SIZE);
		System.out.println("Size of int (in Bytes): "+Integer.BYTES);
		System.out.println("Min value that can be stored int: "+Integer.MIN_VALUE);
		System.out.println("Max value that can be stored int: "+Integer.MAX_VALUE);
		
		System.out.println("\nPrinting the information of 'long';\n");
		System.out.println("Size of long: "+Long.SIZE);
		System.out.println("Size of long (in Bytes): "+Long.BYTES);
		System.out.println("Min value that can be stored long: "+Long.MIN_VALUE);
		System.out.println("Max value that can be stored long: "+Long.MAX_VALUE);
		
		System.out.println("\nPrinting the information of 'float';\n");
		System.out.println("Size of float: "+Float.SIZE);
		System.out.println("Size of float (in Bytes): "+Float.BYTES);
		System.out.println("Min value that can be stored float: "+Float.MIN_VALUE);
		System.out.println("Max value that can be stored float: "+Float.MAX_VALUE);
		
		System.out.println("\nPrinting the information of 'double';\n");
		System.out.println("Size of double: "+Double.SIZE);
		System.out.println("Size of double (in Bytes): "+Double.BYTES);
		System.out.println("Min value that can be stored double: "+Double.MIN_VALUE);
		System.out.println("Max value that can be stored double: "+Double.MAX_VALUE);
	}
}
