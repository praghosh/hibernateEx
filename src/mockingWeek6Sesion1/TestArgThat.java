package mockingWeek6Sesion1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.given;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;
public class TestArgThat {
	public static final int TEST_NUMBER_OF_LEAFS = 5;
	public static final int TEST_NUMBER_OF_PLANTS_SCHEDULED=20;
	LocalTime tenThirty = LocalTime.parse("10:30");
	 
	@Test 
	public void test () {

		WateringScheduler schedulerMock = mock(WateringScheduler.class);
		given(schedulerMock.getNumberOfPlantsScheduledOnDate(
				argThat(haveHourFieldEqualTo(10)))).willReturn(TEST_NUMBER_OF_PLANTS_SCHEDULED);

		//when
		int numberOfLeafs = schedulerMock.getNumberOfPlantsScheduledOnDate(
				 tenThirty);
		//then
		assertEquals(numberOfLeafs, TEST_NUMBER_OF_PLANTS_SCHEDULED);

	}
	private ArgumentMatcher haveHourFieldEqualTo(final int hour) {
		return new ArgumentMatcher<Object>() {
			@Override
			public boolean matches(Object argument) {
				LocalTime time = (LocalTime) argument;
				return (time.getHour() == hour);
			}
		};

	}
	
}
class WateringScheduler {
	public Integer getNumberOfPlantsScheduledOnDate(Object argThat) {
		// TODO Auto-generated method stub
		return 100;
	}
}
