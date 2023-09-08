package mockingWeek6Sesion1;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	   private String stockId;
	   private String name;	
	   private int quantity;

	   public Stock(String stockId, String name, int quantity){
	      this.stockId = stockId;
	      this.name = name;		
	      this.quantity = quantity;		
	   }

	   public String getStockId() {
	      return stockId;
	   }

	   public void setStockId(String stockId) {
	      this.stockId = stockId;
	   }

	   public int getQuantity() {
	      return quantity;
	   }

	   public String getTicker() {
	      return name;
	   }
		
	public static void main(String[] args) {
		List <Stock> lst = new ArrayList<>();
		lst.add(new Stock("2", "SBI", 10));
		lst.add(new Stock("5", "LIC", 1));
	}

}
