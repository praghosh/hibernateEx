package Wee4Session1;

import java.util.ArrayList;

public class EvenNumberSum {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(8);
		numbers.add(10);
		numbers.add(15);

		int evenSum = 0;
		for (int num : numbers) {
			if (num % 2 == 0) {
				evenSum += num;
			}
		}

		System.out.println("Sum of even numbers: " + evenSum);
	}
}

