package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int idade;
		String nome;
		double saldo;
		
		idade = 19;
		nome = "Pablo";
		saldo = 200.0;
		
		Locale.setDefault(Locale.US);
		System.out.printf("Olá, eu sou o %s, tenho %d anos e tenho %.2f reais na conta.", nome, idade, saldo);

	}

}
