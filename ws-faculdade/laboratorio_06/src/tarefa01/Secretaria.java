package tarefa01;

public class Secretaria extends Funcionario {
	
	private int ramal;
	
	public Secretaria(String nome, double salario, int ramal) {
		super(nome, salario);
		this.ramal = ramal;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	@Override 
	public String mostraDados() {
		StringBuilder dados = new StringBuilder();
		
		dados.append("Nome: " + this.getNome())
			.append("\n")
			.append("Salário: ")
			.append(super.getSalario())
			.append("\n")
			.append("Bonificação: ")
			.append(super.calculaBonificacao())
			.append("\nRamal: ")
			.append(this.getRamal());
		
		return dados.toString();
	}
}
