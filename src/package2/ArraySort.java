package package2;

import java.util.Arrays;

public class ArraySort {
	public static void main(String args[])
	{
		int[] arr = { 3, -2, 13, 71, 7, -2, -9 };
		System.out.println("The original array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		Arrays.sort(arr);
		System.out.println("\nThe sorted array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}

