package mockingWeek6Sesion1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.Test;
public class MockTestUsingDBB {
	public static final int TEST_NUMBER_OF_LEAFS = 5;
	
	@Test
	public void shouldReturnGivenValueUsingBDDSemantics() {
		//given
		Flower flowerMock = mock(Flower.class);
		given(flowerMock.getNumberOfLeafs()).willReturn(TEST_NUMBER_OF_LEAFS);
	        //when
	        int numberOfLeafs = flowerMock.getNumberOfLeafs();
	        //then
	        assertEquals(numberOfLeafs, TEST_NUMBER_OF_LEAFS);
	 }
 }