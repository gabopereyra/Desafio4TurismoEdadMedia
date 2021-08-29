package Aplicacion;

import java.util.List;
import Atraccion.*;
import Usuario.*;

public class App {

	public static void main(String[] args) {
		//Creacion de la lista de usuarios
		CreacionUsuario crearUsuarios = new CreacionUsuario();
		List<Usuario> listadoUsuarios = crearUsuarios.crearLista();
		//Creacion de la lista de atracciones
		CreacionAtraccion crearAtracciones = new CreacionAtraccion();
		List<Atraccion> listadoAtracciones = crearAtracciones.crearLista();
		
		
		

	}

}
