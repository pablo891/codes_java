package boas_praticas_03;

import java.text.NumberFormat;

public class RelatorioDeDividas {
    private Divida divida;

    public RelatorioDeDividas(Divida divida) {
        this.divida = divida;
    }

    public void geraRelatorio(NumberFormat formatador) {
        System.out.println("Credor: " + divida.getCredor());
        System.out.println("CNPJ: " + divida.getCnpjCredor().getValor());
        System.out.println("Valor Total: " + formatador.format(divida.getTotal()));
        System.out.println("Valor a Pagar: " + formatador.format(divida.valorAPagar()));
        System.out.println("--------------------------------");
    }
}
