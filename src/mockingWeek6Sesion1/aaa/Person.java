package mockingWeek6Sesion1.aaa;

public class Person {
	private final String givenName;
	private final String surname;

	Person(String givenName, String surname) {
		this.givenName = givenName;
		this.surname = surname;
	}

	String getDisplayName() {
		return surname + ", " + givenName;
	}
}
