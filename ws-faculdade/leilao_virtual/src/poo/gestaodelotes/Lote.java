package poo.gestaodelotes;

public class Lote {
	
	private int numero;
	private String descricao;
	private double valorMinimo;
	private Lance maiorLance;
	
	public Lote(int numero, String descricao, double valorMinimo) {
		this.numero = numero;
		this.descricao = descricao;
		this.valorMinimo = valorMinimo;
	}

	public int getNumero() {
		return numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public Lance getMaiorLance() {
		return maiorLance;
	}
	
	public boolean lancePara(Pessoa licitante, double valor) {
		
		if(valor >= this.valorMinimo && (this.maiorLance == null || (this.maiorLance.getValor() < valor))) {
			this.maiorLance = new Lance(licitante, valor);
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		StringBuilder lote = new StringBuilder();
		
		lote.append("Lote numero: ")
					.append(this.numero)
					.append("\n")
					.append(this.descricao);
		
		Lance melhorLance = this.getMaiorLance();
		
		if(melhorLance != null) {
			lote.append("Lance: " + melhorLance.getValor());
		}
		
		else {
			lote.append(" (Nenhum lance)");
		}
		
		lote.append("\n");
		return lote.toString();
	}
	
}
