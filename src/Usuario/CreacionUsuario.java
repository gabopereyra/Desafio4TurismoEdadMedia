package Usuario;

import java.util.ArrayList;
import java.util.List;

public class CreacionUsuario {
	private List<Usuario> listado = new ArrayList<Usuario>();
	
	Usuario Eowyn = new Usuario(10d, 8d, "Aventura");
	Usuario Gandalf = new Usuario(100d, 5d, "Paisaje");
	Usuario Sam = new Usuario(36d, 8d, "Degustación");
	Usuario Galadriel = new Usuario(120d, 2d, "Paisaje");

	public List<Usuario> crearLista() {
		listado.add(Eowyn);
		listado.add(Gandalf);
		listado.add(Sam);
		listado.add(Galadriel);
		
		return listado;
	}
	
}
