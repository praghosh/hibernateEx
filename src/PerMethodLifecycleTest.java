import org.junit.jupiter.api.AfterAll;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PerMethodLifecycleTest {
	public PerMethodLifecycleTest() {
		System.out.println("Constructor");
	}
	@BeforeAll
	static void beforeTheEntireTestFixture() {
		System.out.println("Before the entire test fixture");
	}
	@AfterAll
	static void afterTheEntireTestFixture() {
		System.out.println("After the entire test fixture");
	}
	
	@BeforeClass 
	 void runBeforeClass () {
		
		System.out.println("Before Class");
	}
	
	@Test
	void test1 () {
		
		System.out.println("Test1");
	}
	@BeforeEach
	void beforeEachTest() {
		System.out.println("Before each test");
	}
	@AfterEach
	void afterEachTest() {
		System.out.println("After each test");
	}
	@Test
	void firstTest() {
		System.out.println("First test");
	}
	@Test
	void secondTest() {
		System.out.println("Second test");
	}
}