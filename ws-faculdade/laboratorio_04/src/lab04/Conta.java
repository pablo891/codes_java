package lab04;

public class Conta {
    private int numero;
    private Cliente titular;
    private int senha;
    private double saldo;
    private HistoricoDeLancamentos historico;

    public Conta(int numero, Cliente titular, int senha, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.senha = senha;
        this.saldo = saldo;
        this.historico = new HistoricoDeLancamentos(10);
    }

    private boolean senhaEhValida(int senha){
        return this.senha == senha;
    }
    
    public double verificaSaldo(int numeroConta) {
    	if(senhaEhValida(senha)) {
    		return this.saldo;
    	}
    	return -1;
    }

    public boolean creditaValor(double valor, String operacaoBancaria){
        if(valor<=0){
            System.out.println("Erro: valor para crédito deve ser positivo.");
            return false;
        }
        this.saldo += valor;
        this.historico.insereLancamento(new Lancamento(operacaoBancaria, valor));
        System.out.println("Crédito/Depósitp de R$ "+valor+ " realizado. Saldo autal: R$"+this.saldo);
        return true;
    }

    public boolean debitaValor(double valor, int senha, String operacaoBancaria){
        if (!senhaEhValida(senha) || valor > this.saldo || valor <= 0) {
            System.out.println("Erro: Senha inválida, saldo insuficiente ou valor negativo.");
            return false;
        }
        
        this.saldo -= valor;
        this.historico.insereLancamento(new Lancamento(operacaoBancaria, -valor));
        System.out.println("Débito/Saque de R$ " + valor + " realizado. Saldo atual: R$ " + this.saldo);
        return true;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado. Saldo atual: R$ " + this.saldo);
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + this.saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public int getNumero(){
        return numero;
    }

    public int getSenha(){
        return senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public HistoricoDeLancamentos getHistorico(){
        return historico;
    }
}