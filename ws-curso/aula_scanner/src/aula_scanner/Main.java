package aula_scanner;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		String x;
		x = sc.next();
		
		System.out.println("Você digitou: " + x);
		
		// Recebendo scanner de um valor inteiro
		
		System.out.println("Digite um numero: ");
		int y;
		y = sc.nextInt();
		
		System.out.println("Você digitou: " + y);
		
		// Recebendo scanner de um valor double
		Locale.setDefault(Locale.US);
		System.out.println("Digite um numero decimal: ");
		double z;
		z = sc.nextDouble();
		
		System.out.println("Você digitou: " + z);
		
		// Recebendo scanner do tipo CHAR
		System.out.println("Digite um nome CHAR: ");
		char w;
		w = sc.next().charAt(0);
		
		System.out.println("Você digitou: " + w);
		
		sc.close();
	}

}
