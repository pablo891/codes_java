package tarefa01;

public class TestePrograma {

	public static void main(String[] args) {
		
		Ponto2D p2d = new Ponto2D(2.0, 5.0);
		Ponto3D p3d = new Ponto3D(3.0, 5.0, 1.0);
		Pixel pixel = new Pixel(2.0, 5.0, 3);
		
		System.out.println(p2d.toString());
		System.out.println(p3d.toString());
		System.out.println(pixel.toString());
		
		System.out.println("---- Utilizando métodos ----");
		
		Ponto2D p2dClone = p2d.clone();
		
		p2d.desloca(1.0, 2.0);
		p3d.desloca(2.0, 1.5);
		pixel.deslocaPixel(2.5, 1.0);
		
		System.out.println(p2d.toString());
		System.out.println(p3d.toString());
		System.out.println(pixel.toString());
		
		p2d.somaPonto(3, 3);
		
		System.out.println(p2d.toString());
		
		System.out.println("\nClone do Ponto 2D: ");
		System.out.println(p2dClone.toString());
		
		System.out.println("Teste de Equals: ");
		System.out.println(p2d.equals(p2dClone));

		
	}

}
