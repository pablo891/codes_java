package poo.entidades;

public class Album extends Item {
	
	private String artista;
	private int numDeFaixas;
	
	public Album(String titulo, int tempoReprod, boolean gotIt, String comentario, String artista, int numDeFaixas) {
		super(titulo, tempoReprod, gotIt, comentario);
		this.artista = artista;
		this.numDeFaixas = numDeFaixas;
	}
	
	
}
