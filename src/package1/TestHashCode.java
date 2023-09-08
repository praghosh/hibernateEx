package package1;

import java.io.*;
import java.util.*;

class HashCheck 
{

	String name;
	int id;

	HashCheck(String name, int id)
	{

		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj)
	{          
		if(this == obj)
			return true;
		if(obj == null || obj.getClass()!= this.getClass())
			return false;
		HashCheck check = (HashCheck) obj;
		return ( //check.name.equals(this.name)  &&
				check.id == this.id);
	}

	@Override
	public int hashCode()
	{
		return this.id;
	}

}
// Driver code
public class TestHashCode 
{
	public static void main (String[] args) 
	{          
		HashCheck g1 = new HashCheck("Ajay", 1);
		HashCheck g2 = new HashCheck("Bijay", 1);
		Map<HashCheck, String> map = new HashMap<HashCheck, String>();
		map.put(g1, "History");
		map.put(g2, "Mathematics");


		for(HashCheck check : map.keySet())
		{
			System.out.println(map.get(check).toString());
		}
		
		HashSet <HashCheck> test = new  HashSet <HashCheck> ();
		test.add(g1);
		test.add(g2);
		
		for(HashCheck check : test)
		{
			System.out.println(check.name);
		}

	}
}
