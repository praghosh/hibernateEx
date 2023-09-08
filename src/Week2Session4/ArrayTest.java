package Week2Session4;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		double [] myArr = new double  [200];
		String [] messages = new String [15];
		
		System.out.println("The length of the double array = " + myArr.length);
		// As arrays is also an Object (Base class of all java class)
		// we can invoke Object's method for an array
		System.out.println("The hashCode() of String array returned  " + messages.hashCode());
		
		
		int[] numbers = {10, 20, 30, 40, 50};
		String [] currenceis = {"INR", "USD", "GBP", "SGD"};
	}

}
