package package2;

import java.util.*;

public class UnmodifiedExample {
	public static void main(String[] argv)
			throws Exception
	{
		try {
			
			// creating object of ArrayList<String>
			List<String> list = new ArrayList<String>();

			// populate the list
			list.add("Mango");
			list.add("Orange");

			// printing the list
			System.out.println("Initial list: " + list);

			//Creating unmodifiable list using unmodifiableCollection() method
			Collection<String>
			immutablelist = Collections
			.unmodifiableCollection(list);

			// Adding new element to the Collection
			System.out.println("Attempt to modify an unmodifiableCollection object.");
			immutablelist.add("strawberry");
		}

		catch (UnsupportedOperationException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}