package Clases;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Promocion {

	private String nombre;
	private int tipo;
	private double costo;
	private double tiempo;
	private List<Atraccion> atracciones = new ArrayList<Atraccion>();
	private List<String> nombresAtracciones = new ArrayList<String>();
	private TipoPromocion TipoDePromocion = TipoPromocion.NoEspecificado;

	public Promocion(String nombre, int tipo, double costo, double tiempo, String atraccion1, String atraccion2,
			String beneficio) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.costo = costo;
		this.tiempo = tiempo;

		this.nombresAtracciones.add(atraccion1);
		this.nombresAtracciones.add(atraccion2);
		if (tipo > 2)
			this.nombresAtracciones.add(beneficio);

		switch (tipo) {
		case 1:
			this.TipoDePromocion = TipoDePromocion.ABSOLUTA;
			break;
		case 2:
			this.TipoDePromocion = TipoDePromocion.PORCENTUAL;
			break;
		case 3:
			this.TipoDePromocion = TipoDePromocion.AporB;
			break;
		}

	}

	public void cargarAtracciones(List<Atraccion> atraccionesDisponibles) {
		for (Atraccion i : atraccionesDisponibles) {
			for (String j : this.nombresAtracciones) {
				if (i.getNombre() == j)
					this.atracciones.add(i);
			}
		}
	}

	public String getNombre() {
		return nombre;
	}

	public int getTipo() {
		return tipo;
	}

	public double getCosto() {
		return costo;
	}

	public double getTiempo() {
		return tiempo;
	}

	public List<Atraccion> getAtracciones() {
		return atracciones;
	}

	public List<String> getNombresAtracciones() {
		return nombresAtracciones;
	}

	public TipoPromocion getTipoDePromocion() {
		return TipoDePromocion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(TipoDePromocion, atracciones, costo, nombre, nombresAtracciones, tiempo, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Promocion other = (Promocion) obj;
		return TipoDePromocion == other.TipoDePromocion && Objects.equals(atracciones, other.atracciones)
				&& Double.doubleToLongBits(costo) == Double.doubleToLongBits(other.costo)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(nombresAtracciones, other.nombresAtracciones)
				&& Double.doubleToLongBits(tiempo) == Double.doubleToLongBits(other.tiempo) && tipo == other.tipo;
	}

	@Override
	public String toString() {
		return "Promocion [nombre=" + nombre + ", tipo=" + tipo + ", costo=" + costo + ", tiempo=" + tiempo
				+ ", atracciones=" + atracciones + ", nombresAtracciones=" + nombresAtracciones + ", TipoDePromocion="
				+ TipoDePromocion + "]";
	}
}
