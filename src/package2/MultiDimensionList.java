package package2;


import java.util.*;

public class MultiDimensionList {

	static List create2DArrayList()
	{

		ArrayList<ArrayList<Integer> > twoDimensionalList
		= new ArrayList<ArrayList<Integer> >();

		twoDimensionalList.add(new ArrayList<Integer>());

		twoDimensionalList.get(0).add(0, 3);
		twoDimensionalList.get(0).add(4);
		twoDimensionalList.get(0).add(5);

		twoDimensionalList.add(
				new ArrayList<Integer>(Arrays.asList(6, 7)));

		twoDimensionalList.get(1).add(8);


		twoDimensionalList.add(new ArrayList<Integer>(
				Arrays.asList(9, 10, 11)));

		return twoDimensionalList;
	}

 
	public static void main(String args[])
	{
 
		System.out.println("2D ArrayList :");

		// Call the method and print
		System.out.println(create2DArrayList());
	}
}
