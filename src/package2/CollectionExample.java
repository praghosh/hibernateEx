package package2;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
	public static void main(String[] args) {
		// Create a list to store names
		List<String> names = new ArrayList<>();

		// Add elements to the list
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");

		// Access elements in the list
		System.out.println("List size: " + names.size());
		System.out.println("First element: " + names.get(0));
		System.out.println("Last element: " + names.get(names.size() - 1));

		// Iterate over the list
		System.out.println("All elements:");
		for (String name : names) {
			System.out.println(name);
		}

		// Check if an element exists
		String searchName = "Bob";
		if (names.contains(searchName)) {
			System.out.println(searchName + " is in the list.");
		}

		// Remove an element
		names.remove("Charlie");

		// Check if the list is empty
		System.out.println("Is the list empty? " + names.isEmpty());
	}
}