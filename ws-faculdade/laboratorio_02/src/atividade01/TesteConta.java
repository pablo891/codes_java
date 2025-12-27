package atividade01;

import atividade02.Cartao;

public class TesteConta {

    public static void main(String[] args) {
        
        Cliente cl1 = new Cliente("Pablo");
        Cartao cart1 = new Cartao(30142450, cl1);
        Conta c1 = new Conta(001, 002, cl1, 50, 0);
        
        System.out.println(c1.toString());
    }
}
