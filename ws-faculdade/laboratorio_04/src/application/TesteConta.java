package application;

import lab04.Cliente;
import lab04.Conta;
import poo.repositorio.CadastroContas;
import poo.sistema.Sistema;
import poo.sistema.Terminal;

public class TesteConta {
    public static void main(String[] args){
        System.out.println("--- Teste de Agregação, Composição e Delegação ---");
        
        
        Cliente c1 = new Cliente("Pablo Nascimento", "123.456.789-00");
        System.out.println("\n1. Objeto Cliente criado: " + c1.toString());
        
        CadastroContas bd = new CadastroContas();

        Conta contaDoPablo = new Conta(1001, c1, 4567, 1500.00);
        System.out.println("\n2. Objeto Conta criado, agregado ao Cliente e composto por HistoricoDeLancamentos.");
        
        bd.insereConta(contaDoPablo);
        
        
        
     /*   contaDoPablo.creditaValor(500.00, "Depósito em Dinheiro");
        
        contaDoPablo.debitaValor(100.00, 4567, "Saque em Terminal");

        contaDoPablo.debitaValor(50.00, 1234, "Tentativa de Saque"); 

        contaDoPablo.creditaValor(250.00, "Transferência PIX Recebida");

        System.out.println("\nTitular da conta " + contaDoPablo.getTitular().getNome() + " | Saldo Final: R$ " + contaDoPablo.getSaldo());

        contaDoPablo.getHistorico().imprimirHistorico();

        System.out.println("\n6. Fim do teste. Se esta conta fosse encerrada, o Histórico também seria 'encerrado' (Composição).");
    */
        
        Terminal meuTerminal = new Terminal(new Sistema(bd));
        
        meuTerminal.iniciaOperacao();
    
    
    }
}
