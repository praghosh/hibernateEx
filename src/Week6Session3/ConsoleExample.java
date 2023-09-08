package Week6Session3;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {
		Console console = System.console();

		if (console == null) {
			System.out.println("Console is not available.");
			System.exit(1);
		}

		String userName = console.readLine("Enter your username: ");
		char[] password = console.readPassword("Enter your password: ");

		// Process the input
		if (authenticate(userName, password)) {
			console.printf("Welcome, %s! You are now logged in.%n", userName);
		} else {
			console.printf("Authentication failed. Please try again.%n");
		}

		// Zero out the password array for security
		zeroOutPassword(password);
	}

	private static boolean authenticate(String userName, char[] password) {
		// In a real application, you would perform authentication here.
		// For this example, let's assume that "admin" with password "password" is valid.
		return userName.equals("admin") && new String(password).equals("password");
	}

	private static void zeroOutPassword(char[] password) {
		for (int i = 0; i < password.length; i++) {
			password[i] = ' ';
		}
	}
}