import java.io.*;
public class JavaIOTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\sourcecodes\\tmp\\A.txt");
		int data = fis.read(); // Read a single byte
		FileOutputStream fos = new FileOutputStream("output.txt");
		
		
		while (data!=-1) {
			fos.write(data); // Write a single byte
			System.out.println(data);
			data=fis.read();
		}
		fos.close();
		fis.close();
		System.out.println("--------------------------");
	}
	static void readByChar () throws IOException {
		FileReader fr = new FileReader("C:\\sourcecodes\\tmp\\A.txt");
		int data = fr.read(); // Read a single character
		System.out.println(data);
		FileWriter fw = new FileWriter("output.txt");
		fw.write(data); // Write a single character
	}
}
