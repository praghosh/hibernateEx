package com.anudip.example;

public class Rectangle {
	// Variable declaration and initialization
	double width=12.5;
	double height=45.6;	
	Color boxColor=Color.BLUE;
	
	public static void main(String[] args)
	{
		System.out.println("Blue Color = " + Color.BLUE);
		
		//*** Following section is not part of the assignment ***
		// *** Just to show the capability of Java to advanced students.
		// *** Following section will be clear only after knowing constructors
		Rectangle rectangle=new Rectangle();
		//this line will display the  value assigned in width and height variable
		//and boxColor will be blue.We can change as per our choice
		System.out.println(rectangle.width+" "+
		rectangle.height+" "+rectangle.boxColor);
	}
}
//enum can be defined inside or outside the class
enum Color {
	RED, GREEN, BLUE;
}
