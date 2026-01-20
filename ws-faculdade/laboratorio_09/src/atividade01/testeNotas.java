package atividade01;

import java.util.Scanner;

public class testeNotas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		GerenciadorNotas gerenciador = new GerenciadorNotas();
		
		gerenciador.adicionarNota(20251, 8.5);
		gerenciador.adicionarNota(20252, 9);
		gerenciador.adicionarNota(20253, 6.5);
		
		gerenciador.exibirNotas();
		
		System.out.println("-- Maior Nota --");
		System.out.println(gerenciador.getMaiorNota());
		
		System.out.println("-- Média da Turma --");
		System.out.println(gerenciador.getMediaTurma());
		
		System.out.println("------");
		gerenciador.exibirNotas();
		
		System.out.println("Informe um valor desejado para as notas: ");
		double nota = sc.nextDouble();
		
		System.out.println("----- Maiores que a nota desejada -----");
		gerenciador.getMaiorDesejado(nota);
		
		sc.close();
	}
}
