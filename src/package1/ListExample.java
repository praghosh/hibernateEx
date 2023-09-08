package package1;

import java.util.*;
public class ListExample {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("David");
		list.add("Jhon");
		list.add("Stacy");
		for (String Students : list)
			System.out.println(Students);
	}
}
