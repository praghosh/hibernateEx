package package2;

import java.util.*;

public class TreeMapDemo {
	public static void main(String[] args)
	{

		// Creating an empty TreeMap
		TreeMap<Integer, String> tree_map = 
				new TreeMap<Integer, String>();

		// Mapping string values to int keys
		tree_map.put(10, "Apple");
		tree_map.put(15, "mango");
		tree_map.put(20, "banana");
		tree_map.put(25, "kiwi");
		tree_map.put(30, "guava");

		// Displaying the TreeMap
		System.out.println("Initial Mappings are: " + tree_map);

		// Checking for the key_element '20'
		System.out.println("Is the key '20' present? " + 
				tree_map.containsKey(20));

		// Checking for the key_element '5'
		System.out.println("Is the key '5' present? " + 
				tree_map.containsKey(5));
	}
}

