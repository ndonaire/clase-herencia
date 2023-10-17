package Unidad;

public class Soldado extends Unidad{
	
	public Soldado(double x, double y, int distanciaMaxima) {
		super(x, y, distanciaMaxima);
		this.hp = 100;
		this.ataque = 10;
	}

}
