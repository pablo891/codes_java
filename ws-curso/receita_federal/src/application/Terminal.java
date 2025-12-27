package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Terminal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Contribuinte> contribuinte = new ArrayList<>();
		
		System.out.print("Informe o número de contribuintes: ");
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do contribuinte #:" + i);
			System.out.print("Pessoa Física ou Jurídica (F/J)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			
			if(ch == 'F') {
				System.out.println("Gastos com saúde: ");
				double gastoSaude = sc.nextDouble();
				
				Contribuinte cont = new PessoaFisica(nome, rendaAnual, gastoSaude);
				contribuinte.add(cont);
			} else if(ch == 'J') {
				System.out.println("Números de Funcionários: ");
				int numFuncionarios = sc.nextInt();
				
				Contribuinte cont = new PessoaJuridica(nome, rendaAnual, numFuncionarios);
				contribuinte.add(cont);
			}
		}
		
		System.out.println();
		System.out.println("Contribuintes:");
		
		double soma = 0.0;
		for(Contribuinte lista : contribuinte) {
			System.out.println(lista.getNome() + ": $ " + String.format("%.2f", lista.totalImposto()));
			soma += lista.totalImposto();
		}
		
		System.out.printf("Total de impostos: %.2f", soma);
		
		sc.close();
	}	
}
