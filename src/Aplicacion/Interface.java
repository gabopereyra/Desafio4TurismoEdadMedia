package Aplicacion;

import java.util.List;

import Usuario.*;

public class Interface {
	
	public void inicio() {
		System.out.println("||=================================================||");
		System.out.println("||(digite el numero de la opcion correspondiente...||");
		System.out.println("||(luego presiones la tecla ENTER)                 ||");
		System.out.println("||=================================================||");
	}

	public void menu() {
		System.out.println("||=================================================||");
		System.out.println("|| MENU                                            ||");
		System.out.println("||=================================================||");
		System.out.println("||                                                 ||");
		System.out.println("|| 1 -> para mostrar los usuarios cargados.        ||");
		System.out.println("|| 2 -> para mostrar las atracciones cargadas.     ||");
		System.out.println("|| 3 -> para mostrar las promociones cargadas      ||");
		System.out.println("||                                                 ||");
		System.out.println("|| 9 -> para finalizar el programa.                ||");
		System.out.println("||=================================================||");
	}

	public void salir() {
		System.out.println("||=================================================||");
		System.out.println("|| Programa finalizado... gracias por testear      ||");
		System.out.println("||=================================================||");
	}

	public void motrarUsuario(Usuario user) {
		System.out.println("||=================================================||");
		System.out.println("|| Nombre de Usuario -> " + user.getNombre());
		System.out.println("|| preferencias      -> " + user.getTipoAtraccionFavorita());
		System.out.println("|| Dinero en Cuenta  ->                       $" + user.getPresupuesto() + " ||");
		System.out.println("|| Horas disponibles ->                  " + user.getTiempoDisponible() + " Horas ||");

	}
	
	public void mostrarTodosLosUsuarios(List<Usuario> usuarios) {
		for (Usuario i : usuarios) {
			motrarUsuario(i);
		}
		System.out.println("||=================================================||");
		System.out.println();
	}

}
