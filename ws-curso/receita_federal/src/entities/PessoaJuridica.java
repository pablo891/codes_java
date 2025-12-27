package entities;

public class PessoaJuridica extends Contribuinte{
	
	private Integer numFuncionarios;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}
	
	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	@Override
	public Double totalImposto() {
		if(this.getNumFuncionarios() > 10) {
			return super.getRendaAnual() * 0.14;
		} else {
			return super.getRendaAnual() * 0.16;
		}
	}
	
}
