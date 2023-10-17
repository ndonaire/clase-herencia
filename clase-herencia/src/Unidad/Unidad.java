package Unidad;

public abstract class Unidad {
	protected int hp;
	protected int ataque;
	protected Punto coordenada;
	protected int distanciaMaxima;

	public Unidad(double x, double y, int distanciaMaxima) {
		super();
		this.coordenada = new Punto(x, y);
		this.distanciaMaxima = distanciaMaxima;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int daño) {
		this.hp = Math.max(this.hp - daño, 0);
	}

	public int getAtaque() {
		return ataque;
	}

	public Punto getCoordenada() {
		return coordenada;
	}

	public boolean estaVivo() {
		return this.hp > 0;
	}

	public void recibirDaño(Unidad otro){ 
		otro.setHp(this.ataque);
	}
	
	public void atacar(Unidad otro) {
		if(!estaVivo() && this.coordenada.calcularDistancia(otro.getCoordenada()) > this.distanciaMaxima) {
			return;
		}
		recibirDaño(otro);
	}	
	
}
