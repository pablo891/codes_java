package testecaixaeletronico;

import poo.gestaodecontas.Cliente;
import poo.gestaodecontas.Conta;
import poo.repositorio.CadastroContas;

public class TesteCaixaEletronico {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("68101292720", "Julio dos Santos");
		Cliente cl2 = new Cliente("63191301213", "Pablo Nascimento");
		Cliente cl3 = new Cliente("63173183941", "Thaynara Barcelos");
		
		Conta conta1 = new Conta(001, 0120, cl1, 650.0);
		Conta conta2 = new Conta(002, 0321, cl2, 1000.0);
		Conta conta3 = new Conta(003, 0123, cl3, 1500.0);
		
		CadastroContas bd = new CadastroContas();
		
		bd.insereConta(conta1);
		bd.insereConta(conta2);
		bd.insereConta(conta3);
		
        System.out.println("Teste de Sistema Bancário:");

        
        System.out.println("Saldos iniciais:");
        System.out.println("Conta " + conta1.getNumero() + " (" + cl1.getNome() + "): R$ " + conta1.getSaldo());
        System.out.println("Conta " + conta2.getNumero() + " (" + cl2.getNome() + "): R$ " + conta2.getSaldo());
        System.out.println("Conta " + conta3.getNumero() + " (" + cl3.getNome() + "): R$ " + conta3.getSaldo());
        
        
        System.out.println("Depósito em Dinheiro");
        conta1.depositarDinheiro(500.00);
        conta2.depositarDinheiro(300.00);
        System.out.println("Novo saldo conta1: R$ " + conta1.getSaldo());
        System.out.println("Novo saldo conta2: R$ " + conta2.getSaldo());
        
        System.out.println("\nDepósito em Cheque");
        conta3.depositarCheque(800.00);
        conta1.depositarCheque(250.00);
        System.out.println("Novo saldo conta 3: R$ " + conta3.getSaldo());
        System.out.println("Novo saldo conta 1: R$ " + conta1.getSaldo());

        System.out.println("Teste de transferências Pix:");
        
        System.out.println("PIX de " + cl1.getNome() + " para " + cl2.getNome());
        System.out.println("Saldo antes - conta 1: R$ " + conta1.getSaldo());
        System.out.println("Saldo antes - conta 2: R$ " + conta2.getSaldo());
        conta1.pix(conta2, 400.00);
        System.out.println("Saldo depois - conta1: R$ " + conta1.getSaldo());
        System.out.println("Saldo depois - conta2: R$ " + conta2.getSaldo());
        
        
        System.out.println("  TESTANDO TRANSFERÊNCIAS - TED");
        
        System.out.println("TED de " + cl2.getNome() + " para " + cl3.getNome());
        System.out.println("Saldo antes - conta2: R$ " + conta2.getSaldo());
        System.out.println("Saldo antes - conta3: R$ " + conta3.getSaldo());
        conta2.ted(conta3, 500.00);
        System.out.println("Saldo depois - conta2: R$ " + conta2.getSaldo());
        System.out.println("Saldo depois - conta3: R$ " + conta3.getSaldo());
        
        System.out.println("\nTED de " + cl1.getNome() + " para " + cl2.getNome());
        System.out.println("Saldo antes - conta1: R$ " + conta1.getSaldo());
        System.out.println("Saldo antes - conta2: R$ " + conta2.getSaldo());
        conta1.ted(conta2, 300.00);
        System.out.println("Saldo depois - conta1: R$ " + conta1.getSaldo());
        System.out.println("Saldo depois - conta2: R$ " + conta2.getSaldo());
        
        System.out.println("TESTANDO SAQUES");
        

        conta1.debitaValor(200.00, 0120, "Saque");
        System.out.println("Saldo depois: R$ " + conta1.getSaldo());
        
        conta3.debitaValor(400.00, 0123, "Saque");
        System.out.println("Saldo depois: R$ " + conta3.getSaldo());
        
        System.out.println("Extrato Bancário - " + cl1.getNome());
        conta1.consultarExtratoBancario();
        
        System.out.println("Extrato Bancário - " + cl2.getNome());
        conta2.consultarExtratoBancario();
        
        System.out.println("Extrato Bancário - " + cl3.getNome());
        conta3.consultarExtratoBancario();
        
        System.out.println(" -- EXTRATOS COMPLETOS --");
        
        conta1.exibirExtrato();
        conta2.exibirExtrato();
        conta3.exibirExtrato();
        
        
    	}
		
	}
