package poo.entidades;

import poo.interfaces.Avaliavel;
import poo.interfaces.Imprimivel;

public class ArtigoTexto extends ConteudoDigital implements Imprimivel, Avaliavel {
	
	private String autor;

	public ArtigoTexto(String titulo, int duracaoEmMinutos, String autor) {
		super(titulo, duracaoEmMinutos);
		this.autor = autor;
	}

	@Override
	public void registrarAvaliacao(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getMediaAvaliacoes() {
		// TODO Auto-generated method stub
		return 0;
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
