package Aplicacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

import Atraccion.*;
import Usuario.*;

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
		//String entradaS = null;
		boolean ejecutar = true;
		Interface dibujar = new Interface();

		// Creacion de la lista de usuarios
		List<Usuario> listadoUsuarios = creacionUsuario();

		// Creacion de la lista de atracciones
		List<Atraccion> listadoAtracciones = creacionAtraccion();
		// Ordena la Lista de atracciones

		// Collections.sort(listadoAtracciones, new Sugerencia());

		while (ejecutar) {

			dibujar.menu();

			try {
				entradaI = ingresarDatoInt();
			} catch (NumberFormatException e) {
				System.err.println("dato invalido. Por favor ingrese un numero.");
			}

			switch (entradaI) {
			case 1:
				for (Usuario i : listadoUsuarios) {
					System.out.println(i.toString());
				}
				break;
			case 2:
				for (Atraccion i : listadoAtracciones) {
					System.out.println(i.toString());
				}
				break;
			case 3:
				// mostrar las promociones
				break;
			case 9:
				dibujar.salir();
				ejecutar = false;
				break;
			default:
				break;
			}
		}
	}

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

///APLICACIONES
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

}
