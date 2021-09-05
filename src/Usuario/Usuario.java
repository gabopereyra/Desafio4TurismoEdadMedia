package Usuario;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.LinkedList;

import Atraccion.*;

public class Usuario {
	private double presupuesto = 0;
	private double tiempoDisponible = 0;
	private TipoAtraccion tipoAtraccionFavorita = TipoAtraccion.NoEspecificado;
	private List<Atraccion> itinerario = new LinkedList<Atraccion>();
	private List<Atraccion> atraccionesSugeridas = new ArrayList<Atraccion>();

	public Usuario(double presupuesto, double tiempoDisponible, TipoAtraccion tipoAtraccionFavorita) {
		if (esValorCorrecto(presupuesto))
			this.presupuesto = presupuesto;
		if (esValorCorrecto(tiempoDisponible))
			this.tiempoDisponible = tiempoDisponible;
		this.tipoAtraccionFavorita = tipoAtraccionFavorita;
	}

	public Usuario() {

	}

	public boolean esValorCorrecto(double valor) {
		return valor > 0;
	}

	public double getPresupuesto() {
		return this.presupuesto;
	}

	public void agregarMasPresupuesto(double presupuesto) {
		if (esValorCorrecto(presupuesto))
			this.presupuesto += presupuesto;
	}

	public double getTiempoDisponible() {
		return this.tiempoDisponible;
	}

	public void agregarMasTiempoDisponible(double tiempoDisponible) {
		if (esValorCorrecto(tiempoDisponible))
			this.tiempoDisponible += tiempoDisponible;
	}

	public TipoAtraccion getTipoAtraccionFavorita() {
		return tipoAtraccionFavorita;
	}

	public void cambiarTipoAtraccionFavorita(TipoAtraccion tipoAtraccionFavorita) {
		this.tipoAtraccionFavorita = tipoAtraccionFavorita;
	}

	public List<Atraccion> getAtraccionesSugeridas() {
		return atraccionesSugeridas;
	}

	public void cargarSugerencias(List<Atraccion> atraccionesDisponibles) {
		for (Atraccion i : atraccionesDisponibles) {
			atraccionesSugeridas.add(i);
		}
	}

	public void descartarSugerencias() {
		atraccionesSugeridas.removeAll(atraccionesSugeridas);
	}

	public void llenarItinerario() {
		// En Ã©ste mÃ©todo se evaluaria las atraccionesSugeridas.
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
		return Objects.hash(atraccionesSugeridas, itinerario, presupuesto, tiempoDisponible, tipoAtraccionFavorita);
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
				&& Objects.equals(itinerario, other.itinerario)
				&& Double.doubleToLongBits(presupuesto) == Double.doubleToLongBits(other.presupuesto)
				&& Double.doubleToLongBits(tiempoDisponible) == Double.doubleToLongBits(other.tiempoDisponible)
				&& tipoAtraccionFavorita == other.tipoAtraccionFavorita;
	}
}
