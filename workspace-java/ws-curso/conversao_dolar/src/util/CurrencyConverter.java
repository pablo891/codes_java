package util;

public class CurrencyConverter {
	public  double totalToBePaid(double priceDollar, double quantity) {
		return (priceDollar * quantity) * 1.06;
	}
}
