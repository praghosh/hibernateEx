package Week3Session1More;

class Parent {
	Parent() {
		System.out.println("Parent constructor");
	}
}
class Child extends Parent {
	Child() {
		super(); // Invokes parent constructor
		System.out.println("Child constructor");
	}
}

public class SuperInConstructor {
	public static void main(String[] args) {
		Child child = new Child();
	}
}

