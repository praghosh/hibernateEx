package mockingWeek6Sesion1.aaa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PersonTest {

	@Test
	void testGetDisplayName() {
		//Assign
		Person person = new Person("John", "Doe");
		//Act
		String displayName = person.getDisplayName();
		//Assert
		assertEquals("Doe, John", displayName);
	}
}
