package week2Session1;

import java.util.Scanner;

/**
 * 
 * 
 * Write a program  to enter P,T  and calculate simple interest. 
 *
 */
public class InterestCalculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the principal amount in Rs");
		int principal = sc.nextInt();
		System.out.println("Enter the time duration in year");
		int time = sc.nextInt();
		calculateIntereset(principal, time);
	}

	// Calculate interest based on principal and time
	// The rate of interest is determined from the principal amount
	static void calculateIntereset (double principal, double time ){
		double rate = 0;
		
		if (principal>10000) {
			rate =10;  // Yearly interest rate in percent
		}
		else if (principal>=5000) {
			rate =8;
		}
		else {
           rate=5;
		}
		
		double interest = (principal * time * rate)/100.0;
		System.out.print("Interest=");
		System.out.println (String.format("%,.2f", interest));

	}

}
