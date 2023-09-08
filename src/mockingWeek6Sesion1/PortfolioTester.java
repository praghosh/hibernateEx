package mockingWeek6Sesion1;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PortfolioTester {

	public static final int TEST_VALUE_OF_THESTOCKS = 222000;

	@Test
	public void shouldReturnGivenValueUsingBDDSemantics() {	
		//Create a portfolio object which is to be tested		
		Portfolio portfolio = new Portfolio();

		//Creates a list of stocks to be added to the portfolio
		List<Stock> stocks = new ArrayList<Stock>();
		Stock sbiStock = new Stock( "1" ,"SBI", 100);
		Stock microsoftStock = new Stock( "2","TCS",50);

		stocks.add(sbiStock);
		stocks.add(microsoftStock);		

		//Create the mock object of stock service
		StockService stockServiceMock = mock(StockService.class);

		// mock the behavior of stock service to return the value of various stocks
		when(stockServiceMock.getPrice(sbiStock)).thenReturn(570.00);
		when(stockServiceMock.getPrice(microsoftStock)).thenReturn(3300.00);

		//add stocks to the portfolio
		portfolio.setStocks(stocks);

		//set the stockService to the portfolio
		portfolio.setStockService(stockServiceMock);

		double marketValue = portfolio.getMarketValue();

		assertEquals(marketValue, TEST_VALUE_OF_THESTOCKS);


	}
}