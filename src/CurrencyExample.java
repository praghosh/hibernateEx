
import java.util.Currency;
import java.util.Locale;

public class CurrencyExample {
	public static void main(String[] args) {
		Currency usdCurrency = Currency.getInstance("USD");
		System.out.println(usdCurrency.getDisplayName(Locale.US)); // Output: US Dollar
		System.out.println(usdCurrency.getSymbol(Locale.US)); // Output: $

		Currency euroCurrency = Currency.getInstance("EUR");
		System.out.println(euroCurrency.getDisplayName(Locale.GERMANY)); // Output: Euro
		System.out.println(euroCurrency.getSymbol(Locale.GERMANY)); // Output: €
	}
}
