package Week6Session5;

public class RunnableLambdaTest {
	public static void main(String[] args) {

		// Creating a thread using an anonymous class.
		// Procedure used prior to Java 8.
		Runnable r1 = new Runnable() {
			@Override
			public void run() { // anonymous class
				System.out.println("Creating thread with Anonymous Class");
			}
		};


		// Creating a thread using Lambda Expression.
		Runnable r2 = () -> {   // lambda expression
			System.out.println("Creating thread with Java 8 Lambda Expression");
		};
		new Thread(r1).start();
		new Thread(r2).start();
	}
}
