package com.lavkush.ArithmeticOperations;

public class ArithmeticMenu {
	
	private float num1,num2;

	public ArithmeticMenu(float num1, float num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public float getNum1() {
		return num1;
	}


	public float getNum2() {
		return num2;
	}

	public float add() {
		return num1+num2;
	}
	
	public float substract() {
		return num1-num2;
	}
	
	public float multiply() {
		return num1*num2;
	}
	
	public float divide() {
		return num1/num2;
	}
}
