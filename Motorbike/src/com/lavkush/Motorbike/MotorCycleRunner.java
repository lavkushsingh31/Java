package com.lavkush.Motorbike;

public class MotorCycleRunner {

	public static void main(String[] args) {
		
		MotorCycle yamaha = new MotorCycle();
		MotorCycle bajaj = new MotorCycle();
		
		int currentSpeedBajaj, currentSpeedYamaha;
		
		yamaha.startMotorCycle(new String("Yamaha"));
		bajaj.startMotorCycle(new String("Bajaj"));
		
		yamaha.setSpeed(20);
		bajaj.setSpeed(30);
		
		currentSpeedYamaha = yamaha.getSpeed();
		currentSpeedBajaj = bajaj.getSpeed();
		
		System.out.println("\nCurrent Speed of Yamaha: "+currentSpeedYamaha);
		System.out.println("Current Speed of Yamaha: "+currentSpeedBajaj);
		
		System.out.println("\nIncreasing Speed!\n");
		yamaha.increaseSpeed(10);
		bajaj.increaseSpeed(20);
		
		currentSpeedYamaha = yamaha.getSpeed();
		currentSpeedBajaj = bajaj.getSpeed();
		
		System.out.println("Current Speed of Yamaha: "+currentSpeedYamaha);
		System.out.println("Current Speed of Yamaha: "+currentSpeedBajaj+"\n");
		
		System.out.println("\nDecreasing Speed!\n");
		yamaha.decreaseSpeed(20);
		bajaj.decreaseSpeed(10);
		
		currentSpeedYamaha = yamaha.getSpeed();
		currentSpeedBajaj = bajaj.getSpeed();
		
		System.out.println("Current Speed of Yamaha: "+currentSpeedYamaha);
		System.out.println("Current Speed of Yamaha: "+currentSpeedBajaj+"\n");
		
		yamaha.stopMotorCycle(new String("Yamaha"));
		bajaj.stopMotorCycle(new String("Bajaj"));

	}

}
