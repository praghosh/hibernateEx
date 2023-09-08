package Week2Session4;

import java.util.Arrays;

public class ArraySorting {
	
	public static void main(String[] args) {
		
		//Declare and initialize an int array
		int [] arr = {56, 32, 12, 1 , 80, 2}; 
		
		// Arrays class in java's java.util package has a 
		// sort() method that sort arrays of primitives and Objects
		
		Arrays.sort(arr);  
		// Array arr is already sorted.
		System.out.println(Arrays.toString(arr)); // Print sorted array
		
		String [] currenceis = {"INR", "USD", "GBP", "SGD"};
		System.out.println(Arrays.toString(currenceis));// Print alphabetically
		
	}

}
