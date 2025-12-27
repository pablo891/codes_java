package poo.entidades;

public class Item {
	
	private String titulo;
	private int tempoReprod;
	private boolean gotIt;
	private String comentario;
	
	public Item(String titulo, int tempoReprod, boolean gotIt, String comentario) {
		this.titulo = titulo;
		this.tempoReprod = tempoReprod;
		this.gotIt = gotIt;
		this.comentario = comentario;
	}
	
	public void imprime() {
		
	}
	
}
