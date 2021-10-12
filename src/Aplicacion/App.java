package Aplicacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Clases.*;

public class App {

	@SuppressWarnings("resource")
	private static String ingresarDatoStr() {
		Scanner scan = new Scanner(System.in);
		String datoStr = scan.nextLine();
		return datoStr;
	}

	@SuppressWarnings("resource")
	private static int ingresarDatoInt() {
		Scanner scan = new Scanner(System.in);
		int datoInt = scan.nextInt();
		return datoInt;
	}

	public static void main(String[] args) {

		int entradaI = 0;
		boolean ejecutar = true;
		Interface consola = new Interface();

		// Creacion de la lista de usuarios
		List<Usuario> listadoUsuarios = creacionUsuario();

		// Creacion de la lista de atracciones
		List<Atraccion> listadoAtracciones = creacionAtraccion();

		// Creacion de la lista de promociones
		List<Promocion> listadoPromociones = creacionPromocion();

		// Ordena la Lista de atracciones
		//Collections.sort(listadoAtracciones, new Sugerencia());

		consola.inicio();

		while (ejecutar) {

			consola.menu();
			try {
				entradaI = ingresarDatoInt();
			} catch (NumberFormatException e) {
				System.err.println("dato invalido. Por favor ingrese un numero.");
			}

			switch (entradaI) {
			case 1:
				consola.mostrarLosUsuarios(listadoUsuarios);
				break;
			case 2:
				consola.mostrarLasAtracciones(listadoAtracciones);
				break;
			case 3:
				consola.mostrarLasPromociones(listadoPromociones);
				break;
			case 4:
				//consola.cargarSugerencias(listadoUsuarios, listadoSugerencias);
				break;
			case 9:
				consola.salir();
				ejecutar = false;
				break;
			default:
				consola.noDisponible();
				break;
			}
		}
	}
//----------------------------------------------------------------------------//
	/*
	// Metodo creacion sugerencias
	

	private static List<Sugerencias> creacionSugerencias(List<Usuario> listadoUsuarios,
			List<Atraccion> listadoAtracciones) {
		List<Sugerencias> listado = new ArrayList<Sugerencias>();

		for (Usuario i : listadoUsuarios) {
			for (Atraccion x : listadoAtracciones) {
				if (i.getPresupuesto() >= x.getCostoAtraccion() && i.getTiempoDisponible() >= x.getTiempoNecesario()
						&& i.getTipoAtraccionFavorita() == x.getTipoAtraccion() && x.getCupoMaximo() > 0) {
					listado.add(agregarSugerencia(x));

				}
			}
		}

		return listado;
	}

	private static Sugerencias agregarSugerencia(Atraccion x) {

		String nombre = x.getNombre();
		double costoAtraccion = x.getCostoAtraccion();
		double tiempoNecesario = x.getTiempoNecesario();
		double cupoMaximo = x.getCupoMaximo();
		TipoAtraccion actividad = x.getTipoAtraccion();

		Sugerencias sugerida = new Atraccion(nombre, costoAtraccion, tiempoNecesario, (int) cupoMaximo, actividad);

		return sugerida;
	}

*/
//----------------------------------------------------------------------------//
// Metodo creacion Usuario
	public static List<Usuario> creacionUsuario() {
		List<Usuario> listado = new ArrayList<Usuario>();

		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			archivo = new File("Usuario.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea = br.readLine();

			while ((linea != null)) {
				// System.out.println(linea);
				listado.add(agregarUsuario(linea));
				linea = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return listado;
	}

	public static Usuario agregarUsuario(String linea) {
		String[] info = linea.split(",");

		String nombre = info[0];
		double monedas = Double.parseDouble(info[1]);
		double tiempo = Double.parseDouble(info[2]);
		TipoAtraccion actividad = TipoAtraccion.valueOf(info[3]);

		Usuario user = new Usuario(nombre, monedas, tiempo, actividad);

		return user;
	}

//----------------------------------------------------------------------------//
//Metodo creacion Atraccion
	public static List<Atraccion> creacionAtraccion() {
		List<Atraccion> listado = new ArrayList<Atraccion>();

		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			archivo = new File("Atraccion.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea = br.readLine();

			while ((linea != null)) {
				// System.out.println(linea);
				listado.add(agregarAtraccion(linea));
				linea = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return listado;
	}

	public static Atraccion agregarAtraccion(String linea) {
		String[] info = linea.split(",");

		String nombre = info[0];
		double costo = Double.parseDouble(info[1]);
		double tiempo = Double.parseDouble(info[2]);
		int cupo = (int) Integer.parseInt(info[3]);
		TipoAtraccion actividad = TipoAtraccion.valueOf(info[4]);

		Atraccion atraccion = new Atraccion(nombre, costo, tiempo, cupo, actividad);

		return atraccion;
	}

//----------------------------------------------------------------------------//
//Metodo creacion Promocion
	public static List<Promocion> creacionPromocion() {
		List<Promocion> listado = new ArrayList<Promocion>();

		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			archivo = new File("Promocion.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea = br.readLine();

			while ((linea != null)) {
				// System.out.println(linea);
				listado.add(agregarPromocion(linea));
				linea = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return listado;
	}

	public static Promocion agregarPromocion(String linea) {
		String[] info = linea.split(",");

		String nombre = info[0];
		int tipo = (int) Integer.parseInt(info[1]);
		double costo = Double.parseDouble(info[2]);
		double tiempo = Double.parseDouble(info[3]);
		String atraccion1 = info[4];
		String atraccion2 = info[5];
		String beneficio = info[6];

		Promocion promocion = new Promocion(nombre, tipo, costo, tiempo, atraccion1, atraccion2, beneficio);

		return promocion;
	}

}
