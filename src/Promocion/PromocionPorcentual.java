package Promocion;
import Usuario.Usuario;

public class PromocionPorcentual extends Promocion{
	
	
	private double costo;
	private int costoCondescuento;
	
	
	public void descuentoVeintePorciento() {
		if(Usuario.comprarEnEfectivo()) {this.costo= costo*0.80;
			
		}
	}
}

