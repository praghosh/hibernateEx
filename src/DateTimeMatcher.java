
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DateTimeMatcher {
	public static void main(String args[]){  


		//Creating the list to store dates
		List dates = new ArrayList();
		dates.add("25-12-1999");
		dates.add("25/12/1999");
		dates.add("2010-06-24 12:35:40");
		dates.add("05-02-1990 44:205:40");
		dates.add("1920-11-03 06:25:40");      
		//Regular expression to match dates
		String regex = "[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1]) (2[0-3]|[01][0-9]):[0-5][0-9]:[0-5][0-9]";
		//Compiling the regular expression
		Pattern pattern = Pattern.compile(regex);      
		//Matching each date
		for(Object date : dates) {        
			Matcher matcher = pattern.matcher((CharSequence) date);
			System.out.println(date +": "+ matcher.matches());
		} 

	}
}