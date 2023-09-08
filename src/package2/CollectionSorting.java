package package2;

import java.util.*;

public class CollectionSorting
{
	public static void main(String[] args)
	{
		// Create a list of strings
		ArrayList<String> al = new ArrayList<String>();
		al.add("Harry");
		al.add("Friends");
		al.add("Dear");
		al.add("Is");
		al.add("Superb");

		/* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
		Collections.sort(al);

		// Let us print the sorted list
		System.out.println("List after the use of" +
				" Collection.sort() :\n" + al);
		
		Map <Float, String> map1 = new HashMap <Float, String>();
		TreeMap <Float, String> map2 = new TreeMap <Float, String>();
		 System.out.println(map2.pollFirstEntry());
		map2.put(2.00001f, "ABCD222");
		map2.put(2f, "ABCDq12");
		map2.put(1f, "ABCDq");
		
	  TreeSet tx = new TreeSet ();
	  System.out.println(tx.pollFirst());
	  tx.add(Integer.valueOf(4));
//	  tx.add("ABC");
//	  tx.add("ABCD");
//	  tx.add("BBCD");
//	  tx.add("PQRS");
	  tx.add(Integer.valueOf(14));
	  System.out.println(map2.pollFirstEntry());
	  System.out.println(tx.pollFirst());
		
	}
}
