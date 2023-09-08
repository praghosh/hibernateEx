import java.util.Arrays;

public class JavaTest {

	 static void test () {	 
	        int x = 10*20-20; 
	        System.out.println(x); 
	}

	public static void main(String[] args) {
		
		Super s = new Subclass();
		s.foo();
		test();
		int arr[] = { 1, 2, 3, 4 };

		try {
			arr[4] = 0;
		} catch (Exception ex) {
			System.out.println("Exception");
		} 
		 finally {
			System.out.println("Finally");
		}

	}

}

 

public class Test {
	public static void main(String[] args) {
		Super s = new Subclass();
		s.foo();
	}
}

class Super {
	void foo() {
		System.out.println("Super");
	}
}

class Subclass extends Super {
	static void foo() {
		System.out.println("Subclass");
	}
}