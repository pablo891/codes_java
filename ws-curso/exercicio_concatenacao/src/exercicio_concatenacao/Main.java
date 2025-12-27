package exercicio_concatenacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String product = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, wich price is $ %.2f %n", product, price1);
		System.out.printf("%s, wich price is %.2f %n", product2, price2);
		
		System.out.printf("%n%d years old, code %d and gender %c %n", age, code, gender);
		
		System.out.printf("%nMeasure with eight decimal places: %f %n", measure);
		System.out.printf("Rouded (three decimal places): %.3f %n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %f", measure);

	}

}
