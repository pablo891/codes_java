package poo.sistema;

import lab04.Conta;
import poo.repositorio.CadastroContas;

public class Sistema {
	
	private CadastroContas bdContas;
	private Terminal terminal;
	
	public Sistema(CadastroContas bd) {
		this.bdContas = bd;
		this.terminal = new Terminal(this);
	}
	
	public double verificaSaldo(int numeroConta, int senha) {
		Conta conta = this.bdContas.buscaConta(numeroConta);
		if( conta == null) {
			return -1.0;
		}
		return conta.verificaSaldo(senha);
	}
	
	public boolean realizaSaque(int numeroConta, double valor, int senha) {
		Conta conta = this.bdContas.buscaConta(numeroConta);
		if(conta != null | !conta.debitaValor(valor, senha, "Saque")) {
			return false;
		}
		return true;
	}

}
