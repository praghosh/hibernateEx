package mockingWeek6Sesion1.assignment;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

// A service that performs  power of a number
interface ScientificCalculatorService {
	public double xToThePowerY(double input1, double input2);	 
}

// A class that uses ScientificCalculatorService 
class MathOperation {
	private ScientificCalculatorService calcService;

	public void setCalculatorService(ScientificCalculatorService calcService){
		this.calcService = calcService;
	}

	public double xToThePowerY(double input1, double input2){
		return calcService.xToThePowerY(input1, input2);		
	}
  
}

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {

	private MathOperation mathApplication;
	private ScientificCalculatorService calcService;

	@Before
	public void setUp(){
		mathApplication = new MathOperation();
		calcService = mock(ScientificCalculatorService.class);
		mathApplication.setCalculatorService(calcService);
	}


	@Test
	public void testPower(){
		System.out.println("Running Addition Test");
		//add the behavior to add numbers
		when(calcService.xToThePowerY(10.0,2)).thenReturn(100.0);

		//test the power functionality
		assertEquals(mathApplication.xToThePowerY(10.0, 2),100.0,0.0000001);

		//verify call to calcService is made or not
		verify(calcService).xToThePowerY(10.0,2.0);
				
	}
 
}

