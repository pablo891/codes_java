package exc_switch_case;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroDia;
		
		System.out.println("Digite o dia da semana: ");
		numeroDia = sc.nextInt();
		
		switch(numeroDia) {
		
		case 1:
			System.out.println("Dia da semana: Segunda-feira");
			break;
			
		case 2:
			System.out.println("Dia da semana: Terça-feira");
			break;
			
		case 3:
			System.out.println("Dia da semana: Quarta-feira");
			break;
		
		case 4:
			System.out.println("Dia da semana: Quinta-feira");
			break;
		
		case 5:
			System.out.println("Dia da semana: Sexta-feira");
			break;
		
		case 6:
			System.out.println("Dia da semana: Sábado");
			break;
		
		case 7:
			System.out.println("Dia da semana: Domingo");
			break;
		}
		
		sc.close();

	}

}
