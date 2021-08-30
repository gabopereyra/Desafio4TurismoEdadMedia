package Aplicacion;

import java.util.List;
import Atraccion.*;
import Usuario.*;

public class App {

	public static void main(String[] args) {
		//Creacion de la lista de usuarios
		List<Usuario> listadoUsuarios = creacionUsuario();
		//Creacion de la lista de atracciones
		List<Atraccion> listadoAtracciones = creacionAtraccion();
		

	}

//Metodo creacion Usuario
public List<Usuario> creacionUsuario() {
	private List<Usuario> listado = new ArrayList<Usuario>();
	
	Usuario Eowyn = new Usuario(10d, 8d, "Aventura");
	Usuario Gandalf = new Usuario(100d, 5d, "Paisaje");
	Usuario Sam = new Usuario(36d, 8d, "Degustación");
	Usuario Galadriel = new Usuario(120d, 2d, "Paisaje");

	listado.add(Eowyn);
	listado.add(Gandalf);
	listado.add(Sam);
	listado.add(Galadriel);
		
	return listado;
	}
	
//Metodo creacion Aplicaciones
public List<Atraccion> creacionAtraccion() {
	private List<Atraccion> listado = new ArrayList<Atraccion>();
	
	Atraccion Moria = new Atraccion("Moria", 10.0, 2.0, 6, "Aventura");
	Atraccion MinasTirith = new Atraccion("Minas Tirith", 5.0, 2.5, 25, "Paisaje");
	Atraccion LaComarca = new Atraccion("La Comarca", 3.0, 6.5, 150, "Degustación");
	Atraccion Mordor = new Atraccion("Mordor", 25.0, 3.0, 4, "Aventura");
	Atraccion AbismoDeHelm = new Atraccion("Abismo De Helm", 5.0, 2.0, 15, "Paisaje");
	Atraccion Lothlorien = new Atraccion("Lothlorien", 35.0, 1.0, 30, "Degustación");
	Atraccion Erebor = new Atraccion("Erebor", 12.0, 3.0, 32, "Paisaje");
	Atraccion BosqueNegro = new Atraccion("BosqueNegro", 3.0, 4.0, 12, "Aventura");

	listado.add(Moria);
	listado.add(MinasTirith);
	listado.add(LaComarca);
	listado.add(Mordor);
	listado.add(AbismoDeHelm);
	listado.add(Lothlorien);
	listado.add(Erebor);
	listado.add(BosqueNegro);
		
	return listado;
	}

	
}
