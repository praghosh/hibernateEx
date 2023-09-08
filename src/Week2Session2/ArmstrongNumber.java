package Week2Session2;

/**
Write a program to find out all the Armstrong numbers within a
 given range using a method named printArmstrongNumber(int start, int end) 
 by taking input from the user. 
 The program should print the Armstrong number
 in a given range starting from “start” and ending with “end”. 

 */


import java.util.Scanner;

public class  ArmstrongNumber {


	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter start number");
		int start = sc.nextInt();
		System.out.println("Enter end number");
		int end = sc.nextInt();

		new  ArmstrongNumber ().printArmstrongNumber( start, end);

	}


	// Find and print Armstrong numbers in a range
	void  printArmstrongNumber(  int start, int end)  {

		// Finding the  Armstrong  number inside the loop
		for (int i = start; i <=end; i++) {

			int N =i; // Keeping the value of i unchanged
			int cubeSum =0;
			while (N>0) {   // Calculating the cube for all digits

				int digit =N%10;

				int cube=1;
				for (int j = 1; j <=3; j++) {
                   cube=cube*digit;
				}
				cubeSum+=cube;
				N=N/10;   // removing the last digit
			}
			if (cubeSum==i) {
				System.out.println("The Armstring number in the range=" + i);
			}

		}


	}

}


