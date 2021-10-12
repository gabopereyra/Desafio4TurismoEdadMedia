package Clases;

import java.util.Objects;

public class Atraccion implements Comparable <Atraccion> {
	protected String nombre;
	protected double costoAtraccion;
	protected double tiempoNecesario;
	protected int cupoMaximo;//Deberia ser static final
	protected int cupoActual = 0;
	private   TipoAtraccion tipoAtraccion;

	public Atraccion(String nombre, double costoAtraccion, double tiempoNecesario,
			int cupoMaximo, TipoAtraccion tipoAtraccion) {
		this.nombre = nombre;
		this.costoAtraccion = costoAtraccion;
		this.tiempoNecesario = tiempoNecesario;
		this.cupoMaximo = cupoMaximo;
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

	public TipoAtraccion getTipoAtraccion() {
		return tipoAtraccion;
	}

	public int getCupoActual() {
		return cupoActual;
	}
	
	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(costoAtraccion, cupoActual, cupoMaximo, nombre, tiempoNecesario, tipoAtraccion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atraccion other = (Atraccion) obj;
		return Double.doubleToLongBits(costoAtraccion) == Double.doubleToLongBits(other.costoAtraccion)
				&& cupoActual == other.cupoActual && cupoMaximo == other.cupoMaximo
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(tiempoNecesario) == Double.doubleToLongBits(other.tiempoNecesario)
				&& tipoAtraccion == other.tipoAtraccion;
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

	@Override
	public String toString() {
		return "Atraccion [nombre=" + nombre + ", costoAtraccion=" + costoAtraccion + ", tiempoNecesario="
				+ tiempoNecesario + ", cupoMaximo=" + cupoMaximo + ", cupoActual=" + cupoActual + ", tipoAtraccion="
				+ tipoAtraccion + "]";
	}

	
	
}
