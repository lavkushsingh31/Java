package com.lavkush.Motorbike;

public class MotorCycle {
	
	private int speed;
	
	public void startMotorCycle(String name) {
		
		System.out.println(name + " Motorcycle started!");
	}
	
	public void stopMotorCycle(String name) {
		
		System.out.println(name + " Motorcycle stopped!");
	}
	

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		
		if(speed > 0) {
			this.speed = speed;
		}
	}
	
	public void increaseSpeed(int factor)
	{
		if(this.speed + factor > 0)
			setSpeed(this.speed + factor);
	}

	public void decreaseSpeed(int factor)
	{
		if(this.speed - factor > 0) {
			setSpeed(this.speed - factor);
		}
	}
}
