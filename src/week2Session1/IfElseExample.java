package week2Session1;

/**
 * 
 * Checking if else statements
 *
 */
public class IfElseExample {
	public static void main(String[] args) {
		int age = 10;

		// Checks if age is greater than or equal to 18
		// and execute the following block.
		if (age >= 18) {
			System.out.println("You are an adult."); // Output from if
		}

		// Execute this block
		// if number is less than 18
		else {
			System.out.println("You are a minor."); // Output from else
		}

		// This statement will be executed irrespective of the outcome
		// of the if...else statement unless there is an Exception
		// occurred. (Exception will be explained later)
		System.out.println("Statement outside if...else block");
	}
}