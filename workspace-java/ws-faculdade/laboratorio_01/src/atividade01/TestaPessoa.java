package atividade01;

public class TestaPessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("123","João");
		Pessoa p2 = new Pessoa("111","Maria");
		
		System.out.println("Dados da primeira pessoa");
		
		System.out.println("CPF: " + p1.getCpf());
		System.out.println("Nome: " + p1.getNome());
		System.out.println("-------------------------");
		System.out.println("Dados da segunda pessoa");
		System.out.println("CPF: " + p2.getCpf());
		System.out.println("Nome: " + p2.getNome());
		
		System.out.println("");
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
