package mockingWeek6Sesion1.aaa;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
//with constructor: PlantWaterer(WaterSource waterSource,
// WateringScheduler wateringScheduler) {...}
public class MockInjectingTest {
	@Mock
	private WaterSource waterSourceMock;
	@Spy
	private WateringScheduler wateringSchedulerSpy;
	@InjectMocks
	private PlantWaterer plantWaterer;

	//	@BeforeAll
	//	public static void init() {
	//		MockitoAnnotations. openMocks();
	//		//MockitoAnnotations.initMocks(this);
	//	}

	@BeforeEach
	void initService() {
		AutoCloseable closeable = MockitoAnnotations.openMocks(this);
	}
	@Test
	public void shouldInjectMocks() {
		assertNotNull(plantWaterer.getWaterSource());
		assertNotNull(plantWaterer.getWateringScheduler());
	}
}
class PlantWaterer {
	public WaterSource getWaterSource() {
		// TODO Auto-generated method stub
		return new WaterSource();
	}
	public WateringScheduler getWateringScheduler() {
		// TODO Auto-generated method stub
		return new WateringScheduler ();
	}

}

class  WaterSource {

}
class  WateringScheduler {

}