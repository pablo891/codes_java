package poo.entidades;

import poo.interfaces.Avaliavel;
import poo.interfaces.Reproduzivel;

public class Podcast extends ConteudoDigital implements Reproduzivel, Avaliavel {

	private String host;

	public Podcast(String titulo, int duracaoEmMinutos, String host) {
		super(titulo, duracaoEmMinutos);
		this.host = host;
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
	public void reproduzir() {
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
