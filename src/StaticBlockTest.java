import java.util.Arrays;

public class StaticBlockTest {

	static TestClass1 obj1 = new TestClass1 ();
	
	StaticBlockTest () {	
		System.out.println ("StaticBlockTest created---"); //This object will be created
		// first because the static variable obj1 created first.
	}

	static {	
		System.out.println("Static block called"); // This will be called second
	}

	public static void main(String[] args) {
		String x = "abc";
		String y = "abc";
		x.concat(y);
		System.out.println(x);
		System.out.println("Main method called");
	}

	static TestClass2 obj2 = new TestClass2 ();

}


class TestClass1 {

	TestClass1 () {

	
		System.out.println ("Test Class 1 created"); //This object will be created
		// first because the static variable obj1 created first.
	}

}


class TestClass2 {

	TestClass2 () {
		System.out.println ("Test Class 2 created");
	}

}