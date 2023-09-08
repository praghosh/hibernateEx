import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
	public static void main(String[] args) {
		Person person = null;

		try (FileInputStream fileIn = new FileInputStream("C:\\sourcecodes\\tmp\\SeriealizedPerson.txt");
				ObjectInputStream in = new ObjectInputStream(fileIn)) {
			person = (Person) in.readObject();
			System.out.println("Deserialized data: " + person.getName() + " (" + person.getAge() + ")");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
