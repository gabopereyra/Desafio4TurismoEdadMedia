package Aplicacion;

import java.util.List;

import Clases.Usuario;
import Clases.Atraccion;
import Clases.Promocion;

public class Pantalla {

	public void barra() {
		System.out.println("||=================================================||");
	}

	public void saludo() {
		System.out.println("||=================================================||");
		System.out.println("||                                                 ||");
		System.out.println("||                  Bienvenido.                    ||");
		System.out.println("||                                                 ||");
	}

	public void ingresoS() {
		System.out.println("||=================================================||");
		System.out.println("|| -> Ingrese el nombre de Usuario.                ||");
		System.out.println("|| -> Luego presione la tecla ENTER.               ||");
		System.out.println("||                                                 ||");
		System.out.print("|| Nombre : ");
	}

	public void ingresoStrInvalido() {
		System.out.println();
		System.out.println("||=================================================||");
		System.out.println("|| Entrada Incorrecta.                             ||");
		System.out.println("|| Por favor, ingrese un nombre valido.            ||");
		System.out.println("||=================================================||");
	}
	
	public void ingresoIntInvalido() {
		System.out.println();
		System.out.println("||=================================================||");
		System.out.println("|| Opcion no disponible.                           ||");
		System.out.println("|| Por favor, ingrese una opcion valida.           ||");
		System.out.println("||=================================================||");
	}

	public void menuAdmin() {
		System.out.println();
		System.out.println("||=================================================||");
		System.out.println("|| MENU ADMINISTRADOR                              ||");
		System.out.println("||=================================================||");
		System.out.println("||                                                 ||");
		System.out.println("|| 1 -> para mostrar los usuarios cargados.        ||");
		System.out.println("|| 2 -> para mostrar las atracciones cargadas.     ||");
		System.out.println("|| 3 -> para mostrar las promociones cargadas.     ||");
		System.out.println("|| 4 -> llenar todos los itinerarios. (manual)     ||");
		System.out.println("|| 5 -> llenar todos los itinerarios. (automatico) ||");
		System.out.println("||                                                 ||");
		System.out.println("|| 9 -> para finalizar el programa.                ||");
		System.out.println("||=================================================||");
	}
	
	public void menuUser() {
		System.out.println();
		System.out.println("||=================================================||");
		System.out.println("|| MENU USUARIO                                    ||");
		System.out.println("||=================================================||");
		System.out.println("||                                                 ||");
		System.out.println("|| 1 -> Mostrar estado.                    	        ||");
		System.out.println("|| 2 -> LLenar el itinerario.                      ||");
		System.out.println("|| 3 -> Añadir mas presupuesto.                    ||");
		System.out.println("|| 4 -> Añadir mas tiempo disponible.              ||");
		System.out.println("|| 5 -> Visualizar Atracciones Disponibles.        ||");
		System.out.println("|| 6 -> Visualizar Promociones Disponibles.        ||");
		System.out.println("||                                                 ||");
		System.out.println("|| 9 -> para finalizar el programa.                ||");
		System.out.println("||=================================================||");
	}

	public void salir() {
		System.out.println();
		System.out.println("||=================================================||");
		System.out.println("|| Programa finalizado... gracias por testear      ||");
		System.out.println("||=================================================||");
		System.out.println();
	}

	public void motrarUsuario(Usuario usuario) {
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
