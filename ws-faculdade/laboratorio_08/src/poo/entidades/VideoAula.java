package poo.entidades;

import poo.interfaces.Avaliavel;
import poo.interfaces.Reproduzivel;

public class VideoAula extends ConteudoDigital implements Reproduzivel, Avaliavel {
	
	private String professor;

	public VideoAula(String titulo, int duracaoEmMinutos, String professor) {
		super(titulo, duracaoEmMinutos);
		this.professor = professor;
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
