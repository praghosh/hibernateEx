package package2;

//Java program to demonstrate
//singletonList() method

import java.util.*;

public class ListUtilities {
	public static void main(String[] argv)
			throws Exception
	{

		try {

			// Create singleton list from String
			List<String> listOfString = Collections.singletonList("A");
			// print the list
			System.out.println("singletonList String : " + listOfString);

			// Create singleton list from Integer
			List<Integer> listOfInt = Collections.singletonList(32);
			// print the list
			System.out.println("singletonList Integer : " + listOfInt);
		}

		catch (IllegalArgumentException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}