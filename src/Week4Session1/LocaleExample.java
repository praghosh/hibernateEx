package Week4Session1;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleExample {

	public static void main(String[] args) {

		Locale italianLocale = Locale.ITALY;
		Locale koreanLocale = Locale.KOREA;
 
		// Format a number using the Italian locale
		double number = 123456.78;
		System.out.println("The number is " + number);
		NumberFormat numberFormat = NumberFormat.getNumberInstance(italianLocale);
		String formattedNumber = numberFormat.format(number);
		System.out.println("Formatted number in Italian Locale: " + formattedNumber);
		
		
		// Format currency using the Korean  locale
		double amount =  123456.78;
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(koreanLocale);
		String formattedCurrency = currencyFormat.format(amount);
		System.out.println("Formatted currency in Korean Locale: " + formattedCurrency);

	}
}
