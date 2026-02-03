package atividades;

import java.util.ArrayList;
import java.util.Calendar;

public class Divida {
    private double total;
    private double valorPago;
    private String credor;
    private Cnpj cnpjCredor; 
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();

    public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        this.paga(pagamento.getValor());
    }

    private void paga(double valor) {
        if (valor < 0) throw new IllegalArgumentException("Valor invalido");
        if (valor > 100) valor -= 8;
        this.valorPago += valor;
    }

    public double valorAPagar() {
        return this.total - this.valorPago;
    }

    public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
        ArrayList<Pagamento> filtrados = new ArrayList<Pagamento>();
        for (Pagamento p : this.pagamentos) {
            if (p.getData().before(data)) filtrados.add(p);
        }
        return filtrados;
    }

    public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> filtrados = new ArrayList<Pagamento>();
        for (Pagamento p : this.pagamentos) {
            if (p.getValor() > valorMinimo) filtrados.add(p);
        }
        return filtrados;
    }

    public Cnpj getCnpjCredor() {
    	return cnpjCredor; 
    	}
    
    public void setCnpjCredor(Cnpj cnpjCredor) {
    	this.cnpjCredor = cnpjCredor; 
    	}
    public String getCredor() {
    	return credor; 
    	}
    public void setCredor(String credor) {
    	this.credor = credor; 
    	}
    public double getTotal() {
    	return total; 
    	}
    public void setTotal(double total) {
    	this.total = total; 
    	}
    public double getValorPago() {
    	return valorPago; 
    	}
    public ArrayList<Pagamento> getPagamentos() {
    	return pagamentos; 
    	}
}
