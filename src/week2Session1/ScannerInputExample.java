package week2Session1;

/*
 * Example to explain Scanner class
 */
import java.util.Scanner;

public class ScannerInputExample {
    public static void main(String[] args) {
    	// Creating an instance of scanner that can receives input from
    	// console.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read the content of whole line

        System.out.print("Enter your email Id: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);

        scanner.close();
    }
}