package Usuario;
import java.util.List;

import Atraccion.*;

public class Usuario {
	private double presupuesto;
	private double tiempoDisponible;
	private TipoAtraccion tipoAtraccionFavorita;
	
	private List<Atraccion> atraccionesSugeridas;
	private int indiceAtraccionesSugeridas = 0;

	private List<Atraccion> itinerario;

	public Usuario(double presupuesto, double tiempoDisponible, TipoAtraccion tipoAtraccionFavorita) {
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
		this.tipoAtraccionFavorita = tipoAtraccionFavorita;
	}

	public Usuario() {

	}
	
	public double getPresupuesto () {
		return this.presupuesto;
	}
	
	public double getTiempoDisponible () {
		return this.tiempoDisponible;
	}

	public TipoAtraccion getTipoAtraccionFavorita() {
		return tipoAtraccionFavorita;
	}

	public List<Atraccion> getAtraccionesSugeridas() {
		if (indiceAtraccionesSugeridas != 0) {
			return atraccionesSugeridas;
		}
		return null;
	}

	public void descartarSugerencias() {
		indiceAtraccionesSugeridas = 0;
	}

	public void cargarSugerencias(List<Atraccion> atraccionesDisponibles) {
		for (Atraccion i : atraccionesDisponibles) {
			if (i.getCostoAtraccion() < this.presupuesto) {
				if (i.getTiempoNecesario() < this.tiempoDisponible) {
					atraccionesSugeridas.add(i);
					
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

	@Override
	public String toString() {
		return "Usuario [presupuesto=" + presupuesto + ", tiempoDisponible=" + tiempoDisponible
				+ ", tipoAtraccionFavorita=" + tipoAtraccionFavorita + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(atraccionesSugeridas, indiceAtraccionesSugeridas, itinerario, presupuesto, tiempoDisponible,
				tipoAtraccionFavorita);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(atraccionesSugeridas, other.atraccionesSugeridas)
				&& indiceAtraccionesSugeridas == other.indiceAtraccionesSugeridas
				&& Objects.equals(itinerario, other.itinerario)
				&& Double.doubleToLongBits(presupuesto) == Double.doubleToLongBits(other.presupuesto)
				&& Double.doubleToLongBits(tiempoDisponible) == Double.doubleToLongBits(other.tiempoDisponible)
				&& tipoAtraccionFavorita == other.tipoAtraccionFavorita;
	}
}
