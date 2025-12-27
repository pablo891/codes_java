package application;

import poo.database.BDItens;
import poo.entidades.Album;
import poo.entidades.Filme;

public class TesteDoMe {

	public static void main(String[] args) {
		
		Filme f1 = new Filme("Avatar", 249, false, "Massa", "Luis Gustavo");
		Album a1 = new Album("Blond", 90, false, "Muito bom", "Frank Ocean", 10);
		
		BDItens meuBD = new BDItens();
		
		meuBD.adicionaItem(f1);
		meuBD.adicionaItem(a1);
		
		

	}

}
