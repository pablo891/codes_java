package tarefa01;

public class Pixel extends Ponto2D {
	
	private int cor;
	
	public Pixel(double x, double y, int cor) {
		super(x,y);
		this.cor = cor%100;
	}
	
	public Pixel() {
		super();
		this.cor = 0;
	}

	public int getCor() {
		return cor;
	}
	
	public void mudaCor(int cor) {
		this.cor = cor;
	}
	
	public void deslocaPixel(double x, double y) {
		super.desloca(x, y);
	}
	
	public String toString() {
		return 	" -- Pixel -- "
				+ "\nEixo X: "
				+ this.getX()
				+"\nEixo Y: "
				+ this.getY()
				+ "\nCor: "
				+ this.cor;
		
	
	}
}
