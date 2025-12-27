package tarefa01;

public class Gerente extends Funcionario {
	
	private String usuario;
	private String senha;
	
	public Gerente(String nome, double salario, String usuario, String senha) {
		super(nome, salario);
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override 
	public double calculaBonificacao() {
		return super.getSalario() + 500;
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
			.append(this.calculaBonificacao())
			.append("\nUsuário: ")
			.append(this.getUsuario());
		
		return dados.toString();
	}
	
}
