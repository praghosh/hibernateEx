package package1;

import java.util.HashMap;

public class MainTest {
	public static void main(String[] args) {

		// Creating  a hashmap
		HashMap<String, Integer> languages = new HashMap<>();

		// Adding Key Value pairs
		languages.put("English", 12);
		languages.put("Hindi", 18);
		languages.put("Spanish", 34);
		System.out.println("HashMap: " + languages);
		// Print Keys
		System.out.println("Keys: " + languages.keySet());
		// Print Values
	    System.out.println("Values: " + languages.values());
	    
	    // Using entrySet()
        System.out.println("Key/Value mappings: " + languages.entrySet());

	}
}