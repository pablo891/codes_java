package entities;

public class PessoaFisica extends Contribuinte {
	
	private Double gastoSaude;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	public Double getGastoSaude() {
		return gastoSaude;
	}

	@Override
	public Double totalImposto() {
		if(super.getRendaAnual() < 20000) {
			if(this.getGastoSaude() > 0){
				
			return (super.getRendaAnual() * 0.15) - (0.5 * this.getGastoSaude());
			}
		} else if(super.getRendaAnual() >= 20000) {
			if(this.getGastoSaude() > 0){
				
			return (super.getRendaAnual() * 0.25) - (0.5 * this.getGastoSaude());
			}
		}
		return null;
	}
	
}
