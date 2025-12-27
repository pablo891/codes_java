package poo.database;

import java.util.ArrayList;

import poo.entidades.Item;

public class BDItens {
	
	private ArrayList <Item> Itens; 
	
	public BDItens() {
		this.Itens = new ArrayList<>();
	}
	
	public void adicionaItem(Item item) {
		this.Itens.add(item);
	}

}
