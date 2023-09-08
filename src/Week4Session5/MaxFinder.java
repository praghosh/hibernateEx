package Week4Session5;


/*
 * Java program to implement generic method that
 * finds the maximum element in an array of any type:
 */
public class MaxFinder 
{
	public static <T extends Comparable<T>> T findMax(T[] array) 
	{
		if (array == null || array.length == 0) 
		{
			throw new IllegalArgumentException("Array is empty");
		}

		T max = array[0];
		for (int i = 1; i < array.length; i++) 
		{
			if (array[i].compareTo(max) > 0)
			{
				max = array[i];
			}
		}
		return max;
	}

	public static void main(String[] args) 
	{
		Integer[] intArray = { -10, -5, -20, -15 };
		Double[] doubleArray = { 3.14, 2.71, 1.618 };
		String[] stringArray = { "apple", "banana", "cherry", "cx" };

		System.out.println("Max Integer: " + findMax(intArray));
		System.out.println("Max Double: " + findMax(doubleArray));
		System.out.println("Max String: " + findMax(stringArray));
	}
}