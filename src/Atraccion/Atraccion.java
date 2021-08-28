package Atraccion;

public class Atraccion implements Comparable <Atraccion> {
	protected String nombre;
	protected double costoAtraccion;
	protected double tiempoNecesario;
	protected int cupo;
	private String tipoAtraccion;

	public Atraccion(String nombre, double costoAtraccion, double tiempoNecesario, int cupo, String tipoAtraccion) {
		this.nombre = nombre;
		this.costoAtraccion = costoAtraccion;
		this.tiempoNecesario = tiempoNecesario;
		this.cupo = cupo;
		this.tipoAtraccion = tipoAtraccion;
	}

	public Atraccion() {

	}

	public double getCostoAtraccion() {
		return costoAtraccion;
	}

	public double getTiempoNecesario() {
		return tiempoNecesario;
	}

	public String getTipoAtraccion() {
		return tipoAtraccion;
	}

	public int getCupo() {
		return cupo;
	}

	public String getNombre() {
		return nombre;
	}

	@Override 
	public int compareTo(Atraccion o) {

		if (getCostoAtraccion() < o.getCostoAtraccion()) {
			return 1;
		}
		if (getCostoAtraccion() > o.getCostoAtraccion()) {
			return -1;
		}

		return 0;
	}
	///PRUEBA

}
