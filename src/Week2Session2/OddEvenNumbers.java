package Week2Session2;

import java.util.Scanner;

/**
 * 
 * 
 * Write a program to count and print the total number of odd and even numbers from user inputs. 
 * Program will ask for user inputs in a loop. Loop will terminate if -1 is entered as input. 
 *
 */
public class OddEvenNumbers {


	public static void main(String[] args) {

		int totalEvenCount =0;
		int totaOddCount =0;
		Scanner sc = new Scanner (System.in);
		// Taking input in a loop
		while (true) {

			System.out.println("Enter an integer");
			System.out.println("Enter -1 to exit:");
			int number = sc.nextInt();
			if (number==-1) {
				System.out.println("Bye");
				break;
			}
			else if (number%2==0) {
				totalEvenCount++;

			}
			else {
				totaOddCount++;
			}
		}
		System.out.println("You have entered");
		System.out.println(totaOddCount + " Odd Numbers"); 
		System.out.println(totalEvenCount + " Even Numbers");

	}

}
