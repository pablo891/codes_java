package poo.gestaodeleilao;

import java.util.ArrayList;

import poo.gestaodelotes.Lance;
import poo.gestaodelotes.Lote;
import poo.gestaodelotes.Pessoa;

public class Leilao {
	
	private BDLotes lotes;
	private Interface terminal;
	public boolean ativo;
	
	
	
	public Leilao() {
		this.lotes = new BDLotes();
		this.terminal = new Interface(this);
		this.ativo = ativo;
	}

	public boolean isAtivo() {
		return this.ativo;
	}
	
	public void setAtivo(boolean encerrado) {
		this.ativo = encerrado;
	}
	
	public void adicionaLote(String descricao, double valorMinimo) {
		this.lotes.adicionaLote(descricao, valorMinimo);
	}
	
	public Lote removeLote(int numero) {
		return this.lotes.removeLote(numero);
	}
	
	public int quantidadeDeLotes() {
		return this.lotes.quantidadeDeLotes();
	}
	
	public Lote getLote(int numero) {
		return this.lotes.buscaLote(numero);
	}
	
	public ArrayList<Lote> getNaoVendidos() {
	    ArrayList<Lote> lotesNaoVendidos = new ArrayList<>();
	    ArrayList<Lote> todosOsLotes = this.lotes.getTodosOsLotes();

	    for (Lote lote : todosOsLotes) {
	        if (lote.getMaiorLance() == null) {
	            lotesNaoVendidos.add(lote);
	        }
	    }

	    return lotesNaoVendidos;
	}
	
	
	public String ofertaLance(int numeroLote, String nomePessoa, double valor) {
		Lote lote = this.getLote(numeroLote);
		if(lote == null) {
			return "Lote inexistente";
		}
		
		if(lote.lancePara(new Pessoa(nomePessoa), valor)) {
			return "Lance bem sucedido";
		}
		
		return "Lote no: " + lote.getNumero() + "("
							+ lote.getDescricao() + ")"
							+ "Atualmente tem um lance de: "
							+ lote.getMaiorLance().getValor();
	}
	
	public String obtemTodosOsLotes() {
		ArrayList <Lote> lotes = this.lotes.getTodosOsLotes();
		StringBuilder todosOsLotes = new StringBuilder();
		
		for(Lote lote : lotes) {
			todosOsLotes.append(lote.toString())
			.append("\n");
		}
		return todosOsLotes.toString();	
	}
	
	public String encerraLeilao() {
	    this.setAtivo(false); 
	    ArrayList<Lote> todosOsLotes = this.lotes.getTodosOsLotes();
	    StringBuilder resultado = new StringBuilder("--- Resultado do Leilão ---\n");

	    for (Lote lote : todosOsLotes) {
	        resultado.append("Lote número: ")
	        		.append(lote.getNumero())
	                 .append("\nDescrição: ")
	                 .append(lote.getDescricao())
	                 .append("\n");

	        Lance maiorLance = lote.getMaiorLance();
	        if (maiorLance != null) {
	            resultado.append("Estado: VENDIDO\n")
	                     .append("Arrematador: ")
	                     .append(maiorLance.getLicitante().getNome())
	                     .append("\nLance Ganhador: ")
	                     .append(maiorLance.getValor())
	                     .append("\n");
	        } else {
	            resultado.append("Estado: NÃO VENDIDO\n")
	                     .append("(Nenhum lance recebido acima do valor mínimo)\n");
	        }
	        resultado.append("-----------------------------\n");
	    }

	    return resultado.toString();
	}
}
