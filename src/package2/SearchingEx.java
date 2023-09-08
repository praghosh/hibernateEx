package package2;


import java.util.TreeSet;

// Main class
public class SearchingEx{

	// Main driver method
	public static void main(String args[])
	{

		// Creating an empty TreeSet of string type
		TreeSet<String> tree = new TreeSet<String>();

		// Adding elements in TreeSet
		// Using add() method to
		tree.add("Welcome");
		tree.add("To");
		tree.add("java");
		tree.add("TreeSet");

		// Displaying the TreeSet
		System.out.println("TreeSet: " + tree);

		// Use-case 1
		// Check for specific element in the above TreeSet
		// object using contains() method of TreeSet class

		// Printing a boolean value
		System.out.println(
				"Does the Set contains 'TreeSet'? "
						+ tree.contains("TreeSet"));

		// Use-case 2
		// Check for specific element in the above TreeSet
		// object Say custom element be "4"
		System.out.println("Does the Set contains 'java'? "
				+ tree.contains("java"));

		// Use-case 3
		// Check if the list contains "No"
		System.out.println("Does the Set contains 'No'? "
				+ tree.contains("No"));
	}
}
