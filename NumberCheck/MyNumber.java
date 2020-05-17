package com.lavkush.NumberCheck;

public class MyNumber {
	
	private int num;
	
	MyNumber(int num) {
		this.num = num;
	}

	public boolean isPrime() {
		
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoN() {
		
		int sum = 0;
		for(int i = 1; i<=num;i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		int sum = 0;
		
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				sum = sum+i;
			}
		}
		return sum;
	}

	public void printNumberTriangle() {
		
		for(int i = 1; i<=num;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print(j +" ");
			}
			System.out.print("\n");
		}
		
	}
	
	
}
