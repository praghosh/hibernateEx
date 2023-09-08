package mockingWeek6Sesion1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class CalculatorTestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MathApplicationTest.class);

		System.out.println("Total number of test cases= " + result.getRunCount());

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Test is successful");
		}
		else {
			System.out.println("Test failed");
			System.out.println("Number of test cases failed= " + result.getFailureCount());
		}

	}
}  
