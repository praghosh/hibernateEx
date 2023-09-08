package week1Session3;
/**
*
* Example to explain default constructor
*
*/
public class Employee {
	int id;
	String name;
	boolean isPermanent;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPermanent() {
		return isPermanent;
	}
	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	// No constructor is explicitly defined
	public static void main(String[] args) {
		// We are creating an instance without
		// creating any constructor.
        // Because Java compiler provides default constructor.
		Employee emp = new Employee ();
		//Accessing the method of the instance.
		emp.setName("John");
		System.out.println(emp.getName());	
	}
	
	int  testReturn () {
				 
			int arr [] = {1,2,3,4};
		 
			try {
				arr[4]=0;
				return 4;
			}
			catch (Exception ex ) {
				System.out.println("Exception");
				return 4;
			}
			catch (ArrayIndexOutOfBoundsException ex ) {
				System.out.println("Exception");
				return 4;
			}
			finally {
				System.out.println("Finally");
				return 4;
			}		 
			 	 

	}
}

