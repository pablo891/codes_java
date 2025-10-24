package atividade01;


public class Pessoa {
	
	private String nome;
	private String cpf;
	
	public Pessoa(String cpf, String nome){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getCpf() {
		
		return cpf;
		
	}
	
	public String getNome() {
		
		return nome;
		
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String toString() {
		return "Nome: "	+ this.nome + "\nCPF: " + this.cpf;
	}
	
}
