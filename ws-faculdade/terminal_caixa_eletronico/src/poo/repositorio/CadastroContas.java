package poo.repositorio;

import java.util.Arrays;

import poo.gestaodecontas.Conta;


public class CadastroContas {
	private Conta[] contas;
	private int ultimaConta;
	
	public CadastroContas() {
		this.contas = new Conta[10];
	}
	
	public Conta buscaConta(int numero) {
		for(int i = 0; i < this.ultimaConta; i++) {
			if (numero == this.contas[i].getNumero()) {
				return this.contas[i];
			}
		}
		return null;
	}
	
	public boolean insereConta(Conta conta) {
		
		if(this.buscaConta(conta.getNumero()) != null) {
			return false;
		}
		
		if(this.ultimaConta == this.contas.length) {
			this.contas = Arrays.copyOf(this.contas, 2*this.contas.length);
		}
		
		this.contas[this.ultimaConta++] = conta;
		return true;
		
	}
}
