package Usuario;

import static org.junit.Assert.*;

import org.junit.Test;

import Atraccion.TipoAtraccion;

public class TestUsuario {

	@Test
	public void creacionDeUsuarioTest() {
		Usuario hobbit1 = new Usuario();
		assertNotNull(hobbit1);
		Usuario hobbit2 = new Usuario(100, 2, TipoAtraccion.AVENTURA);
		assertNotNull(hobbit2);
	}
	
	@Test
	public void comprobacionDeParametrosTest() {
		Usuario hobbit1 = new Usuario(100, 2, TipoAtraccion.AVENTURA);
		double presupuestoEsperado = 100;
		double presupuestoObtenido = hobbit1.getPresupuesto();
		assertEquals(presupuestoEsperado, presupuestoObtenido, 0.0);
		double TiempoDisponibleEsperado = 2;
		double TiempoDisponibleObtenido = hobbit1.getTiempoDisponible();
		assertEquals(TiempoDisponibleEsperado, TiempoDisponibleObtenido, 0.0);
		TipoAtraccion tipoAtraccionFavoritaEsperado = TipoAtraccion.AVENTURA;
		TipoAtraccion tipoAtraccionFavoritaObtenido = hobbit1.getTipoAtraccionFavorita();
		assertEquals(tipoAtraccionFavoritaEsperado,tipoAtraccionFavoritaObtenido);
	}
	
	@Test
	public void añadirUnaAtraccionTest(){
	  	
	}
	
	@Test
	public void añadirVariasAtraccionesTest(){
		
	}
	
}
