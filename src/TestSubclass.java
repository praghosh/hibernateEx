import java.io.IOException;

public class TestSubclass {
	public static void main(String[] args) {
		Subclass s1 = new Subclass();
		s1.foo(); // line 6
		Super s = new Subclass();
		s.foo(); // line 8
		
		try {
			throw new IOException("Hello");
		} catch (IOException | Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class Super {
	private void foo() {
		System.out.println("Super");
	}
}

class Subclass extends Super {
	public void foo() {
		System.out.println("Subclass");
	}
}