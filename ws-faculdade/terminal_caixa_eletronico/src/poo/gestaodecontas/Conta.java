package poo.gestaodecontas;

public class Conta {

	private int numero;
	private int senha;
	private Cliente titular;
	private double saldo;
	private HistoricoDeLancamentos historico;
	
	public Conta(int numero, int senha, Cliente titular, double saldo) {
		this.numero = numero;
		this.senha = senha;
		this.titular = titular;
		this.saldo = saldo;
		this.historico = new HistoricoDeLancamentos(10);
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public double verificaSaldo(int senha) {
		
		if (senhaEhValida(senha)) {
			return this.saldo;
		}
		
		return -1;
	}
	
	public boolean debitaValor(double valor, int senha, String operacaoBancaria) {
		
		if (!senhaEhValida(senha) | valor > this.saldo | valor < 0) {
			return false;
		}
		
		this.saldo -= valor;
		this.historico.insereLancamento(new Lancamento(operacaoBancaria, -valor));
		
		return true;
	}
	
	public boolean depositarDinheiro(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor inválido para depósito em dinheiro!");
            return false;
        }
        
        this.saldo += valor;
        Lancamento lancamento = new Lancamento("Depósito em Dinheiro", valor);
        this.historico.insereLancamento(lancamento);
        System.out.println("Depósito em dinheiro realizado com sucesso!");
        return true;
    }

	public boolean depositarCheque(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor inválido para depósito em cheque!");
            return false;
        }
        
        this.saldo += valor;
        Lancamento lancamento = new Lancamento("Depósito em Cheque", valor);
        historico.insereLancamento(lancamento);
        System.out.println("Depósito em cheque realizado com sucesso!");
        return true;
    }
	
    public boolean pix(Conta destino, double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor inválido para PIX!");
            return false;
        }
        
        if (this.saldo < valor) {
            System.out.println("Erro: Saldo insuficiente para realizar PIX!");
            return false;
        }
        
        this.saldo -= valor;
        Lancamento lancamentoDebito = new Lancamento(
            "PIX enviado para conta " + destino.getNumero(), 
            -valor
        );
        this.historico.insereLancamento(lancamentoDebito);
        
        destino.saldo += valor;
        Lancamento lancamentoCredito = new Lancamento(
            "PIX recebido da conta " + this.numero, 
            valor
        );
        destino.historico.insereLancamento(lancamentoCredito);
        
        System.out.println("PIX realizado com sucesso!");
        return true;
    }
    
    public boolean ted(Conta destino, double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor inválido para TED!");
            return false;
        }
        
        if (this.saldo < valor) {
            System.out.println("Erro: Saldo insuficiente para realizar TED!");
            return false;
        }
        
        this.saldo -= valor;
        Lancamento lancamentoDebito = new Lancamento(
            "TED enviada para conta " + destino.getNumero(), 
            -valor
        );
        this.historico.insereLancamento(lancamentoDebito);
        
        destino.saldo += valor;
        Lancamento lancamentoCredito = new Lancamento(
            "TED recebida da conta " + this.numero, 
            valor
        );
        destino.historico.insereLancamento(lancamentoCredito);
        
        System.out.println("TED realizada com sucesso!");
        return true;
    }

		
	public boolean creditaValor(double valor, String operacaoBancaria) {
		
		if (valor < 0) {
			return false;
		}
		
		this.saldo += valor;
		this.historico.insereLancamento(new Lancamento(operacaoBancaria, valor));
		
		return true;
	}
		
	private boolean senhaEhValida(int senha) {
		return this.senha == senha;
	}
	
    public void consultarExtratoBancario() {
        System.out.println("\nEXTRATO BANCÁRIO");
        System.out.println("Conta: " + numero);
        System.out.println("Titular: " + titular.getNome());
        System.out.println("\nÚltimas Operações ");
        System.out.println(historico.geraHistoricoDeLancamentos());
        System.out.println("Saldo Atual: R$ " + String.format("%.2f", saldo));
    }
    
    public void exibirExtrato() {
        System.out.println("\nEXTRATO COMPLETO");
        System.out.println("Conta: " + numero);
        System.out.println("Titular: " + titular.getNome());
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
        System.out.println("\nHistórico de lançamentos:");
        System.out.println(historico.geraHistoricoDeLancamentos());
    }
    
    @Override
    public String toString() {
        return "Conta: " + numero + " | Titular: " + titular + " | Saldo: R$ " + 
               String.format("%.2f", saldo);
    }
	
}
