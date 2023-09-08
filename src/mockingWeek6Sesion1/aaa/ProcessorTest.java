package mockingWeek6Sesion1.aaa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

interface MyService {
	public int doSomething(String taskName);

	// Even this is an implemented method it will
	// not be called when use Mockito  with this MyService  interface
	public default int doSomething(int arg) {
		return arg + 10;
	}
}



class DataProcessor {
	private MyService myService;

	public DataProcessor(MyService myService) {
		this.myService = myService;
	}

	public String process() {
		int returnInteger = myService.doSomething("my-process-task");
		return String.format("My Integer(With String arg)  is: " + returnInteger);
	}

	public String process2(){


		int returnInteger = myService.doSomething(30);
		return String.format("My Integer (With int arg) is: " + returnInteger);
	}
}

public class ProcessorTest {

	@Test
	public void processTest() {
		MyService myService = Mockito.mock(MyService.class);
		Mockito.when(
				myService.doSomething(ArgumentMatchers.anyString())
				).thenReturn(10);

		Mockito.when(
				myService.doSomething(ArgumentMatchers.anyInt())
				).thenAnswer(invocation -> 10 + (int) invocation.getArguments()[0] );

		DataProcessor myProcessor = new DataProcessor(myService);

		// Here method is called with String Argument
		String returnedValue = myProcessor.process();
		Assertions.assertEquals(returnedValue, "My Integer(With String arg)  is: 10");

		// Here we are calling with int param.
		String returnedValue2 = myProcessor.process2();
		Assertions.assertEquals(returnedValue2, "My Integer (With int arg) is: 40");
	}
}