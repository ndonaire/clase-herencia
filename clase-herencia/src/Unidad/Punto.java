package Unidad;

public class Punto {

	private double x, y;

	Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double calcularDistancia(Punto p) {
		return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
	}
}
