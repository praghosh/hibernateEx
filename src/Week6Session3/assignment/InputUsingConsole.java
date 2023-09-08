package Week6Session3.assignment;

import java.io.Console;

public class InputUsingConsole {
	public static void main(String[] args) {
		Console console = System.console();

		if (console == null) {
			System.out.println("Console is not available.");
			System.exit(1);
		}

		String firstString = console.readLine("Enter a number: ");
		String secondtString = console.readLine("Enter another : ");

		System.out.println("The sum of the number is=" +
				addNumberUsingStringInput(firstString, secondtString) );
		
	}

	private static double  addNumberUsingStringInput(String firstNum, String secondNum) {

		double value1 = Double.parseDouble(firstNum);
		double value2 = Double.parseDouble(secondNum);
		return value1 + value2;

	}

}