package com.lavkush.PrintUntilLimit;

public class UntilLimit {

	private int limit;

	public UntilLimit(int n) {
		this.limit=n;
	}

	public void printSquareUptoLimit() {
		int i=1;
		while(i*i <= limit) {
			System.out.print(i*i+" ");
			i++;
		}
		
	}

	public void printCubeUptoLimit() {
		int i=1;
		while(i*i*i <= limit) {
			System.out.print(i*i*i +" ");
			i++;
		}
	}

}
