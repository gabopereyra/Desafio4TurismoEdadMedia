package Clases;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class UsuarioTest {

	@Test
	public void creacionDeUsuarioTest() {
		Usuario hobbit1 = new Usuario();
		assertNotNull(hobbit1);

		Usuario hobbit2 = new Usuario("Thain", 100, 2, TipoAtraccion.AVENTURA);
		assertNotNull(hobbit2);
	}

	@Test
	public void comprobacionDeCreacionSinParametrosTest() {
		Usuario hobbit1 = new Usuario();

		double presupuestoEsperado = 0;
		double presupuestoObtenido = hobbit1.getPresupuesto();
		assertEquals(presupuestoEsperado, presupuestoObtenido, 0.0);

		double TiempoDisponibleEsperado = 0;
		double TiempoDisponibleObtenido = hobbit1.getTiempoDisponible();
		assertEquals(TiempoDisponibleEsperado, TiempoDisponibleObtenido, 0.0);

		TipoAtraccion tipoAtraccionFavoritaEsperado = TipoAtraccion.NoEspecificado;
		TipoAtraccion tipoAtraccionFavoritaObtenido = hobbit1.getTipoAtraccionFavorita();
		assertEquals(tipoAtraccionFavoritaEsperado, tipoAtraccionFavoritaObtenido);

		assertNotNull(hobbit1.getAtraccionesSugeridas());
	}

	@Test
	public void comprobacionDeCreacionConParametrosTest() {
		Usuario hobbit1 = new Usuario("Thain", 100, 2, TipoAtraccion.AVENTURA);

		double presupuestoEsperado = 100;
		double presupuestoObtenido = hobbit1.getPresupuesto();
		assertEquals(presupuestoEsperado, presupuestoObtenido, 0.0);

		double TiempoDisponibleEsperado = 2;
		double TiempoDisponibleObtenido = hobbit1.getTiempoDisponible();
		assertEquals(TiempoDisponibleEsperado, TiempoDisponibleObtenido, 0.0);

		TipoAtraccion tipoAtraccionFavoritaEsperado = TipoAtraccion.AVENTURA;
		TipoAtraccion tipoAtraccionFavoritaObtenido = hobbit1.getTipoAtraccionFavorita();
		assertEquals(tipoAtraccionFavoritaEsperado, tipoAtraccionFavoritaObtenido);

		assertNotNull(hobbit1.getAtraccionesSugeridas());
	}

	@Test
	public void setearParametrosInicialesTest() {
		Usuario hobbit1 = new Usuario();
		hobbit1.agregarMasPresupuesto(100);
		hobbit1.agregarMasTiempoDisponible(8);
		hobbit1.cambiarTipoAtraccionFavorita(TipoAtraccion.AVENTURA);
		;

		double presupuestoEsperado = 100;
		double presupuestoObtenido = hobbit1.getPresupuesto();
		assertEquals(presupuestoEsperado, presupuestoObtenido, 0);

		double tiempoDisponibleEsperado = 8;
		double tiempoDisponibleObtenido = hobbit1.getTiempoDisponible();
		assertEquals(tiempoDisponibleEsperado, tiempoDisponibleObtenido, 0);

		TipoAtraccion tipoAtraccionFavoritaEsperado = TipoAtraccion.AVENTURA;
		TipoAtraccion tipoAtraccionFavoritaObtenido = hobbit1.getTipoAtraccionFavorita();
		assertEquals(tipoAtraccionFavoritaEsperado, tipoAtraccionFavoritaObtenido);
	}

	@Test
	public void agregarUnaAtraccionSugeridaTest() {
		Usuario hobbit1 = new Usuario("Thain", 100, 8, TipoAtraccion.PAISAJE);
		Atraccion atraccion1 = new Atraccion("Campos", 30, 4, 60, TipoAtraccion.PAISAJE);

		List<Atraccion> lista1 = new ArrayList<Atraccion>();
		lista1.add(atraccion1);

		hobbit1.cargarSugerencias(lista1);
		// falta comparalos con assertEquals, pero funciona bien
	}

	@Test
	public void agregarVariasAtraccionesSugeridasTest() {
		Usuario hobbit1 = new Usuario("Thain", 100, 8, TipoAtraccion.PAISAJE);

		Atraccion atraccion1 = new Atraccion("Campos", 30, 4, 60, TipoAtraccion.PAISAJE);
		Atraccion atraccion2 = new Atraccion("Riscos", 20, 3, 60, TipoAtraccion.PAISAJE);
		Atraccion atraccion3 = new Atraccion("Bosque", 10, 1, 60, TipoAtraccion.PAISAJE);

		List<Atraccion> lista1 = new ArrayList<Atraccion>();

		lista1.add(atraccion1);
		lista1.add(atraccion2);
		lista1.add(atraccion3);

		hobbit1.cargarSugerencias(lista1);
		// falta comparalos con assertEquals, pero funciona bien
	}

	@Test
	public void descartarAtraccionesSuegeridasTest() {
		Usuario hobbit1 = new Usuario("Thain", 100, 8, TipoAtraccion.PAISAJE);
		Atraccion atraccion1 = new Atraccion("Campos", 30, 4, 60, TipoAtraccion.PAISAJE);
		List<Atraccion> lista1 = new ArrayList<Atraccion>();
		lista1.add(atraccion1);
		hobbit1.cargarSugerencias(lista1);
		System.out.println(hobbit1.getAtraccionesSugeridas());
		// falta comparalos con assertEquals, pero funciona bien

		hobbit1.descartarSugerencias();
		System.out.println(hobbit1.getAtraccionesSugeridas());
		// agregar equals, y borrar syso
	}
	
	@Test
	public void mostrarUsuario() {
		Usuario hobbit1 = new Usuario("Thain", 100, 8, TipoAtraccion.PAISAJE);
		System.out.println(hobbit1.toString());
	}
}
