package ajpPretest;


class Parent {public void display() {
	System.out.println("Parent class");
}
}

class Child extends Parent {
	public void display() {
		System.out.println("Child class");
	}
}

public class Main {
	public static void main(String[] args) {
		
		System.out.println("sample".substring(2, 4) );
		Parent obj = new Child();
		obj.display();
	}
}
 