package week2Session1;

import java.util.Scanner;

/*
 * 
 * Write a program to enter marks of five subjects and calculate
 *  total marks,average and percentage. Give grades based on average marks.
 *   Grades should be Ex (>90%), A (>80%) , B(>60%) ,C (>=40%) and F(<40%).
 *    Use the Scanner class to take inputs from the console.
 * 
 * 
 */
public class StudentGrades {

	public static String gradeStudents (float average) {
		if (average >90)  
			return "EX";
		else if (average>80) 
			return "A";
		else if (average>60) 
			return "B";
		else if (average>=40) 
			return "C";
		return "F";
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		// Taking input in a loop
		int totalMarks=0;
		System.out.println("Enter marks in all subjects\n" +
		"(Marks should be 0 to 100)");
		for (int i = 1; i <= 5; i++) {

			System.out.println("Enter marks in subject " + i);
			totalMarks+=sc.nextInt();  // Taking marks as user input and adding 			
			// it to total.

		}
		float average=  ((float)totalMarks)/5f;
		System.out.println("You have obtained grade " + gradeStudents (average) ) ;
	}



}
