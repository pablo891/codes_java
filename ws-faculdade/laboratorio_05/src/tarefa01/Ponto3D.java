package tarefa01;

public class Ponto3D extends Ponto2D {
	
	private double z;

	public Ponto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	
	public Ponto3D() {
		super();
		this.z = 0.0;
	}

	public double getZ() {
		return z;
	}
	
	public void desloca(double x, double y) {
		super.desloca(x, y);
	}
	
	public String toString() {
		return " --- Ponto 3D --- "
				+ "\nEixo X: "
				+ this.getX()
				+ "\nEixo Y: "
				+ this.getY()
				+ "\nEixo Z: "
				+ this.z;
	}
}
