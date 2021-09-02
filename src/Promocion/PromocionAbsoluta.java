package Promocion;

import Usuario.Usuario;

public class PromocionAbsoluta extends Promocion{

	

	private int costoA;

	private int costoB;

	private int costoC;
	private int costoD;
	
	private int costo;

	private int costoPaqueteCompleto;	
	
	public void promocionPorPaqueteCompleto() {
		if(Usuario.comprarPaqueteCompleto()) {this.costo = costoPaqueteCompleto;}
	}
		
	
}

