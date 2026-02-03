package boas_praticas_03;

import java.text.NumberFormat;
import java.util.Locale;

public class TesteRelatorio {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        Divida divida = new Divida();
        divida.setCredor("Softcom Tecnologia");
        divida.setCnpjCredor(new Cnpj("00.000.000/0001-01"));
        divida.setTotal(1500.00);

        Pagamento p = new Pagamento();
        p.setValor(200.00);
        divida.registra(p);

        RelatorioDeDividas relatorio = new RelatorioDeDividas(divida);

        
        System.out.println("Relatório Brasileiro:");
        relatorio.geraRelatorio(NumberFormat.getCurrencyInstance(new Locale("pt", "BR")));

       
        System.out.println("US Report:");
        relatorio.geraRelatorio(NumberFormat.getCurrencyInstance(Locale.US));
    }
}