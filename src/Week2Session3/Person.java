package Week2Session3;

public class Person {
	private String name="John";
	private int age=25;

	// Default constructor (automatically generated)
	// It will look like following
//	public Person() {
//		// No specific initialization  
//	}

	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);

	}
	public static void main(String[] args) {
		Person person = new Person(); // Calls the default constructor
		person.displayInfo();
	}
}







