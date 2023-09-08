package Week6Session3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * In this class we will read from a file using character input 
 * stream of Java. And then we will first print the data.
 * Then we will copy the data to another file.
 * 
 * In this case we read characters in stead of bytes.
 *
 */

public class CharacterIOExample {

	public static void main(String[] args) {
		// Define the file paths for input and output
		String inputFile = "input.txt";
		String outputFile = "output2.txt";

		// Reading from a text file using FileReader
		try (FileReader reader = new FileReader(inputFile)) {
			int charValue;
			System.out.println("Reading from " + inputFile + ":");
			while ((charValue = reader.read()) != -1) {
				char character = (char) charValue;
				System.out.print(character);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Writing to a text file using FileWriter
		try (FileWriter writer = new FileWriter(outputFile)) {
			String textToWrite = "Using Java Character I/O to write on file";
			System.out.println("\nWriting to " + outputFile + ":");
			writer.write(textToWrite);
			System.out.println(textToWrite);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("\nCharacter I/O operations completed.");
	}
}