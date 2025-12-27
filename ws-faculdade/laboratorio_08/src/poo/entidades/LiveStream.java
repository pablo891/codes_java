package poo.entidades;

import poo.interfaces.Avaliavel;
import poo.interfaces.ChatAoVivo;
import poo.interfaces.Reproduzivel;

public class LiveStream extends ConteudoDigital implements Reproduzivel, Avaliavel, ChatAoVivo {

	private String apresentador;

	public LiveStream(String titulo, int duracaoEmMinutos, String apresentador) {
		super(titulo, duracaoEmMinutos);
		this.apresentador = apresentador;
	}

	@Override
	public void enviarMensagemChat(String mensagem) {
		// TODO Auto-generated method stub
		
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
