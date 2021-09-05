package Usuario;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Atraccion.Atraccion;
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
		assertEquals(tipoAtraccionFavoritaEsperado,tipoAtraccionFavoritaObtenido);;
		assertNotNull(hobbit1.getAtraccionesSugeridas());
	}
	
	@Test
	public void agregarUnaAtraccionSugeridaTest(){
		Usuario hobbit1 = new Usuario(100, 8, TipoAtraccion.PAISAJE);
		
		Atraccion atraccion1 = new Atraccion("Campos", 30, 4, 60, TipoAtraccion.PAISAJE);
		
		List<Atraccion> lista1 = new ArrayList<Atraccion>();
		lista1.add(atraccion1);
		
		hobbit1.cargarSugerencias(lista1);
		//falta comparalos con assertEquals, pero funciona bien
	}
	
	@Test
	public void agregarVariasAtraccionesSugeridasTest(){
		Usuario hobbit1 = new Usuario(100, 8, TipoAtraccion.PAISAJE);
		
		Atraccion atraccion1 = new Atraccion("Campos", 30, 4, 60, TipoAtraccion.PAISAJE);
		Atraccion atraccion2 = new Atraccion("Riscos", 20, 3, 60, TipoAtraccion.PAISAJE);
		Atraccion atraccion3 = new Atraccion("Bosque", 10, 1, 60, TipoAtraccion.PAISAJE);
		
		List<Atraccion> lista1 = new ArrayList<Atraccion>();
		
		lista1.add(atraccion1);
		lista1.add(atraccion2);
		lista1.add(atraccion3);
		
		hobbit1.cargarSugerencias(lista1);
		//falta comparalos con assertEquals, pero funciona bien
	}
	
}
