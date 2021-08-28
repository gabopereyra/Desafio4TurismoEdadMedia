package Atraccion;

public class AbismoDeHelm extends Atraccion {

	private String tipoAtraccion = "Paisaje";

	public AbismoDeHelm(double costoAtraccion, double tiempoNecesario, int cupo) {
		super(costoAtraccion, tiempoNecesario, cupo);

	}

	public AbismoDeHelm() {

	}

	@Override
	public double getCostoAtraccion() {

		return super.getCostoAtraccion() * 0.5;
	}

	public double getTiempoNecesario() {

		return super.getTiempoNecesario() * 2;
	}

	public int getCupo() {

		return (int) (super.getCupo() * 1.5);
	}
	
	public String getTipo () {
		
		return this.tipoAtraccion;
	}
	
	

}
