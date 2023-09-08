package mockingWeek6Sesion1.simple;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
}

class CalculatorService {
	private Calculator calculator;

	public CalculatorService(Calculator calculator) {
		this.calculator = calculator;
	}

	public int performAddition(int a, int b) {
		return calculator.add(a, b);
	}
}


public class CalculatorServiceTest {
	@Test
	public void testPerformAddition() {
		// Create a mock for the Calculator class
		Calculator calculatorMock = mock(Calculator.class);

		// Stub the add method of the calculator mock
		when(calculatorMock.add(5, 3)).thenReturn(8);

		// Create an instance of CalculatorService with the mock
		CalculatorService calculatorService = new CalculatorService(calculatorMock);

		// Call the performAddition method of CalculatorService
		int result = calculatorService.performAddition(5, 3);

		// Verify that the add method of the mock was called with the expected arguments
		verify(calculatorMock).add(5, 3);

		// Verify the result
		assertEquals(8, result);
	}
}