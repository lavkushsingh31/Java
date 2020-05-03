package com.lavkush.Motorbike;

public class MotorCycle {
	
	private int speed;
	
	MotorCycle() {
		this(10);		// Setting speed of 10 units, calling below constructor
	}
	
	MotorCycle(int speed){
		this.speed = speed;
	}
	
	
	// Method to indicate starting of MotorCycle
	public void startMotorCycle(String name) {
		
		System.out.println(name + " Motorcycle started!");
	}
	
	
	// Method to indicate stopping of MotorCycle
	public void stopMotorCycle(String name) {
		
		System.out.println(name + " Motorcycle stopped!");
	}
	
	
	// Getter method to get the speed of the motor vehicle
	public int getSpeed() {
		return speed;
	}

	
	// Setter method to set the speed of the motor vehicle
	public void setSpeed(int speed) {
		
		if(speed > 0) {
			this.speed = speed;
		}
	}
	
	
	// Method to increase the speed of the motor vehicle
	public void increaseSpeed(int factor)
	{
		if(this.speed + factor > 0)
			setSpeed(this.speed + factor);
	}

	
	// Method to decrease the speed of the motor vehicle
	public void decreaseSpeed(int factor)
	{
		if(this.speed - factor > 0) {
			setSpeed(this.speed - factor);
		}
	}
}
