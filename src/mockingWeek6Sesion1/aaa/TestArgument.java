package mockingWeek6Sesion1.aaa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.Test;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.will;
public class TestArgument {
	private static final int TEST_NUMBER_OF_FLOWERS = 3;
	@Test
	public void shouldReturnTheSameValue() {
		FlowerFilter filterMock = mock(FlowerFilter.class);
		given(filterMock.filterNoOfFlowers(anyInt())).will(returnFirstArgument());
		int filteredNoOfFlowers = filterMock.filterNoOfFlowers(TEST_NUMBER_OF_FLOWERS);
		assertEquals(filteredNoOfFlowers, TEST_NUMBER_OF_FLOWERS);
	}
	//reusable answer class
	private Answer<?> returnFirstArgument() {

		return ReturnFirstArgument.returnFirstArgument();
	}
}
class ReturnFirstArgument implements Answer{
	@Override
	public Object answer(InvocationOnMock invocation) throws Throwable {
		Object[] arguments = invocation.getArguments();
		if (arguments.length == 0) {
			throw new MockitoException("Error");
		}
		return arguments[0];
	}
	public static ReturnFirstArgument returnFirstArgument()
	{
		return new ReturnFirstArgument();
	}
}


class FlowerFilter {

	int filterNoOfFlowers(int anyInt) {
		return anyInt;
	}

}