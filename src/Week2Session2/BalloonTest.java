package Week2Session2;

public class BalloonTest  {

	public static void main(String[] args) {

		Balloon red = new Balloon("Red"); // Let us assume this object has a 
		                                  // memory reference = 50.
		Balloon blue = new Balloon("Blue"); // memory reference = 100
		
		System.out.println("Initial Values of colors" );
		System.out.println("   Ballooon with `red` color value = " + red.getColor());
		System.out.println("   Ballooon with`blue` color value = " + blue.getColor());
		
		swap(red, blue);
		System.out.println("After the swap method executes:");
		System.out.println("   Ballooon with `red` color value = " + red.getColor());
		System.out.println("   Ballooon with `blue` color value = " + blue.getColor());
		
		changeValue(blue);
		System.out.println("After the changeValue method executes:");
		System.out.println("   Ballooon with `blue` color value = " + blue.getColor());
		
	}

	/*
	 *   Generic swap method.
	 *   The references of the two object are swapped.
	 */	 
	public static void swap(Object o1, Object o2){
		Object temp = o1;  
		o1 = o2;
		o2 = temp;  // Reference are changed but its has no effect on
		            // the original reference passed.
	}
	
    /*
     * 
     */
	private static void changeValue(Balloon balloon) { // balloon = 100
		balloon.setColor("Red"); // This the balloon with reference 100
		balloon = new Balloon("Orange"); // A new balloon with reference 200
		balloon.setColor("Pink"); // Working on  balloon  with reference 200
	}
}
