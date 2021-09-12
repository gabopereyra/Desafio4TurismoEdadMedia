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

	public static void main(String[] args) {
		// Creacion de la lista de usuarios
		List<Usuario> listadoUsuarios = creacionUsuario();

		// Creacion de la lista de atracciones
		List<Atraccion> listadoAtracciones = creacionAtraccion();
		// Ordena la Lista de atracciones

		Collections.sort(listadoAtracciones, new Sugerencia());
		


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
