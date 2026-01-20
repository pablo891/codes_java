package atividade01;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorNotas {
	
	private Map<Integer, Double> notasAlunos;
	
	public GerenciadorNotas() {
		this.notasAlunos = new HashMap<>();
	}
	
	public void adicionarNota(int matricula, double nota) {
		notasAlunos.put(matricula, nota);
	}
	
	public void removerAluno(int matricula) {
		notasAlunos.remove(matricula);
	}
	
	public void exibirNotas() {
		for(Map.Entry<Integer, Double> entry : notasAlunos.entrySet()) {
			System.out.println("Matrícula: " + entry.getKey() +
					" - Nota: " + entry.getValue());
		}
	}
	
	public double getMaiorNota() {
		double maiorNota = -1;
		
		if(!notasAlunos.isEmpty()) {
			for(Map.Entry <Integer, Double> entry : notasAlunos.entrySet()) {
				if(entry.getValue() > maiorNota) {
					maiorNota = entry.getValue();
				}
			}
		}
		
		return maiorNota;
	}
	
	public double getMediaTurma() {
		double soma = 0;
		int alunos = 0;
		
		if(!notasAlunos.isEmpty()) {
			for(Map.Entry <Integer, Double> entry : notasAlunos.entrySet()) {
				soma += entry.getValue();
				alunos += 1;
			}
		}
		
		return soma / alunos;
	}
	
	public void getMaiorDesejado(double notaDesejada) {
		if(!notasAlunos.isEmpty()) {
			for(Map.Entry <Integer, Double> entry : notasAlunos.entrySet()) {
				if(entry.getValue() > notaDesejada) {
					System.out.println("Matrícula: " + entry.getKey() +
							" - Nota: " + entry.getValue());
				}
			}
		}
	}
}
