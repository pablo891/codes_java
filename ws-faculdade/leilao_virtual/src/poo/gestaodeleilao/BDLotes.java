package poo.gestaodeleilao;

import java.util.ArrayList;

import poo.gestaodelotes.Lote;

public class BDLotes {
	
	private ArrayList <Lote> lotes;
	private int numeroProxLote;
	
	public BDLotes() {
		this.lotes = new ArrayList <>();
		this.numeroProxLote = 1;
	}
	
	public void adicionaLote(String descricao, double valorMinimo) {
		this.lotes.add(new Lote(this.numeroProxLote, descricao, valorMinimo));
		this.numeroProxLote ++;
	}
	
	public Lote buscaLote(int numero) {
		if((numero >= 1) && (numero < this.numeroProxLote)) {
			for(Lote loteSelecionado : lotes) {
				if(loteSelecionado.getNumero() == numero) {
					return loteSelecionado;
				}
			}
		}
		
		return null;
	}
	
	public Lote removeLote(int numero) {
	    if ((numero >= 1) && (numero < this.numeroProxLote)) {
	        for (int i = 0; i < lotes.size(); i++) {
	            Lote loteSelecionado = lotes.get(i);
	            if (loteSelecionado.getNumero() == numero) {
	                return lotes.remove(i);
	            }
	        }
	    }

	    return null;
	}
	
	public ArrayList <Lote> getTodosOsLotes(){
		return (ArrayList <Lote>) this.lotes.clone();
	}
	
	public int quantidadeDeLotes() {
		return this.lotes.size();
	}
	
	
}
