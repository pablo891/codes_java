public class Conta {
    private int numero;
    private String titular;
    private int senha;
    private double saldo;

    public static class Conta(int num, String nome, int pwd, double valor) {
        this.numero = num;
        this.titular = nome;
        this.senha = pwd;
        this.saldo = valor;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double verificaSaldo (int senha){
        if (senhaCorreta(senha)){
            return this.saldo;
        }
        return -1;
    }

    public boolean creditaValor (double valor){
        if (valor >= 0){
            this.saldo += valor;
        }

        return true;
    }

    public boolean debitaValor(double valor, int senha){
        if (senhaCorreta(senha) && valor <= this.saldo &&  valor > 0){
            this.saldo -= valor;
            return true;
        }

        return false;
    }

    private boolean senhaCorreta(int senha){
        if (senha == this.senha){
            return true;
        }
        return false;
    }

}
