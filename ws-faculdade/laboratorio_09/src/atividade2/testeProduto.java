package atividade2;

public class testeProduto {
    public static void main(String[] args) {
        CatalogoProdutos catalogo = new CatalogoProdutos();

        catalogo.adicionarProduto("Teclado Mecânico", 250.00);
        catalogo.adicionarProduto("Mouse Gamer", 150.50);
        catalogo.adicionarProduto("Samsung A45", 1200.00);
        catalogo.adicionarProduto("Aparelho eletronico", 250.90);

        System.out.println("--- Lista de Produtos (Ordenados por Ordem Alfabética) ---");

        catalogo.listarProdutos();
        
        System.out.println("Lista Completa (Ordenada por Preço/ID):");
        catalogo.listarProdutos();

        System.out.println("\n--- Teste Faixa de Preço ---");
        catalogo.exibirPorFaixaPreco(100.0, 300.0);

        System.out.println("\n--- Teste Remoção ---");
        catalogo.removerPorNome("Teclado");
        
        System.out.println("\nLista após remoção:");
        catalogo.listarProdutos();
    }
}