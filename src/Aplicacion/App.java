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
		String datoStr = scan.next();
		return datoStr;
	}

	@SuppressWarnings("resource")
	private static int ingresarDatoInt() {
		Scanner scan = new Scanner(System.in);
		int datoInt = scan.nextInt();
		return datoInt;
	}

	public static void main(String[] args) {

		int index = 0;		//se usa para saber la posicion del usuario buscado
		char mode = 0;		//se usa para evaluar que accion tomar segun el nombre ingresado
		String entradaS;
		Pantalla pantalla = new Pantalla();

		List<Usuario> listadoUsuarios = creacionUsuario();
		List<Atraccion> listadoAtracciones = creacionAtraccion();
		List<Promocion> listadoPromociones = creacionPromocion();

		pantalla.saludo();

		while (true) {

			pantalla.ingresoS();
			entradaS = ingresarDatoStr();
			pantalla.barra();

			if (entradaS.equals("admin")) {
				mode = 1;
			} else {
				int count = 0;
				for (Usuario usuario : listadoUsuarios) {
					if (usuario.getNombre().equals(entradaS)) {
						index = count;
						mode = 2;
						break;
					}
					count++;
				}
			}

			switch (mode) {
			case 0:
				pantalla.ingresoStrInvalido();
				break;

			case 1: // admin
				ingresoDeAdministrador(listadoUsuarios, listadoAtracciones, listadoPromociones);
				break;

			case 2:// user
				ingresoDeUsuario(index);
				break;

			}

		}
	}

	public static void ingresoDeAdministrador(List<Usuario> listadoUsuarios, 
			List<Atraccion> listadoAtracciones, List<Promocion> listadoPromociones) {

		boolean salir = false;
		Pantalla pantalla = new Pantalla();

		while (!salir) {
			pantalla.menuAdmin();

			int entradaI = (Integer) ingresarDatoInt();

			switch (entradaI) {
			case 1:
				pantalla.mostrarLosUsuarios(listadoUsuarios);
				break;
			case 2:
				pantalla.mostrarLasAtracciones(listadoAtracciones);
				break;
			case 3:
				pantalla.mostrarLasPromociones(listadoPromociones);
				break;
			case 4:
				//LLenar Itinerarios manualmente
				break;
			case 5:
				//LLenar Itinerarios automaticamente
				break;
			case 9:
				pantalla.salir();
				salir = true;
				break;
			default:
				pantalla.ingresoStrInvalido();
				break;
			}

		}
	}
	
	public static void ingresoDeUsuario(int index) {
		//aca se tomaria un usuario en particular, ayudado con el index se ...
		//deberia saber en que posicion se encuentra el busado.
		
	}

//Metodo creacion Usuario
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
