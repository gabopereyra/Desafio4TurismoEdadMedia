package Usuario;
import Atraccion.*;

public class Usuario {
	private double presupuesto;
	private double tiempoDisponible;
	private String tipoAtraccionFavorita;
	
	private Atraccion[] atraccionesSugeridas;
	private int indiceAtraccionesSugeridas = 0;

	private Atraccion[] itinerario;

	public Usuario(double presupuesto, double tiempoDisponible, String tipoAtraccionFavorita) {
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
		this.tipoAtraccionFavorita = tipoAtraccionFavorita;
	}

	public Usuario() {

	}
	
	public double getPresupuesto () {
		return this.presupuesto;
	}
	
	public double gettiempoDisponible () {
		return this.tiempoDisponible;
	}

	public String getTipoAtraccionFavorita() {
		return tipoAtraccionFavorita;
	}

	public Atraccion[] getAtraccionesSugeridas() {
		if (indiceAtraccionesSugeridas != 0) {
			return atraccionesSugeridas;
		}
		return null;
	}

	public void descartarSugerencias() {
		indiceAtraccionesSugeridas = 0;
	}

	public void cargarSugerencias(Atraccion[] atraccionesDisponibles) {
		for (Atraccion i : atraccionesDisponibles) {
			if (i.getCostoAtraccion() < this.presupuesto) {
				if (i.getTiempoNecesario() < this.tiempoDisponible) {
					atraccionesSugeridas[indiceAtraccionesSugeridas] = i;
					indiceAtraccionesSugeridas++;
				}
			}
		}
		// Aca se llamaria un método de Atraccion que ordenaria las sugerencias...
		// ...de mayor a menor precio. (Ej: atraccionesSugeridas.ordenar).
	}

	public void llenarItinerario() {
		// En éste método se evaluaria las atraccionesSugeridas.
		// las que se acepten se guardaran en itinerario hasta que no quede ...
		// ni plata, ni tiempo.
		// PD: deberia retornar el itinerario , el tiempo utilizado y el dinero gastado
	}

}
