package exc_cond_ternaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota;
		String situacao;
		
		System.out.println("Informe sua nota: ");
		
		nota = sc.nextDouble();
		
		situacao = (nota >= 7) ? "Aprovado" : "Reprovado";  
		
		System.out.printf(situacao);
		
		sc.close();
	}

}
