package tarefa01;

public class Funcionario {

	private String nome;
	private double salario;
	public static double valeRefeicaoDiario = 15.0;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double reajustaValeRefeicaoDiario() {
		return valeRefeicaoDiario *= 1.05;
	}
	
	public double getValeRefeicaoDiario() {
		return valeRefeicaoDiario;
	}
	
	public double calculaBonificacao() {
		return salario *= 0.1; 
	}
	
	public String mostraDados() {
		StringBuilder dados = new StringBuilder();
		
		dados.append("Nome: " + this.getNome())
			.append("\n")
			.append("Salário: ")
			.append(this.getSalario())
			.append("\n")
			.append("Bonificação: ")
			.append(this.calculaBonificacao());
		
		return dados.toString();
	}
}
