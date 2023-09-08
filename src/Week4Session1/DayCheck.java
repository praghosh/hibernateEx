package Week4Session1;

import java.time.Month;
import java.time.MonthDay;

public class DayCheck {

	public static void main(String[] args) {

		// Create a MonthDay object for a specific month and day
		MonthDay independenceDay = MonthDay.of(Month.AUGUST, 15);
  	  
		// Create today's  MonthDay object
		MonthDay today = MonthDay.now();
		if (today.equals(independenceDay)) {
			System.out.println("Today is Independence Day!");
		} else {
			System.out.println("Today is not Independence Day.");
		}
		if (today.isBefore(independenceDay)) {
			System.out.println("Independence day  is yet to come this year.");
		} else {
			System.out.println("Independence day was already celebrated this year.");
		}
	}
}
