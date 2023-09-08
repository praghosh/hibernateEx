package Week3Session1New;


class Parent {
	void show() {
		System.out.println("Parent's show method");
	}
}

class Child extends Parent {
	@Override
	void show() {
		super.show(); // Calls parent's show method
		System.out.println("Child's show method");
	}
}

public class SuperInOverridingMethod {
	public static void main(String[] args) {
		Child child = new Child();
		child.show();
	}
}
