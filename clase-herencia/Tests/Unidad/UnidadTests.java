package Unidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnidadTests {

	//@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void soldadoAtacaArquero() {
		Soldado soldado = new Soldado(0,0,1);
		Arquero arquero = new Arquero(1,0,20);
		
		soldado.atacar(arquero);
		assertEquals(arquero.getHp(), 25);
	}
	
	@Test
	public void arqueroAtacaSoldado() {
		Soldado soldado = new Soldado(0,0,1);
		Arquero arquero = new Arquero(20,0,20);
		
		arquero.atacar(soldado);
		assertEquals(soldado.getHp(), 95);
	}

}
