package week2Session1;

import java.util.Scanner;

/*
 * Write a program which calculates the monthly bill amount 
 * for an Internet subscriber 
 *  
 * 
 */
public class InternetSubscrber {
	
	 // Calculates the bill
	static float getInternetBill (float dataConsumed ) {
		
		float totalChrage=0;
		
		if (dataConsumed<10) {
			totalChrage =300;
		}
		else if (dataConsumed <=30) {
			totalChrage = 300 + (dataConsumed-10)*5f;
		}
		else {
			totalChrage = 400 + (dataConsumed-30)*3f;
		}
		
		return totalChrage;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter total data consumed in GB");
		int data = sc.nextInt();
		
		System.out.println("Your bill abount is Rs " + 
				String.format("%,.2f", getInternetBill (data)));
	}
}
