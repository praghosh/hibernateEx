package com.anudip.example;
/**
 * 
 * Basic class to explain Class structure
 *
 */

public class Student  {

	// Member variable declaration
	private String studentName="John";
	private String collegeName="IIEM";
	private int studentId=101;

	public static void main(String[] args) {
		
		System.out.println("Successful");
		
		//**********Following section is not part of Assignment*********
		//********** It is just to show how to further work on this class
		//***********Students will learn this in the coming sessions ***
		
	    // Students will learn about constructor and instantiation
	    // in upcoming session
		Student student1=new Student();	//class instantiation

		//this line will display the default value of studentName,collegeName and 
		//studentId variable
		System.out.println("Id:"+student1.studentId+" Name:"+student1.studentName+
				" College name:"+student1.collegeName);
	}

}