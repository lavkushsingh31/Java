package com.lavkush.Motorbike;

public class MotorCycleRunner {

	public static void main(String[] args) {
		
		MotorCycle yamaha = new MotorCycle(20);		// setting default 'speed' via constructor
		MotorCycle bajaj = new MotorCycle();		// setting no 'speed' to invoke default constructor
		
		int currentSpeedBajaj, currentSpeedYamaha;
		
		// starting bikes
		yamaha.startMotorCycle(new String("Yamaha"));
		bajaj.startMotorCycle(new String("Bajaj"));
		
		
		System.out.println("\nDefault speed set of Yamaha: "+yamaha.getSpeed());
		System.out.println("Default speed set of Bajaj: "+bajaj.getSpeed());
		
		// setting speed via setter methods
		yamaha.setSpeed(40);
		bajaj.setSpeed(30);
		
		// getting speed in variables
		currentSpeedYamaha = yamaha.getSpeed();
		currentSpeedBajaj = bajaj.getSpeed();
		
		// printing current speeds
		System.out.println("\nCurrent Speed of Yamaha: "+currentSpeedYamaha);
		System.out.println("Current Speed of Bajaj: "+currentSpeedBajaj);
		
		System.out.println("\nIncreasing Speed!\n");
		yamaha.increaseSpeed(10);
		bajaj.increaseSpeed(20);
		
		// getting speed in variables
		currentSpeedYamaha = yamaha.getSpeed();
		currentSpeedBajaj = bajaj.getSpeed();
		
		System.out.println("Current Speed of Yamaha: "+currentSpeedYamaha);
		System.out.println("Current Speed of Bajaj: "+currentSpeedBajaj+"\n");
		
		System.out.println("\nDecreasing Speed!\n");
		yamaha.decreaseSpeed(20);
		bajaj.decreaseSpeed(10);
		
		// getting speed in variables
		currentSpeedYamaha = yamaha.getSpeed();
		currentSpeedBajaj = bajaj.getSpeed();
		
		System.out.println("Current Speed of Yamaha: "+currentSpeedYamaha);
		System.out.println("Current Speed of Bajaj: "+currentSpeedBajaj+"\n");
		
		// stopping motorbikes
		yamaha.stopMotorCycle(new String("Yamaha"));
		bajaj.stopMotorCycle(new String("Bajaj"));

	}

}
