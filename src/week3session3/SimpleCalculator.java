 
package week3session3;
/*
 * Java program that implements a simple calculator with exception handling
 */
import java.util.Scanner;

public class SimpleCalculator 
{
    public static void main(String[] args) 
    {
    	//scanner class object to take input from the user
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Simple Calculator");
        
        //input for the first number
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        //input for the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        //input for the first number
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        try 
        {
            switch (operator)
            {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) 
                    {
                    	scanner.close();
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;
                default:
                	scanner.close();
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
            	System.out.println("Result: " + result);
            	
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
