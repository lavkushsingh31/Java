package com.lavkush.StringArrayDemo;

public class StringArrayDemo {

	public static void main(String[] args) {

		String[] daysOfWeek = {"Sunday","Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"};
		String longest="";
		
		System.out.println("\nDays of the week are:");
		
		for(String days:daysOfWeek) {
			System.out.println(days);
			if(days.length() > longest.length()) {
				longest = days;
			}
		}
		
		System.out.println("\nLongest spelling day: "+longest);
		
		System.out.println("\nPrinting the days backwards: ");
		for (int i =daysOfWeek.length-1;i>=0;i--) {
			System.out.println(daysOfWeek[i]);
		}

	}

}
