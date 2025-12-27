package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter value = new CurrencyConverter();
		
		
		System.out.print("What is the dollar price? ");
		double priceDollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = R$%.2f", value.totalToBePaid(priceDollar, quantity));

		sc.close();
	}

}
