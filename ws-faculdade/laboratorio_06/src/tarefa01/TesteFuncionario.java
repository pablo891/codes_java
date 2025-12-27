package tarefa01;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario desenvolvedor = new Desenvolvedor("Pablo", 8900.0, 001);
		Funcionario gerente = new Gerente("Thaynara", 8000.0, "thaynara.032", "thaynara123");
		Funcionario secretaria = new Secretaria("Joana", 3000.0, 002);
		
		System.out.println(desenvolvedor.calculaBonificacao());
		System.out.println(desenvolvedor.reajustaValeRefeicaoDiario());
		System.out.println(desenvolvedor.mostraDados());
		
		System.out.println("---");
		
		System.out.println(gerente.calculaBonificacao());
		System.out.println(gerente.reajustaValeRefeicaoDiario());
		System.out.println(gerente.mostraDados());
		
		System.out.println("---");
		
		System.out.println(secretaria.calculaBonificacao());
		System.out.println(secretaria.reajustaValeRefeicaoDiario());
		System.out.println(secretaria.mostraDados());

	}

}
