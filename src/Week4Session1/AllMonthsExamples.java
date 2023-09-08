package Week4Session1;
import java.time.Month;
public class AllMonthsExamples {
		
		public static void main(String[] args) {
			 
			// Iterate over all the months
			for (Month month : Month.values()) {
				System.out.println(month);
				System.out.println("Total days=" + month.length(false));
			}
		}
 

}
