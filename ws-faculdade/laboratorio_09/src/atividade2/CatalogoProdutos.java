package atividade2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CatalogoProdutos {

	private Set<Produto> produtos;
	
	public CatalogoProdutos() {
		this.produtos = new TreeSet<>();
	}
	
	public void adicionarProduto(String nome, double preco) {
		produtos.add(new Produto(nome, preco));
	}
	
	
	public void exibirPorFaixaPreco(double min, double max) {
        System.out.println("--- Produtos entre R$" + min + " e R$" + max + " ---");
        for (Produto p : produtos) {
            if (p.getPreco() >= min && p.getPreco() <= max) {
                System.out.println(p);
            }
        }
    }

    public void removerPorNome(String nome) {
        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                System.out.println("Produto '" + nome + "' removido com sucesso.");
                return;
            }
        }
        System.out.println("Produto '" + nome + "' não encontrado.");
    }
	public void listarProdutos() {
		for(Produto produto : produtos) {
			System.out.println(produto);
		}
	}

}
