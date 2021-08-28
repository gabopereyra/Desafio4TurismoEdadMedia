package Atraccion;

public class Atraccion implements Comparable<Atraccion> {
	protected String nombre;
	protected double costoAtraccion = 10;
	protected double tiempoNecesario = 1;
	protected int cupo = 10;
	private String tipoAtraccion;

	public Atraccion(String nombre, double costoAtraccion, double tiempoNecesario, int cupo, String tipoAtraccion) {
		this.nombre = nombre;
		this.costoAtraccion = costoAtraccion;
		this.tiempoNecesario = tiempoNecesario;
		this.cupo = cupo;
		this.tipoAtraccion = tipoAtraccion;
	}

	public Atraccion(double costoAtraccion, double tiempoNecesario, int cupo) {

	}

	public Atraccion(double costoAtraccion, double tiempoNecesario) {

	}

	public Atraccion(double costoAtraccion) {
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
		// TODO Auto-generated method stub
		return null;
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

}
