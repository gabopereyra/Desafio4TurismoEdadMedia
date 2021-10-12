package Aplicacion;

import java.util.List;

import Clases.Usuario;
import Clases.Atraccion;
import Clases.Promocion;

public class Pantalla {

	public void inicio() {
		System.out.println("||=================================================||");
		System.out.println("||(digite el numero de la opcion correspondiente...||");
		System.out.println("||(luego presiones la tecla ENTER)                 ||");
		System.out.println("||=================================================||");
	}

	public void menu() {
		System.out.println();
		System.out.println("||=================================================||");
		System.out.println("|| MENU                                            ||");
		System.out.println("||=================================================||");
		System.out.println("||                                                 ||");
		System.out.println("|| 1 -> para mostrar los usuarios cargados.        ||");
		System.out.println("|| 2 -> para mostrar las atracciones cargadas.     ||");
		System.out.println("|| 3 -> para mostrar las promociones cargadas.     ||");
		System.out.println("|| 4 -> para mostrar las sugerencias.              ||");
		System.out.println("|| 5 -> generar Archivo con todos los datos.       ||");
		System.out.println("||                                                 ||");
		System.out.println("|| 9 -> para finalizar el programa.                ||");
		System.out.println("||=================================================||");
	}

	public void noDisponible() {
		System.out.println();
		System.out.println("||=================================================||");
		System.out.println("|| Entrada no valida.                              ||");
		System.out.println("|| Por favor, ingrese una opcion valida.           ||");
		System.out.println("||=================================================||");
	}

	public void salir() {
		System.out.println();
		System.out.println("||=================================================||");
		System.out.println("|| Programa finalizado... gracias por testear      ||");
		System.out.println("||=================================================||");
	}

	private void motrarUsuario(Usuario usuario) {
		System.out.println("||=================================================||");
		System.out.println("|| Nombre de Usuario -> " + usuario.getNombre());
		System.out.println("|| preferencias      -> " + usuario.getTipoAtraccionFavorita());
		System.out.println("|| Dinero en Cuenta  ->                      $" + usuario.getPresupuesto() + " ||");
		System.out.println("|| Horas disponibles ->                  " + usuario.getTiempoDisponible() + " Horas ||");

	}

	public void mostrarLosUsuarios(List<Usuario> usuarios) {
		System.out.println();
		System.out.println("||=================================================||");
		System.out.println("|| Mostrando todos los Usuarios cargados...        ||");
		for (Usuario i : usuarios) {
			motrarUsuario(i);
		}
		System.out.println("||=================================================||");
		System.out.println();
	}

	private void mostrarAtraccion(Atraccion atracion) {
		System.out.println("||=================================================||");
		System.out.println("|| Nombre ->  " + atracion.getNombre());
		System.out.println("|| Tipo   ->  " + atracion.getTipoAtraccion());
		System.out.println("|| Costo  ->                                  $" + atracion.getCostoAtraccion() + " ||");
		System.out.println("|| Duracion de la Atraccion ->           " + atracion.getTiempoNecesario() + " Horas ||");
	}

	public void mostrarLasAtracciones(List<Atraccion> atracciones) {
		System.out.println();
		System.out.println("||=================================================||");
		System.out.println("|| Mostrando todas las Atracciones cargadas...     ||");
		for (Atraccion i : atracciones) {
			mostrarAtraccion(i);
		}
		System.out.println("||=================================================||");
		System.out.println();
	}

	private void mostrarPromocion(Promocion p) {
		System.out.println("||=================================================||");
		System.out.println("|| Nombre            ->  " + p.getNombre());
		System.out.println("|| Tipo de Promocion ->  " + p.getTipoDePromocion());
		for (Atraccion i : p.getAtracciones()) {
			System.out.println("|| Atraccion Incluida -> " + i.getNombre());
		}
		System.out.println("|| Costo total Promocion ->                   $" + p.getCosto() + " ||");
		System.out.println("|| Duracion de la Atraccion ->           " + p.getTiempo() + " Horas ||");
	}
	
	public void mostrarLasPromociones(List<Promocion> promociones) {
		System.out.println();
		System.out.println("||=================================================||");
		System.out.println("|| Mostrando tadas las Promociones cargadas...     ||");
		for (Promocion i : promociones) {
			mostrarPromocion(i);
		}
		System.out.println("||=================================================||");
		System.out.println();
	}

}
