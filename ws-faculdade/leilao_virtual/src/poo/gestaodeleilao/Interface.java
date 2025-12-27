package poo.gestaodeleilao;

import poo.gestaodelotes.Lote;
import java.util.Scanner;
import java.util.ArrayList;

public class Interface {

    private Leilao leilao;
    private int modoAtual;

    public Interface(Leilao leilao) {
        this.leilao = leilao;
    }

    public void iniciaOperacao() {
        System.out.println("Bem-vindo ao Sistema de Leilão Virtual!");
        
        this.modoAtual = 1; 
        int opcao = this.getOpcao();

        while (opcao != 0) {
            switch (opcao) {
                
                case 1:
                    String descricao = getString("Descrição do Lote");
                    double valorMinimo = getDouble("Valor Mínimo para Lance");
                    this.leilao.adicionaLote(descricao, valorMinimo);
                    System.out.println("Lote adicionado com sucesso.");
                    break;
                    
                case 2:
                    int numeroRemover = getInt("Número do Lote a remover");
                    Lote loteRemovido = this.leilao.removeLote(numeroRemover);
                    if (loteRemovido != null) {
                        System.out.println("Lote " + numeroRemover + " removido com sucesso.");
                    } else {
                        System.out.println("Lote inexistente ou não pôde ser removido.");
                    }
                    break;
                    
                case 3:
                    System.out.println("\n Detalhes de Todos os Lotes ");
                    System.out.println(this.leilao.obtemTodosOsLotes());
                    break;
                    
                case 4:
                    int numeroConsultar = getInt("Número do Lote a consultar");
                    Lote lote = this.leilao.getLote(numeroConsultar);
                    if (lote != null) {
                        System.out.println("\n** Detalhes do Lote " + numeroConsultar + " **");
                        System.out.println(lote.toString()); 
                    } else {
                        System.out.println("Lote inexistente.");
                    }
                    break;
                    
                case 5:
                    if (this.leilao.quantidadeDeLotes() > 0) {
                        this.leilao.setAtivo(true);
                        this.modoAtual = 2;
                        System.out.println("\nLeilão Iniciado!");
                    } else {
                        System.out.println("Não é possível iniciar o leilão sem lotes cadastrados.");
                    }
                    break;
                    
                case 6:
                    int numeroLote = getInt("Número do Lote para o lance");
                    String nomeLicitante = getString("Seu nome (Licitante)");
                    double valor = getDouble("Valor do Lance");
                    
                    String resultado = this.leilao.ofertaLance(numeroLote, nomeLicitante, valor);
                    System.out.println(resultado);
                    break;
                    
                case 7:
                    String resultadoEncerramento = this.leilao.encerraLeilao();
                    System.out.println("\nLeilão Encerrado!");
                    System.out.println(resultadoEncerramento);
                    break;

                case 8:
                    System.out.println("\nLotes Não Vendidos");
                    ArrayList<Lote> naoVendidos = this.leilao.getNaoVendidos();
                    if (naoVendidos.isEmpty()) {
                        System.out.println("Todos os lotes foram vendidos!");
                    } else {
                        for (Lote loteNaoVendido : naoVendidos) {
                            System.out.println(loteNaoVendido.toString());
                            System.out.println("-----------------------------");
                        }
                    }
                    break;
                    
                default:
                    System.err.println("Opção não tratada no switch."); 
                    break;
            }
            
            opcao = this.getOpcao();
        }
        
        System.out.println("Saindo do programa.");
    }
    
    public int getOpcao() {
        int opcao;
        
        do {
            if (this.modoAtual == 1) {
                System.out.println("\n--- Modo Cadastro (Modo 1) ---");
                opcao = getInt("Opcao: 1 - Adicionar Lote, 2 - Remover Lote, 3 - Mostrar Todos os Lotes, 4 - Mostrar Lote, 5 - Iniciar Leilão, 9 - Sair do Programa");
                if (opcao < 1 || (opcao > 5 && opcao != 9)) {
                    opcao = 0;
                } else if (opcao == 5 && this.leilao.quantidadeDeLotes() == 0) {
                     System.out.println("ERRO: Não é possível iniciar o leilão sem lotes cadastrados.");
                     opcao = 0;
                }
            } 
            else {
                if (this.leilao.isAtivo()) {
                    System.out.println("\n--- Modo Leilão Ativo (Modo 2) ---");
                    opcao = getInt("Opcao: 3 - Mostrar Todos os Lotes, 4 - Mostrar Lote, 6 - Ofertar Lance, 7 - Encerrar Leilão");
                    if (opcao != 3 && opcao != 4 && opcao != 6 && opcao != 7) {
                        opcao = 0;
                    }
                } 
                else {
                    System.out.println("\n--- Modo Leilão Inativo (Modo 2) ---");
                    opcao = getInt("Opcao: 3 - Mostrar Todos os Lotes, 4 - Mostrar Lote, 8 - Mostrar Lotes não Vendidos, 9 - Sair do Programa");
                    if (opcao != 3 && opcao != 4 && opcao != 8 && opcao != 9) {
                        opcao = 0;
                    }
                }
            }
            
            if (opcao == 0) {
                System.err.println("Opção inválida. Tente novamente.");
            }
            
        } while (opcao == 0);
        
        return opcao;
    }

    public int getInt(String informacao) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite " + informacao);
    
        while (!sc.hasNextInt()) {
            System.err.println("Erro na Leitura: Por favor, digite um número inteiro.");
            String aux = sc.nextLine();
            System.out.println("Digite " + informacao);
        }
        
        int valor = sc.nextInt();
        sc.nextLine();
        return valor;
    }

    public double getDouble(String informacao) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite " + informacao);
    
        while (!sc.hasNextDouble()) {
            System.err.println("Erro na Leitura: Por favor, digite um número válido (ex: 100.0).");
            String aux = sc.nextLine();
            System.out.println("Digite " + informacao);
        }
    
        double valor = sc.nextDouble();
        sc.nextLine();
        return valor;
    }

    public String getString(String informacao) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite " + informacao);
        return sc.nextLine();
    }
}