package Atraccion;

import static org.junit.Assert.*;

import org.junit.Test;

public class AtraccionTest {

	@Test
	public void creacionDeAtraccionTest() {
		Atraccion atraccion1 = new Atraccion();
		assertNotNull(atraccion1);
		Atraccion atraccion2 = new Atraccion("Campos", 30, 4, 60, TipoAtraccion.PAISAJE);
		assertNotNull(atraccion2);
	}
	
	@Test
	public void comprobacionDeParametrosTest() {
		Atraccion atraccion1 = new Atraccion("Campos", 30, 4, 60, TipoAtraccion.PAISAJE);
		String nombreEsperado = "Campos";
		String nombreObtenido = atraccion1.getNombre();
		assertEquals(nombreEsperado,nombreObtenido);
		double costoEsperado = 30;
		double costoObtenido = atraccion1.getCostoAtraccion();
		assertEquals(costoEsperado,costoObtenido,0);
		double tiempoEsperado = 4;
		double tiempoObtenido = atraccion1.getTiempoNecesario();
		assertEquals(tiempoEsperado,tiempoObtenido,0);
		int cupoMaximoEsperado = 60;
		int cupoMaximoObtenido = atraccion1.getCupoMaximo();
		assertEquals(cupoMaximoEsperado,cupoMaximoObtenido);
		int cupoActualEsperado = 0;
		int cupoActualObtenido = atraccion1.getCupoActual();
		assertEquals(cupoActualEsperado,cupoActualObtenido);
		TipoAtraccion tipoAtraccionEsperado = TipoAtraccion.PAISAJE;
		TipoAtraccion tipoAtraccionObtenido = atraccion1.getTipoAtraccion();
		assertEquals(tipoAtraccionEsperado,tipoAtraccionObtenido);
		
	}
	
	@Test
	public void atraccionesIgualesTest() {
		Atraccion atraccion1 = new Atraccion("Campos", 30, 4, 60, TipoAtraccion.PAISAJE);
		Atraccion atraccion2 = new Atraccion("Campos", 30, 4, 60, TipoAtraccion.PAISAJE);
		assertEquals(atraccion1,atraccion2);
	}
	
	@Test
	public void atraccionesDesigualesTest() {
		Atraccion atraccion1 = new Atraccion("Campos", 30, 4, 60, TipoAtraccion.PAISAJE);
		Atraccion atraccion2 = new Atraccion("Gondor", 30, 4, 60, TipoAtraccion.PAISAJE);
		assertNotEquals(atraccion1,atraccion2);
		Atraccion atraccion3 = new Atraccion("Campos", 30, 4, 60, TipoAtraccion.PAISAJE);
		Atraccion atraccion4 = new Atraccion("Campos", 31, 4, 60, TipoAtraccion.PAISAJE);
		assertNotEquals(atraccion3,atraccion4);
		Atraccion atraccion5 = new Atraccion("Campos", 30, 4, 60, TipoAtraccion.PAISAJE);
		Atraccion atraccion6 = new Atraccion("Campos", 30, 5, 60, TipoAtraccion.PAISAJE);
		assertNotEquals(atraccion5,atraccion6);
		Atraccion atraccion7 = new Atraccion("Campos", 30, 4, 60, TipoAtraccion.PAISAJE);
		Atraccion atraccion8 = new Atraccion("Campos", 30, 4, 61, TipoAtraccion.PAISAJE);
		assertNotEquals(atraccion7,atraccion8);
		Atraccion atraccion9  = new Atraccion("Campos", 30, 4, 60, TipoAtraccion.PAISAJE);
		Atraccion atraccion10 = new Atraccion("Campos", 30, 4, 60, TipoAtraccion.AVENTURA);
		assertNotEquals(atraccion9,atraccion10);
	}
}
