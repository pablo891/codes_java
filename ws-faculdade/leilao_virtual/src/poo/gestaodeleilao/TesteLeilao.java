package poo.gestaodeleilao;

import poo.gestaodeleilao.Leilao;
import poo.gestaodeleilao.Interface;

public class TesteLeilao {

    public static void main(String[] args) {
        Leilao meuLeilao = new Leilao();
        

        Interface interfaceSistema = new Interface(meuLeilao); 
        interfaceSistema.iniciaOperacao(); 
    }
}