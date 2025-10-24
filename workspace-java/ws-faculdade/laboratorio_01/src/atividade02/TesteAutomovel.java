package atividade02;

import java.util.Locale;
import java.util.Scanner;

public class TesteAutomovel {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Automovel automovel = new Automovel("PTY5B23", 50.0, 10.0);
		
		System.out.print("Informe a quantidade de litros a ser abastecida: ");
		double quantidade = sc.nextDouble();
		
		System.out.println("Autonomia: " + automovel.autonomia() + "Km");
		System.out.println("Consumo médio: " + automovel.getEficiencia() + "Km/L");
		System.out.println("Distância Percorrida: " + automovel.getKmTotal() + "Km");
		
		automovel.abastece(quantidade);
		
		System.out.printf("%nCombustível no tanque: %.2f litros%n", automovel.getCombustivelNoTanque());

		automovel.dirige(400.0);
		
		System.out.printf("%nCombustível no tanque: %.2f litros%n", automovel.getCombustivelNoTanque());
		System.out.printf("%nViagens realizadas: %d", automovel.getNumeroDeViagensRealizadas());
		System.out.printf("%nQuilometragem Total: %.2f", automovel.getKmTotal());
		
		automovel.dirige(150.0);
		
		System.out.printf("%nQuilometragem Total: %.2f%n", automovel.getKmTotal());
		
		System.out.println("----- Informações de desempenho -----");
		
		System.out.println("Autonomia: " + automovel.autonomia() + "Km");
		System.out.println("Consumo médio: " + automovel.getEficiencia() + "Km/L");
		System.out.println("Distância Percorrida: " + automovel.getKmTotal() + "Km");
		
		sc.close();
	}

}
