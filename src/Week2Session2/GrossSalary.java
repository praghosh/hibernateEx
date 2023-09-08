package Week2Session2;

import java.util.Scanner;

/*

Write a program to calculate the gross salary of a group of  employees. 
Basic salary should be taken from the user.
If the basic salary is greater than 15000 ,HRA=20% and DA=60% will be given, 
else HRA=3000 and DA 70% will be given to the employee.

 */

public class GrossSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while (true) {
			
			System.out.println("Enter Basic Salary");
			System.out.println("Enter -1 to exit:");
			int basic = sc.nextInt();
			if (basic==-1) {
				System.out.println("Bye");
				break;
			}
			calculateGrossSalary (basic);
		}

		sc.close();

	}

	private static void calculateGrossSalary(int basic) {

		int da=0;
		int hra=0;

		if (basic>15000) {
			hra = (int)  (basic *0.2);
			da = (int)  (basic *0.6);

		}
		else {
			hra=3000;
			da = (int)  (basic *0.7);
		}

		int gross = basic + hra + da;
		System.out.println("Your Basic Salary is " + basic);
		System.out.println("Your HRA is " + hra);
		System.out.println("Your DA is " + da);
		System.out.println("Your Gross Salary is " + gross);
	}

}



