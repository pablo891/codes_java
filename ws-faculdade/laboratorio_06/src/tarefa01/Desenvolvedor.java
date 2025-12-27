package tarefa01;

public class Desenvolvedor extends Funcionario {
	
	private int estacaoDeTrabalho;

	public Desenvolvedor(String nome, double salario, int estacaoDeTrabalho) {
		super(nome, salario);
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}

	public int getEstacaoDeTrabalho() {
		return estacaoDeTrabalho;
	}

	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
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
			.append("\nEstação de Trabalho: ")
			.append(this.getEstacaoDeTrabalho());
		
		return dados.toString();
	}
}
