package package1;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormattingExample {
	public static void main(String[] args) {
		// Create a French Locale
		Locale frenchLocale = new Locale("fr", "FR");

		// Format a number using the French locale
		double number = 123456.789;
		NumberFormat numberFormat = NumberFormat.getNumberInstance(frenchLocale);
		String formattedNumber = numberFormat.format(number);
		System.out.println("Formatted number: " + formattedNumber);

		// Format currency using the French locale
		double amount = 1234.56;
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(frenchLocale);
		String formattedCurrency = currencyFormat.format(amount);
		System.out.println("Formatted currency: " + formattedCurrency);
		
		Locale koreanLocale = Locale.KOREA;
		currencyFormat=NumberFormat.getCurrencyInstance(koreanLocale);
		formattedCurrency = currencyFormat.format(amount);
		System.out.println("Formatted currency: " + formattedCurrency);
		System.out.println (Currency.getInstance( Locale.KOREA ).getCurrencyCode()); 
	}
}

