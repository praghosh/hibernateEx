package Week4Session1;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
public class LocalDateTimeTest
{

	public static void main(String[] args) {
		
		// We can create a DateTime object with the current time.
		LocalDateTime rightNow = LocalDateTime.now(); 
		System.out.println("Current datetime : " + rightNow); 
		
		// We can also use LocalDateTime.of() method to create a new Date Time.
		// LocalDateTime.of() method is a factory method to  create 
		// LocalDateTime  with specific date and time 
		LocalDateTime aSampleDateTime = LocalDateTime.of(2015, Month.JULY, 17, 19, 25, 40); 
		System.out.println("Sample datetime : " + aSampleDateTime);

		 
		
		
	 
		// Formatting a date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String formattedDate = rightNow.format(formatter);
		System.out.println("Formatted current time is " + formattedDate);  
		
		formattedDate=aSampleDateTime.format(formatter);
		System.out.println("Formatted sample Date Time is  " + formattedDate);  
	}
}


