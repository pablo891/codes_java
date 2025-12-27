package exercicio_condicional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double renda, imposto;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe sua renda:");
		renda = sc.nextDouble();
		
		if(renda > 0) {
			if(renda <= 2000.0) {
				imposto = renda;
				System.out.println("Você está isento do Imposto de Renda.");
			}
			
			else {
				if(renda > 2000.0 && renda <= 3000.0) {
					imposto = renda * 0.08;
					System.out.printf("%nImposto de Renda: R$ %.2f", imposto);
				}
				
				else {
					if(renda > 3000.0 && renda <= 4500.0) {
						imposto = renda * 0.18;
						System.out.printf("%nImposto de Renda: R$ %.2f", imposto);
					}
					
					else {
						imposto = renda * 0.28;
						System.out.printf("%nImposto de Renda: R$ %.2f", imposto);
					}
				}
			}
		}
		sc.close();
	}
}
