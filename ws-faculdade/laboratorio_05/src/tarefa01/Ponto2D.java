package tarefa01;

public class Ponto2D {
	
	private double x;
	private double y;
	
	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Ponto2D() {
		this(0.0, 0.0);
	}
	
	public Ponto2D(Ponto2D p) {
		this(p.getX(), p.getY());
	}

	public Ponto2D clone() {
		return new Ponto2D(this);
	}
	
		
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void desloca(double x, double y) {
		this.x += x;
		this.y += y;
	}
	
	public Ponto2D somaPonto(double x, double y) {
		return new Ponto2D(this.x + x, this.y + y);
	}
	
	public Ponto2D somaPonto(Ponto2D p) {
		return new Ponto2D(this.x + p.getX(), this.y + p.getY());
	}
	
	@Override 
	public boolean equals(Object o) {
		if(!(o instanceof Ponto2D)) {
			return false;
		}
		else {
			Ponto2D objPonto2D = (Ponto2D) o;
			if(this.x == objPonto2D.getX() && this.y == objPonto2D.getY()) {
				return true;
			}
			return false;
		}
	}
	
	public String toString() {
		return " ----  Ponto 2D --- "
				+ "\nEixo X: "
				+ this.x
				+ "\nEixo Y: "
				+ this.y;
	}
}
