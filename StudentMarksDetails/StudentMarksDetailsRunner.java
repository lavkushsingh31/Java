package com.lavkush.StudentMarksDetails;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Arrays;

public class StudentMarksDetailsRunner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String name; 
		int totalEnteredMarks,sum,maxMark, minMark;
		BigDecimal average;
		int[] listOfMarks = new int[5];
		
		System.out.println("Enter the name of the student: ");
		name = scan.nextLine();
		
		System.out.println("Enter the marks obtained in five subjects: ");
		
		for(int i=0;i<listOfMarks.length;i++) {
			listOfMarks[i] = scan.nextInt();
		}
		scan.close();
		
		
		StudentMarksDetails student = new StudentMarksDetails(name, listOfMarks);
		
		totalEnteredMarks = student.getNumberOfMarks();
		sum = student.getTotalSumOfMarks();
		maxMark = student.getMaximumMark();
		minMark = student.getminimumMark();
		average = student.getAverageMarks();
		
		System.out.println("Name of Student: "+student.getName());
		System.out.println("Marks entered: \n"+Arrays.toString(student.getListOfMarks()));
		System.out.println("Total marks entered: "+totalEnteredMarks);
		System.out.println("Sum of the marks entered "+sum);
		System.out.println("Maximum mark obtained: "+maxMark);
		System.out.println("Minimum mark obtained: "+minMark);
		System.out.println("Average of the marks obtained: "+average);
	
	}

}
