package mockingWeek6Sesion1;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

interface BankService {
	
}

// A service that performs add, subtract, multiply and delete
interface CalculatorService {
	public double add(double input1, double input2);
	public double subtract(double input1, double input2);
	public double multiply(double input1, double input2);
	public double divide(double input1, double input2);
}

class MathOperation {
	private CalculatorService calcService;

	public void setCalculatorService(CalculatorService calcService){
		this.calcService = calcService;
	}

	public double add(double input1, double input2){
		return calcService.add(input1, input2);		
	}

	public double subtract(double input1, double input2){
		return calcService.subtract(input1, input2);
	}

	public double multiply(double input1, double input2){
		return calcService.multiply(input1, input2);
	}

	public double divide(double input1, double input2){
		return calcService.divide(input1, input2);
	}
}

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {

	private MathOperation mathApplication;
	private CalculatorService calcService;

	@Before
	public void setUp(){
		mathApplication = new MathOperation();
		calcService = mock(CalculatorService.class);
		mathApplication.setCalculatorService(calcService);
	}


	@Test
	public void testAdd(){
		System.out.println("Running Addition Test");
		//add the behavior to add numbers
		when(calcService.add(20.0,10.0)).thenReturn(30.0);

		//test the add functionality
		Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);

		//verify call to calcService is made or not
		verify(calcService).add(20.0,10.0);
		
		
	}

	@Test
	public void testSubtract(){

		System.out.println("Running Subtraction Test");
		//subtract the behavior to subtract numbers
		when(calcService.subtract(20.0,10.0)).thenReturn(10.0);

		//test the subtract functionality
		Assert.assertEquals(mathApplication.subtract(20.0, 10.0),10.0,0);

		//verify call to calcService is made or not
		verify(calcService).subtract(20.0,10.0);
	}
}
