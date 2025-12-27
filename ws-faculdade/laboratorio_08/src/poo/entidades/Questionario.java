package poo.entidades;

import poo.interfaces.Imprimivel;

public class Questionario extends ConteudoDigital implements Imprimivel {
	
	private int quantidadePerguntas;

	public Questionario(String titulo, int duracaoEmMinutos, int quantidadePerguntas) {
		super(titulo, duracaoEmMinutos);
		this.quantidadePerguntas = quantidadePerguntas;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcularCargaHoraria() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		
	}
	
	
}
