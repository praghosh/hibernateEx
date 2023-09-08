package package2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		//List<Integer> list2=new ArrayList<Integer>();

		list1.add(12);
		list1.add(22);
		list1.add(12);
		list1.add(32);
		list1.add(42);
		list1.add(52);

		System.out.println(list1);
		System.out.println("before adding more elements: "+list1.size());
		list1.add(62);
		list1.add(72);
		System.out.println(list1);
		System.out.println("after adding more elements: "+list1.size());
		list1.add(4, 100);
		System.out.println(list1);
		System.out.println("after adding more elements: "+list1.size());
		list1.set(4, 150);
		System.out.println(list1);
		list1.remove(3);
		System.out.println(list1);

		//iterate arraylisy using for each loop
		System.out.println("iterate arraylist using for each loop");
		for(Integer i:list1)
		{
			System.out.println(i);
		}

		//sort the list
		Collections.sort(list1);
		System.out.println("after sorting elements are: ");
		System.out.println(list1);

		System.out.println("iterate arraylist using for loop");
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		System.out.println("iterate arraylist using while loop");
		int i=0;
		while(i<list1.size())
		{
			System.out.println(list1.get(i));
			i++;
		}

		System.out.println("using iterator");
		Iterator itr=list1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		//convert an array to Arraylist
		String names[]= {"Rohan","Mohan","Johan","Rustom"};
		ArrayList<String> alist=new ArrayList<String>(Arrays.asList(names));
		System.out.println(alist);
		alist.add("William");
		alist.add("David");

		for(String s:alist)
		{
			System.out.println(s);
		}

		ArrayList<String> alist2=new ArrayList<String>();
		Collections.addAll(alist2, names);


		alist2.add("Michael");
		alist2.add("Henry");
		System.out.println("alist2: "+alist2);

		//manually conversion
		ArrayList<String> alist3=new ArrayList<String>();
		for(int c=0;c<names.length;c++)
		{
			alist3.add(names[c]);
		}
		System.out.println("alist3: "+alist3);
		alist.clear();
		System.out.println("alist: "+alist);
	}
}

