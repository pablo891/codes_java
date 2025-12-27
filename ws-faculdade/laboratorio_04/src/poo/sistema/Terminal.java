package poo.sistema;

import java.util.Scanner;

public class Terminal {

	private Sistema meuSistema;
	
	public Terminal(Sistema sistema) {
		this.meuSistema = sistema;
	}
	
	public void iniciaOperacao() {
		
		int opcao;
		
		opcao = getOpcao();
		while(opcao != 3) {
			switch(opcao) {
			case 1: double saldo = this.meuSistema.verificaSaldo(getInt("Numero da Conta: "), getInt("Senha: "));
				if (saldo != -1.0) {
					System.out.println("O saldo é " + saldo);
				} else {
					System.err.println("Operação não realizada");
				}
				break;
			
			case 2: 
				if(this.meuSistema.realizaSaque(getInt("Numero da conta: "),
				getDouble("Valor"), getInt("Senha: "))) {
					System.out.println("Saque realizado!");
					
				} else {
				System.err.println("Operação não realizada.");
				}
				break;
				
			default:
				System.err.println("Inválido.");
			
				
			}
		}
		
	}
	
	public int getOpcao() {
		int opcao;
		
		opcao = getInt("Opcao: 1 - Ver o saldo; 2 - Saque; 3 - Sair");
		
		
		do {
		opcao = getInt("Opcao: 1 - Ver o saldo; 2 - Saque; 3 - Sair");
		if(opcao != 1 & opcao != 2 & opcao!= 3) {
			opcao = 0;
			}
		} while (opcao == 0);
		return opcao;
	}
	
	public int getInt(String informacao) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite " + informacao);
		while(!sc.hasNextInt()) {
			System.err.println("Erro na Leitura.");
			String aux = sc.nextLine();
			System.out.println("Digite " + informacao);
		}
		
		return sc.nextInt();
	}
	
	public double getDouble(String informacao) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite " + informacao);
		while(!sc.hasNextDouble()) {
			System.err.println("Erro na Leitura.");
			String aux = sc.nextLine();
			System.out.println("Digite " + informacao);
		}
		
		return sc.nextDouble();
	}
}
