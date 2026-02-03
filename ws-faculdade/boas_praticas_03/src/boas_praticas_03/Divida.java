package boas_praticas_03;

import java.util.ArrayList;


public class Divida {
    private double total;
    private double valorPago;
    private String credor;
    private Cnpj cnpjCredor;
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();

    // Única forma de adicionar pagamentos (Melhora a interface pública) 
    public void registra(Pagamento p) {
        this.pagamentos.add(p);
        this.paga(p.getValor());
    }

   

    private void paga(double valor) {
        if (valor < 0) throw new IllegalArgumentException("Valor invalido");
        if (valor > 100) valor -= 8;
        this.valorPago += valor;
    }

    public double valorAPagar() {
        return this.total - this.valorPago;
    }


    public String getCredor() { return credor; }
    public void setCredor(String credor) { this.credor = credor; }
    public Cnpj getCnpjCredor() { return cnpjCredor; }
    public void setCnpjCredor(Cnpj cnpjCredor) { this.cnpjCredor = cnpjCredor; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
    public double getValorPago() { return valorPago; }
}
