package Week6Session3.assignment;

import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * Read a file using FileReader and then print 
 * total numbers of character in the file.
 *
 */

public class CharactesInAFile {

	public static void main(String[] args) {
		// Define the file paths for input  
		String inputFile = "input.txt";

		int countOfChar=0;
		// Reading from a text file using FileReader
		try (FileReader reader = new FileReader(inputFile)) {
			int charValue;
			System.out.println("Reading from " + inputFile + ":");
			while ((charValue = reader.read()) != -1) {
				char character = (char) charValue;
				System.out.print("*" + character + "");
				countOfChar++;
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Total number of chracter in the file=" + countOfChar);
	}
}


