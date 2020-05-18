package com.lavkush.StudentMarksDetails;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class StudentMarksArrayList {
	private String name;
	private int[] listOfMarks;

	public StudentMarksArrayList(String name, int[] listOfMarks) {
		this.name = name;
		this.listOfMarks = listOfMarks;
	}

	public int getTotalSumOfMarks() {
		int sum=0;
		for(int element:listOfMarks) {
			sum = sum+element;
		}
		return sum;
	}

	public int getNumberOfMarks() {
		
		return listOfMarks.length;
	}

	public int getMaximumMark() {
		int max = 0;
		for(int element:listOfMarks) {
			if(element > max) {
				max = element;
			}
		}
		return max;
	}

	public int getminimumMark() {
		Arrays.sort(listOfMarks);
		System.out.println(Arrays.toString(listOfMarks));
		return listOfMarks[0];
	}

	public BigDecimal getAverageMarks() {
		
		return new BigDecimal(getTotalSumOfMarks()).divide( new BigDecimal( getNumberOfMarks() ), 3, RoundingMode.UP);
		 
	}

	public String getName() {
		return name;
	}

	public int[] getListOfMarks() {
		return listOfMarks;
	}
}
