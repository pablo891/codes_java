package poo.entidades;

public class Filme extends Item {
	
	private String diretor;

	public Filme(String titulo, int tempoReprod, boolean gotIt, String comentario, String diretor) {
		super(titulo, tempoReprod, gotIt, comentario);
		this.diretor = diretor;
	}
	
	public void imprime() {
		
	}
	
}
