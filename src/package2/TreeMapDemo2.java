package package2;

import java.util.*;

public class TreeMapDemo2 {
	public static void main(String[] args)
	{

		// Creating an empty TreeMap
		TreeMap<String, Integer> tree_map = 
				new TreeMap<String, Integer>();

		// Mapping int values to string keys
		tree_map.put("priya", 10);
		tree_map.put("ravi", 15);
		tree_map.put("ram", 20);
		tree_map.put("raja", 25);
		tree_map.put("rahim", 30);

		// Displaying the TreeMap
		System.out.println("Initial Mappings are: " + tree_map);

		// Checking for the key_element 'Welcomes'
		System.out.println("Is the key 'Welcomes' present? " + 
				tree_map.containsKey("ram"));

		// Checking for the key_element 'World'
		System.out.println("Is the key 'World' present? " + 
				tree_map.containsKey("World"));
	}
}
