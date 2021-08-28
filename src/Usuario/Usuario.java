package Usuario;

public class Usuario {
	private double presupuesto;
	private double tiempoDisponible;
	private String tipoAtraccionFavorita;

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

}
