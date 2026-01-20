package atividade2;

public class Produto implements Comparable <Produto>{
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	@Override
	public int compareTo(Produto outro) {
		int resultado = this.nome.compareToIgnoreCase(outro.nome);
	    if (resultado != 0) {
	    	return resultado;
	    }
	    return Double.compare(this.preco, outro.preco);
	}
	
	@Override
	public String toString() {
		return "Produto: " + nome + " - Preço: R$" + preco;
	}
}
